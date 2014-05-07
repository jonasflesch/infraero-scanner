
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarVoosNumeroIcao_QNAME = new QName("http://tempuri.org/", "icao");
    private final static QName _ConsultarVoosNumeroNumeroVoo_QNAME = new QName("http://tempuri.org/", "numeroVoo");
    private final static QName _ConsultarVoosNumeroIdioma_QNAME = new QName("http://tempuri.org/", "idioma");
    private final static QName _ConsultarVoosNumeroResponseConsultarVoosNumeroResult_QNAME = new QName("http://tempuri.org/", "ConsultarVoosNumeroResult");
    private final static QName _ListarAeroportosResponseListarAeroportosResult_QNAME = new QName("http://tempuri.org/", "ListarAeroportosResult");
    private final static QName _ListarCompanhiasResponseListarCompanhiasResult_QNAME = new QName("http://tempuri.org/", "ListarCompanhiasResult");
    private final static QName _ConsultarVoosCiaAereaSiglaCiaAerea_QNAME = new QName("http://tempuri.org/", "siglaCiaAerea");
    private final static QName _ConsultarVoosSentidoResponseConsultarVoosSentidoResult_QNAME = new QName("http://tempuri.org/", "ConsultarVoosSentidoResult");
    private final static QName _ConsultarVoosCiaAereaResponseConsultarVoosCiaAereaResult_QNAME = new QName("http://tempuri.org/", "ConsultarVoosCiaAereaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarVoosCiaAerea }
     * 
     */
    public ConsultarVoosCiaAerea createConsultarVoosCiaAerea() {
        return new ConsultarVoosCiaAerea();
    }

    /**
     * Create an instance of {@link ConsultarVoosNumeroResponse }
     * 
     */
    public ConsultarVoosNumeroResponse createConsultarVoosNumeroResponse() {
        return new ConsultarVoosNumeroResponse();
    }

    /**
     * Create an instance of {@link ConsultarVoosSentidoResponse }
     * 
     */
    public ConsultarVoosSentidoResponse createConsultarVoosSentidoResponse() {
        return new ConsultarVoosSentidoResponse();
    }

    /**
     * Create an instance of {@link ListarAeroportosResponse }
     * 
     */
    public ListarAeroportosResponse createListarAeroportosResponse() {
        return new ListarAeroportosResponse();
    }

    /**
     * Create an instance of {@link ListarAeroportos }
     * 
     */
    public ListarAeroportos createListarAeroportos() {
        return new ListarAeroportos();
    }

    /**
     * Create an instance of {@link ConsultarVoosNumero }
     * 
     */
    public ConsultarVoosNumero createConsultarVoosNumero() {
        return new ConsultarVoosNumero();
    }

    /**
     * Create an instance of {@link ListarCompanhias }
     * 
     */
    public ListarCompanhias createListarCompanhias() {
        return new ListarCompanhias();
    }

    /**
     * Create an instance of {@link ListarCompanhiasResponse }
     * 
     */
    public ListarCompanhiasResponse createListarCompanhiasResponse() {
        return new ListarCompanhiasResponse();
    }

    /**
     * Create an instance of {@link ConsultarVoosCiaAereaResponse }
     * 
     */
    public ConsultarVoosCiaAereaResponse createConsultarVoosCiaAereaResponse() {
        return new ConsultarVoosCiaAereaResponse();
    }

    /**
     * Create an instance of {@link ConsultarVoosSentido }
     * 
     */
    public ConsultarVoosSentido createConsultarVoosSentido() {
        return new ConsultarVoosSentido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "icao", scope = ConsultarVoosNumero.class)
    public JAXBElement<String> createConsultarVoosNumeroIcao(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIcao_QNAME, String.class, ConsultarVoosNumero.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroVoo", scope = ConsultarVoosNumero.class)
    public JAXBElement<String> createConsultarVoosNumeroNumeroVoo(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroNumeroVoo_QNAME, String.class, ConsultarVoosNumero.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idioma", scope = ConsultarVoosNumero.class)
    public JAXBElement<String> createConsultarVoosNumeroIdioma(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIdioma_QNAME, String.class, ConsultarVoosNumero.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarVoosNumeroResult", scope = ConsultarVoosNumeroResponse.class)
    public JAXBElement<String> createConsultarVoosNumeroResponseConsultarVoosNumeroResult(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroResponseConsultarVoosNumeroResult_QNAME, String.class, ConsultarVoosNumeroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListarAeroportosResult", scope = ListarAeroportosResponse.class)
    public JAXBElement<String> createListarAeroportosResponseListarAeroportosResult(String value) {
        return new JAXBElement<String>(_ListarAeroportosResponseListarAeroportosResult_QNAME, String.class, ListarAeroportosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "icao", scope = ListarCompanhias.class)
    public JAXBElement<String> createListarCompanhiasIcao(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIcao_QNAME, String.class, ListarCompanhias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idioma", scope = ListarCompanhias.class)
    public JAXBElement<String> createListarCompanhiasIdioma(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIdioma_QNAME, String.class, ListarCompanhias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListarCompanhiasResult", scope = ListarCompanhiasResponse.class)
    public JAXBElement<String> createListarCompanhiasResponseListarCompanhiasResult(String value) {
        return new JAXBElement<String>(_ListarCompanhiasResponseListarCompanhiasResult_QNAME, String.class, ListarCompanhiasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "icao", scope = ConsultarVoosCiaAerea.class)
    public JAXBElement<String> createConsultarVoosCiaAereaIcao(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIcao_QNAME, String.class, ConsultarVoosCiaAerea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "siglaCiaAerea", scope = ConsultarVoosCiaAerea.class)
    public JAXBElement<String> createConsultarVoosCiaAereaSiglaCiaAerea(String value) {
        return new JAXBElement<String>(_ConsultarVoosCiaAereaSiglaCiaAerea_QNAME, String.class, ConsultarVoosCiaAerea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idioma", scope = ConsultarVoosCiaAerea.class)
    public JAXBElement<String> createConsultarVoosCiaAereaIdioma(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIdioma_QNAME, String.class, ConsultarVoosCiaAerea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarVoosSentidoResult", scope = ConsultarVoosSentidoResponse.class)
    public JAXBElement<String> createConsultarVoosSentidoResponseConsultarVoosSentidoResult(String value) {
        return new JAXBElement<String>(_ConsultarVoosSentidoResponseConsultarVoosSentidoResult_QNAME, String.class, ConsultarVoosSentidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarVoosCiaAereaResult", scope = ConsultarVoosCiaAereaResponse.class)
    public JAXBElement<String> createConsultarVoosCiaAereaResponseConsultarVoosCiaAereaResult(String value) {
        return new JAXBElement<String>(_ConsultarVoosCiaAereaResponseConsultarVoosCiaAereaResult_QNAME, String.class, ConsultarVoosCiaAereaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idioma", scope = ListarAeroportos.class)
    public JAXBElement<String> createListarAeroportosIdioma(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIdioma_QNAME, String.class, ListarAeroportos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "icao", scope = ConsultarVoosSentido.class)
    public JAXBElement<String> createConsultarVoosSentidoIcao(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIcao_QNAME, String.class, ConsultarVoosSentido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idioma", scope = ConsultarVoosSentido.class)
    public JAXBElement<String> createConsultarVoosSentidoIdioma(String value) {
        return new JAXBElement<String>(_ConsultarVoosNumeroIdioma_QNAME, String.class, ConsultarVoosSentido.class, value);
    }

}
