package com.jonasflesch.parser;

import org.springframework.stereotype.Component;
import org.tempuri.ConsultaVoos;

@Component
public class XmlRetriever {
	
	public String getXmlSalgadoFilho(){
		ConsultaVoos consultaVoos = new ConsultaVoos();
    	return consultaVoos.getSrv().consultarVoosSentido("SBPA", "bra", true, true, 10000, 1);
	}
	
}
