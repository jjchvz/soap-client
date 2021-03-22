//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.21 a las 10:42:54 AM VET 
//


package com.sap.app.ncg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultantReadByIDResponseMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantReadByIDResponseMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consultant" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantReadByIDResponse" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantReadByIDResponseMessage_sync", propOrder = {
    "consultant",
    "log"
})
public class ConsultantReadByIDResponseMessageSync {

    @XmlElement(name = "Consultant")
    protected ConsultantReadByIDResponse consultant;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Obtiene el valor de la propiedad consultant.
     * 
     * @return
     *     possible object is
     *     {@link ConsultantReadByIDResponse }
     *     
     */
    public ConsultantReadByIDResponse getConsultant() {
        return consultant;
    }

    /**
     * Define el valor de la propiedad consultant.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultantReadByIDResponse }
     *     
     */
    public void setConsultant(ConsultantReadByIDResponse value) {
        this.consultant = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
