package com.jonasflesch.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VooXml {

	@XmlElement(name = "NUM_VOO")
	private Integer numeroVoo;

	@XmlElement(name = "DAT_VOO")
	private String dataVoo;

	@XmlElement(name = "TXT_OBS")
	private String status;

	@XmlElement(name = "NOM_CIA")
	private String nomeCompanhiaAerea;

	@XmlElement(name = "SIG_CIA_AEREA")
	private String siglaCompanhiaAerea;

	public String getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Integer getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(Integer numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

}
