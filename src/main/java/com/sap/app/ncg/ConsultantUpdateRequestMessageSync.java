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
 * <p>Clase Java para ConsultantUpdateRequestMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantUpdateRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader"/&gt;
 *         &lt;element name="Consultant" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantUpdateRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantUpdateRequestMessage_sync", propOrder = {
    "basicMessageHeader",
    "consultant"
})
public class ConsultantUpdateRequestMessageSync {

    @XmlElement(name = "BasicMessageHeader", required = true)
    protected BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "Consultant", required = true)
    protected ConsultantUpdateRequest consultant;

    /**
     * Obtiene el valor de la propiedad basicMessageHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * Define el valor de la propiedad basicMessageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public void setBasicMessageHeader(BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad consultant.
     * 
     * @return
     *     possible object is
     *     {@link ConsultantUpdateRequest }
     *     
     */
    public ConsultantUpdateRequest getConsultant() {
        return consultant;
    }

    /**
     * Define el valor de la propiedad consultant.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultantUpdateRequest }
     *     
     */
    public void setConsultant(ConsultantUpdateRequest value) {
        this.consultant = value;
    }

}
