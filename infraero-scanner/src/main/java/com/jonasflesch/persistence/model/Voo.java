package com.jonasflesch.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.jonasflesch.bean.VooXml;

@Entity
@SequenceGenerator(name = "VOO_SEQ", initialValue = 1)
public class Voo implements Serializable {

	private static final long serialVersionUID = 4578220685609090258L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOO_SEQ")
	private Long idVoo;

	private Integer numeroVoo;

	private String dataVoo;

	private String nomeCompanhiaAerea;

	private String siglaCompanhiaAerea;

	@OneToMany(mappedBy = "voo", cascade = CascadeType.ALL)
	private List<VooStatus> vooStatus;

	public Voo() {
	}

	public Voo(VooXml vooXml) {
		this.numeroVoo = Integer.valueOf(vooXml.getNumeroVoo());
		this.dataVoo = vooXml.getDataVoo();
		this.nomeCompanhiaAerea = vooXml.getNomeCompanhiaAerea();
		this.siglaCompanhiaAerea = vooXml.getSiglaCompanhiaAerea();
	}

	public Long getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(Long idVoo) {
		this.idVoo = idVoo;
	}

	public Integer getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(Integer numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public String getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}

	public String getNomeCompanhiaAerea() {
		return nomeCompanhiaAerea;
	}

	public void setNomeCompanhiaAerea(String nomeCompanhiaAerea) {
		this.nomeCompanhiaAerea = nomeCompanhiaAerea;
	}

	public String getSiglaCompanhiaAerea() {
		return siglaCompanhiaAerea;
	}

	public void setSiglaCompanhiaAerea(String siglaCompanhiaAerea) {
		this.siglaCompanhiaAerea = siglaCompanhiaAerea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<VooStatus> getVooStatus() {
		return vooStatus;
	}

	public void setVooStatus(List<VooStatus> vooStatus) {
		this.vooStatus = vooStatus;
	}

	public void addVooStatus(VooStatus vooStatusItem) {
		if (vooStatus == null) {
			vooStatus = new ArrayList<VooStatus>();
		}
		vooStatus.add(vooStatusItem);
	}

}
