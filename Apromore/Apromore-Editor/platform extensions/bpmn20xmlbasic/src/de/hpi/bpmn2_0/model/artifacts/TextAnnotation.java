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

package de.hpi.bpmn2_0.model.artifacts;

import de.hpi.bpmn2_0.transformation.Visitor;
import de.hpi.bpmn2_0.util.EscapingStringAdapter;

import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tTextAnnotation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tTextAnnotation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/bpmn20}tArtifact">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/bpmn20}text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTextAnnotation", propOrder = {
        "text",
        "textFormat"
})
public class TextAnnotation
        extends Artifact {

    @XmlElement
    @XmlJavaTypeAdapter(EscapingStringAdapter.class)
    protected String text;
    @XmlAttribute
    @XmlJavaTypeAdapter(EscapingStringAdapter.class)
    protected String textFormat;

    public void acceptVisitor(Visitor v) {
        v.visitTextAnnotation(this);
    }

    /**
     * The {@link Marshaller} invokes this method right before marshaling to
     * XML. It secures that the name attribute is removed from the text annotation
     * element.
     *
     * @param marshaller The marshaling context
     */
    public void beforeMarshal(Marshaller marshaller) {
        /*
           * empty the name element
           */
        this.name = null;
    }

    /* Getter & Setter */

    /**
     * Gets the value of the text property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getText() {
        return text;
    }

    public String getTextFormat() {
        return textFormat;
    }

    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
    }

}
