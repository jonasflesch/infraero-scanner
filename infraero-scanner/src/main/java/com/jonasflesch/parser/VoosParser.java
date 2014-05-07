package com.jonasflesch.parser;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.jonasflesch.bean.VooXml;
import com.jonasflesch.bean.Voos;

@Component
public class VoosParser {

	private final Log LOGGER = LogFactory.getLog(VoosParser.class);

	public List<VooXml> parse(String xml) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Voos.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Voos voos = (Voos) jaxbUnmarshaller.unmarshal(new StringReader(xml));
			LOGGER.info(voos);
			return voos.getVoos();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
