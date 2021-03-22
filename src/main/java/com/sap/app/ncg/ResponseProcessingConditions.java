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
 * <p>Clase Java para ResponseProcessingConditions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseProcessingConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnedQueryHitsNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue"/&gt;
 *         &lt;element name="MoreHitsAvailableIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
 *         &lt;element name="LastReturnedObjectID" type="{http://sap.com/xi/AP/Common/GDT}ObjectID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessingConditions", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "returnedQueryHitsNumberValue",
    "moreHitsAvailableIndicator",
    "lastReturnedObjectID"
})
public class ResponseProcessingConditions {

    @XmlElement(name = "ReturnedQueryHitsNumberValue")
    protected int returnedQueryHitsNumberValue;
    @XmlElement(name = "MoreHitsAvailableIndicator")
    protected boolean moreHitsAvailableIndicator;
    @XmlElement(name = "LastReturnedObjectID")
    protected ObjectID lastReturnedObjectID;

    /**
     * Obtiene el valor de la propiedad returnedQueryHitsNumberValue.
     * 
     */
    public int getReturnedQueryHitsNumberValue() {
        return returnedQueryHitsNumberValue;
    }

    /**
     * Define el valor de la propiedad returnedQueryHitsNumberValue.
     * 
     */
    public void setReturnedQueryHitsNumberValue(int value) {
        this.returnedQueryHitsNumberValue = value;
    }

    /**
     * Obtiene el valor de la propiedad moreHitsAvailableIndicator.
     * 
     */
    public boolean isMoreHitsAvailableIndicator() {
        return moreHitsAvailableIndicator;
    }

    /**
     * Define el valor de la propiedad moreHitsAvailableIndicator.
     * 
     */
    public void setMoreHitsAvailableIndicator(boolean value) {
        this.moreHitsAvailableIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad lastReturnedObjectID.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLastReturnedObjectID() {
        return lastReturnedObjectID;
    }

    /**
     * Define el valor de la propiedad lastReturnedObjectID.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLastReturnedObjectID(ObjectID value) {
        this.lastReturnedObjectID = value;
    }

}
