package com.jonasflesch.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VOOS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Voos {
	
	@XmlElement(name = "VOO")
	private List<VooXml> voos;

	public List<VooXml> getVoos() {
		return voos;
	}

	public void setVoos(List<VooXml> voos) {
		this.voos = voos;
	}

}
