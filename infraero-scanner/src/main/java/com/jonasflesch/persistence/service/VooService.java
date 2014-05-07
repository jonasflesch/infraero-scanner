package com.jonasflesch.persistence.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonasflesch.bean.VooXml;
import com.jonasflesch.parser.VoosParser;
import com.jonasflesch.parser.XmlRetriever;
import com.jonasflesch.persistence.dao.IVooDao;
import com.jonasflesch.persistence.model.Voo;
import com.jonasflesch.persistence.model.VooStatus;
import com.jonasflesch.start.Starter;

@Service
@Transactional
public class VooService {

	private final Log LOGGER = LogFactory.getLog(Starter.class);

	@Autowired
	private IVooDao dao;

	@Autowired
	private XmlRetriever xmlRetriever;

	@Autowired
	private VoosParser voosParser;

	@Scheduled(fixedDelay = 10000, initialDelay = 20000)
	public void buscaNovidades() {
		String xml = xmlRetriever.getXmlSalgadoFilho();
		LOGGER.info(xml);
		List<VooXml> voosXml = voosParser.parse(xml);

		for (VooXml vooXml : voosXml) {
			LOGGER.info("Processando voo " + vooXml.getNumeroVoo() + " com status " + vooXml.getStatus());

			buscaOuCriaVoo(vooXml);
		}
		LOGGER.info("TERMINOU BUSCANOVIDADES");
	}

	private void buscaOuCriaVoo(VooXml vooXml) {
		Voo voo = dao.findByDataENumero(vooXml.getDataVoo(), vooXml.getNumeroVoo());

		if (voo == null) {
			voo = criaVoo(vooXml);
			dao.saveVoo(voo);
		} else {
			adicionaStatus(vooXml, voo);
		}
	}

	private void adicionaStatus(VooXml vooXml, Voo voo) {
		boolean jaTemStatus = false;
		for (VooStatus vooStatus : voo.getVooStatus()) {
			if (vooStatus.getDescricao().equals(vooXml.getStatus())) {
				jaTemStatus = true;
				break;
			}
		}
		if (!jaTemStatus) {
			VooStatus vooStatus = new VooStatus();
			vooStatus.setData(new Date());
			vooStatus.setDescricao(vooXml.getStatus());
			vooStatus.setVoo(voo);
			voo.addVooStatus(vooStatus);
			dao.saveVoo(voo);
		}
	}

	private Voo criaVoo(VooXml vooXml) {
		Voo voo;
		voo = new Voo(vooXml);
		VooStatus vooStatus = new VooStatus();
		vooStatus.setData(new Date());
		vooStatus.setDescricao(vooXml.getStatus());
		vooStatus.setVoo(voo);
		voo.addVooStatus(vooStatus);
		return voo;
	}

}
