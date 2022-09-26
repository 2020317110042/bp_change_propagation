/*
 * Copyright © 2009-2014 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.03 at 05:04:23 PM CET 
//

package org.yawlfoundation.yawlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CustomSchemaNamespaceMappingFactsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSchemaNamespaceMappingFactsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}CustomSchemaNamespaceMappingType">
 *       &lt;sequence>
 *         &lt;element name="expandsTo" type="{http://www.yawlfoundation.org/yawlschema}URIType"/>
 *         &lt;element name="definedAt" type="{http://www.yawlfoundation.org/yawlschema}URIType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSchemaNamespaceMappingFactsType", propOrder = {
		"expandsTo", "definedAt" })
public class CustomSchemaNamespaceMappingFactsType extends
		CustomSchemaNamespaceMappingType {

	@XmlElement(required = true)
	protected String expandsTo;
	@XmlElement(required = true)
	protected String definedAt;

	/**
	 * Gets the value of the expandsTo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpandsTo() {
		return expandsTo;
	}

	/**
	 * Sets the value of the expandsTo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpandsTo(String value) {
		this.expandsTo = value;
	}

	/**
	 * Gets the value of the definedAt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefinedAt() {
		return definedAt;
	}

	/**
	 * Sets the value of the definedAt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefinedAt(String value) {
		this.definedAt = value;
	}

}
