
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partida" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exibirFinalizados" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registrosPagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "icao",
    "idioma",
    "partida",
    "exibirFinalizados",
    "registrosPagina",
    "pagina"
})
@XmlRootElement(name = "ConsultarVoosSentido")
public class ConsultarVoosSentido {

    @XmlElementRef(name = "icao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icao;
    @XmlElementRef(name = "idioma", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idioma;
    protected Boolean partida;
    protected Boolean exibirFinalizados;
    protected Integer registrosPagina;
    protected Integer pagina;

    /**
     * Gets the value of the icao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcao() {
        return icao;
    }

    /**
     * Sets the value of the icao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcao(JAXBElement<String> value) {
        this.icao = value;
    }

    /**
     * Gets the value of the idioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdioma() {
        return idioma;
    }

    /**
     * Sets the value of the idioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdioma(JAXBElement<String> value) {
        this.idioma = value;
    }

    /**
     * Gets the value of the partida property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartida() {
        return partida;
    }

    /**
     * Sets the value of the partida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartida(Boolean value) {
        this.partida = value;
    }

    /**
     * Gets the value of the exibirFinalizados property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExibirFinalizados() {
        return exibirFinalizados;
    }

    /**
     * Sets the value of the exibirFinalizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExibirFinalizados(Boolean value) {
        this.exibirFinalizados = value;
    }

    /**
     * Gets the value of the registrosPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistrosPagina() {
        return registrosPagina;
    }

    /**
     * Sets the value of the registrosPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistrosPagina(Integer value) {
        this.registrosPagina = value;
    }

    /**
     * Gets the value of the pagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagina() {
        return pagina;
    }

    /**
     * Sets the value of the pagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagina(Integer value) {
        this.pagina = value;
    }

}
