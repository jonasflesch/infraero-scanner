
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConsultaVoos", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://voos.infraero.gov.br/wsvoosmobile/ConsultaVoos.svc?wsdl")
public class ConsultaVoos
    extends Service
{

    private final static URL CONSULTAVOOS_WSDL_LOCATION;
    private final static WebServiceException CONSULTAVOOS_EXCEPTION;
    private final static QName CONSULTAVOOS_QNAME = new QName("http://tempuri.org/", "ConsultaVoos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://voos.infraero.gov.br/wsvoosmobile/ConsultaVoos.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAVOOS_WSDL_LOCATION = url;
        CONSULTAVOOS_EXCEPTION = e;
    }

    public ConsultaVoos() {
        super(__getWsdlLocation(), CONSULTAVOOS_QNAME);
    }

    public ConsultaVoos(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAVOOS_QNAME, features);
    }

    public ConsultaVoos(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAVOOS_QNAME);
    }

    public ConsultaVoos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAVOOS_QNAME, features);
    }

    public ConsultaVoos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaVoos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IConsultaVoos
     */
    @WebEndpoint(name = "Srv")
    public IConsultaVoos getSrv() {
        return super.getPort(new QName("http://tempuri.org/", "Srv"), IConsultaVoos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConsultaVoos
     */
    @WebEndpoint(name = "Srv")
    public IConsultaVoos getSrv(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "Srv"), IConsultaVoos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAVOOS_EXCEPTION!= null) {
            throw CONSULTAVOOS_EXCEPTION;
        }
        return CONSULTAVOOS_WSDL_LOCATION;
    }

}
