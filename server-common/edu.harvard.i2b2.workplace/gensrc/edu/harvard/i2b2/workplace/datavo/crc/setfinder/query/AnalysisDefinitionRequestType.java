//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 06:43:58 PM UTC 
//


package edu.harvard.i2b2.workplace.datavo.crc.setfinder.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for analysis_definition_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="analysis_definition_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="analysis_definition" type="{http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/}analysis_definitionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analysis_definition_requestType", propOrder = {
    "analysisDefinition"
})
public class AnalysisDefinitionRequestType
    extends RequestType
{

    @XmlElement(name = "analysis_definition", required = true)
    protected AnalysisDefinitionType analysisDefinition;

    /**
     * Gets the value of the analysisDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisDefinitionType }
     *     
     */
    public AnalysisDefinitionType getAnalysisDefinition() {
        return analysisDefinition;
    }

    /**
     * Sets the value of the analysisDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisDefinitionType }
     *     
     */
    public void setAnalysisDefinition(AnalysisDefinitionType value) {
        this.analysisDefinition = value;
    }

}