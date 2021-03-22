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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para ConsultantQueryByElementsSimpleByRequestSelectionByName complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantQueryByElementsSimpleByRequestSelectionByName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryName" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryName" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantQueryByElementsSimpleByRequestSelectionByName", propOrder = {
    "inclusionExclusionCode",
    "intervalBoundaryTypeCode",
    "lowerBoundaryName",
    "upperBoundaryName"
})
public class ConsultantQueryByElementsSimpleByRequestSelectionByName {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryName")
    protected MEDIUMDescription lowerBoundaryName;
    @XmlElement(name = "UpperBoundaryName")
    protected MEDIUMDescription upperBoundaryName;

    /**
     * Obtiene el valor de la propiedad inclusionExclusionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionExclusionCode() {
        return inclusionExclusionCode;
    }

    /**
     * Define el valor de la propiedad inclusionExclusionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionExclusionCode(String value) {
        this.inclusionExclusionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad intervalBoundaryTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * Define el valor de la propiedad intervalBoundaryTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalBoundaryTypeCode(String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad lowerBoundaryName.
     * 
     * @return
     *     possible object is
     *     {@link MEDIUMDescription }
     *     
     */
    public MEDIUMDescription getLowerBoundaryName() {
        return lowerBoundaryName;
    }

    /**
     * Define el valor de la propiedad lowerBoundaryName.
     * 
     * @param value
     *     allowed object is
     *     {@link MEDIUMDescription }
     *     
     */
    public void setLowerBoundaryName(MEDIUMDescription value) {
        this.lowerBoundaryName = value;
    }

    /**
     * Obtiene el valor de la propiedad upperBoundaryName.
     * 
     * @return
     *     possible object is
     *     {@link MEDIUMDescription }
     *     
     */
    public MEDIUMDescription getUpperBoundaryName() {
        return upperBoundaryName;
    }

    /**
     * Define el valor de la propiedad upperBoundaryName.
     * 
     * @param value
     *     allowed object is
     *     {@link MEDIUMDescription }
     *     
     */
    public void setUpperBoundaryName(MEDIUMDescription value) {
        this.upperBoundaryName = value;
    }

}
