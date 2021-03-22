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
 * <p>Clase Java para ConsultantReadByIDQueryMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantReadByIDQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consultant" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantReadByIDQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantReadByIDQueryMessage_sync", propOrder = {
    "consultant"
})
public class ConsultantReadByIDQueryMessageSync {

    @XmlElement(name = "Consultant", required = true)
    protected ConsultantReadByIDQuery consultant;

    /**
     * Obtiene el valor de la propiedad consultant.
     * 
     * @return
     *     possible object is
     *     {@link ConsultantReadByIDQuery }
     *     
     */
    public ConsultantReadByIDQuery getConsultant() {
        return consultant;
    }

    /**
     * Define el valor de la propiedad consultant.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultantReadByIDQuery }
     *     
     */
    public void setConsultant(ConsultantReadByIDQuery value) {
        this.consultant = value;
    }

}
