//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.21 a las 10:42:54 AM VET 
//


package com.sap.app.ncg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultantQueryByElementsSimpleByRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultantQueryByElementsSimpleByRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByid" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByName" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastName" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByLastName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLocation" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStatus" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreationOn" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByCreationOn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedBy" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByCreatedBy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByChangedOn" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByChangedOn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByChangedBy" type="{http://0023931702-one-off.sap.com/Y13IOD93Y_}ConsultantQueryByElementsSimpleByRequestSelectionByChangedBy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultantQueryByElementsSimpleByRequest", propOrder = {
    "selectionByid",
    "selectionByName",
    "selectionByLastName",
    "selectionByLocation",
    "selectionByStatus",
    "selectionByCreationOn",
    "selectionByCreatedBy",
    "selectionByChangedOn",
    "selectionByChangedBy"
})
public class ConsultantQueryByElementsSimpleByRequest {

    @XmlElement(name = "SelectionByid")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByid> selectionByid;
    @XmlElement(name = "SelectionByName")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByName> selectionByName;
    @XmlElement(name = "SelectionByLastName")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByLastName> selectionByLastName;
    @XmlElement(name = "SelectionByLocation")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByLocation> selectionByLocation;
    @XmlElement(name = "SelectionByStatus")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByStatus> selectionByStatus;
    @XmlElement(name = "SelectionByCreationOn")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByCreationOn> selectionByCreationOn;
    @XmlElement(name = "SelectionByCreatedBy")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByCreatedBy> selectionByCreatedBy;
    @XmlElement(name = "SelectionByChangedOn")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByChangedOn> selectionByChangedOn;
    @XmlElement(name = "SelectionByChangedBy")
    protected List<ConsultantQueryByElementsSimpleByRequestSelectionByChangedBy> selectionByChangedBy;

    /**
     * Gets the value of the selectionByid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByid }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByid> getSelectionByid() {
        if (selectionByid == null) {
            selectionByid = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByid>();
        }
        return this.selectionByid;
    }

    /**
     * Gets the value of the selectionByName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByName }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByName> getSelectionByName() {
        if (selectionByName == null) {
            selectionByName = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByName>();
        }
        return this.selectionByName;
    }

    /**
     * Gets the value of the selectionByLastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByLastName }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByLastName> getSelectionByLastName() {
        if (selectionByLastName == null) {
            selectionByLastName = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByLastName>();
        }
        return this.selectionByLastName;
    }

    /**
     * Gets the value of the selectionByLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByLocation }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByLocation> getSelectionByLocation() {
        if (selectionByLocation == null) {
            selectionByLocation = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByLocation>();
        }
        return this.selectionByLocation;
    }

    /**
     * Gets the value of the selectionByStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByStatus }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByStatus> getSelectionByStatus() {
        if (selectionByStatus == null) {
            selectionByStatus = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByStatus>();
        }
        return this.selectionByStatus;
    }

    /**
     * Gets the value of the selectionByCreationOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreationOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreationOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByCreationOn }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByCreationOn> getSelectionByCreationOn() {
        if (selectionByCreationOn == null) {
            selectionByCreationOn = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByCreationOn>();
        }
        return this.selectionByCreationOn;
    }

    /**
     * Gets the value of the selectionByCreatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByCreatedBy }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByCreatedBy> getSelectionByCreatedBy() {
        if (selectionByCreatedBy == null) {
            selectionByCreatedBy = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByCreatedBy>();
        }
        return this.selectionByCreatedBy;
    }

    /**
     * Gets the value of the selectionByChangedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByChangedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByChangedOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByChangedOn }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByChangedOn> getSelectionByChangedOn() {
        if (selectionByChangedOn == null) {
            selectionByChangedOn = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByChangedOn>();
        }
        return this.selectionByChangedOn;
    }

    /**
     * Gets the value of the selectionByChangedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByChangedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByChangedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultantQueryByElementsSimpleByRequestSelectionByChangedBy }
     * 
     * 
     */
    public List<ConsultantQueryByElementsSimpleByRequestSelectionByChangedBy> getSelectionByChangedBy() {
        if (selectionByChangedBy == null) {
            selectionByChangedBy = new ArrayList<ConsultantQueryByElementsSimpleByRequestSelectionByChangedBy>();
        }
        return this.selectionByChangedBy;
    }

}
