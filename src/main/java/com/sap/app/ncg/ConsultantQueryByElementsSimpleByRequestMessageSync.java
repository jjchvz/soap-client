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
 * <p>Clase Java para ConsultantQueryByElementsSimpleByRequestMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantQueryByElementsSimpleByRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultantSimpleSelectionBy" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequest"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantQueryByElementsSimpleByRequestMessage_sync", propOrder = {
    "consultantSimpleSelectionBy",
    "processingConditions"
})
public class ConsultantQueryByElementsSimpleByRequestMessageSync {

    @XmlElement(name = "ConsultantSimpleSelectionBy", required = true)
    protected ConsultantQueryByElementsSimpleByRequest consultantSimpleSelectionBy;
    @XmlElement(name = "ProcessingConditions", required = true)
    protected QueryProcessingConditions processingConditions;

    /**
     * Obtiene el valor de la propiedad consultantSimpleSelectionBy.
     * 
     * @return
     *     possible object is
     *     {@link ConsultantQueryByElementsSimpleByRequest }
     *     
     */
    public ConsultantQueryByElementsSimpleByRequest getConsultantSimpleSelectionBy() {
        return consultantSimpleSelectionBy;
    }

    /**
     * Define el valor de la propiedad consultantSimpleSelectionBy.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultantQueryByElementsSimpleByRequest }
     *     
     */
    public void setConsultantSimpleSelectionBy(ConsultantQueryByElementsSimpleByRequest value) {
        this.consultantSimpleSelectionBy = value;
    }

    /**
     * Obtiene el valor de la propiedad processingConditions.
     * 
     * @return
     *     possible object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * Define el valor de la propiedad processingConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public void setProcessingConditions(QueryProcessingConditions value) {
        this.processingConditions = value;
    }

}
