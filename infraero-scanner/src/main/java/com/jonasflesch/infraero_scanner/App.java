package com.jonasflesch.infraero_scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.tempuri.ConsultaVoos;
import org.w3c.dom.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConsultaVoos consultaVoos = new ConsultaVoos();
    	String xml = consultaVoos.getSrv().consultarVoosSentido("SBPA", "bra", true, true, 10000, 1);
    	System.out.println(xml);
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//    	Document doc = dBuilder.parse(xml);
    }
}
