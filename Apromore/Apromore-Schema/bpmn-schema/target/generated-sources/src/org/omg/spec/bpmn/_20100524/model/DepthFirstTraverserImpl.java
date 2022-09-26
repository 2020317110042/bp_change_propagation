//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.JAXBElement;
import com.processconfiguration.Configurable;
import com.processconfiguration.ConfigurationAnnotation;
import com.processconfiguration.ConfigurationAnnotationAssociation;
import com.processconfiguration.ConfigurationAnnotationShape;
import com.processconfiguration.ConfigurationMapping;
import com.processconfiguration.Variants;
import com.signavio.SignavioMetaData;
import org.omg.spec.bpmn._20100524.di.BPMNDiagram;
import org.omg.spec.bpmn._20100524.di.BPMNEdge;
import org.omg.spec.bpmn._20100524.di.BPMNLabel;
import org.omg.spec.bpmn._20100524.di.BPMNLabelStyle;
import org.omg.spec.bpmn._20100524.di.BPMNPlane;
import org.omg.spec.bpmn._20100524.di.BPMNShape;
import org.omg.spec.dd._20100524.dc.Bounds;
import org.omg.spec.dd._20100524.dc.Font;
import org.omg.spec.dd._20100524.dc.Point;
import org.omg.spec.dd._20100524.di.DiagramElement;

public class DepthFirstTraverserImpl
    implements Traverser
{


    public void traverse(Configurable aBean, Visitor aVisitor) {
        if (aBean.getConfiguration()!= null) {
            aBean.getConfiguration().accept(aVisitor);
        }
    }

    public void traverse(Configurable.Configuration aBean, Visitor aVisitor) {
        for (Object bean: aBean.getSourceRefs()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
        for (Object bean: aBean.getTargetRefs()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(ConfigurationAnnotation aBean, Visitor aVisitor) {
        for (ConfigurationAnnotation.Configuration bean: aBean.getConfiguration()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ConfigurationAnnotation.Configuration aBean, Visitor aVisitor) {
        if (aBean.getVariantRef() instanceof Visitable) {
            ((Visitable) aBean.getVariantRef()).accept(aVisitor);
        }
    }

    public void traverse(ConfigurationAnnotationAssociation aBean, Visitor aVisitor) {
        for (Point bean: aBean.getWaypoint()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(ConfigurationAnnotationShape aBean, Visitor aVisitor) {
        if (aBean.getBounds()!= null) {
            aBean.getBounds().accept(aVisitor);
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(ConfigurationMapping aBean, Visitor aVisitor) {
    }

    public void traverse(Variants aBean, Visitor aVisitor) {
        for (Variants.Variant bean: aBean.getVariant()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Variants.Variant aBean, Visitor aVisitor) {
    }

    public void traverse(SignavioMetaData aBean, Visitor aVisitor) {
    }

    public void traverse(BPMNDiagram aBean, Visitor aVisitor) {
        if (aBean.getBPMNPlane()!= null) {
            aBean.getBPMNPlane().accept(aVisitor);
        }
        for (BPMNLabelStyle bean: aBean.getBPMNLabelStyle()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(BPMNEdge aBean, Visitor aVisitor) {
        if (aBean.getBPMNLabel()!= null) {
            aBean.getBPMNLabel().accept(aVisitor);
        }
        for (Point bean: aBean.getWaypoint()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(BPMNLabel aBean, Visitor aVisitor) {
        if (aBean.getBounds()!= null) {
            aBean.getBounds().accept(aVisitor);
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(BPMNLabelStyle aBean, Visitor aVisitor) {
        if (aBean.getFont()!= null) {
            aBean.getFont().accept(aVisitor);
        }
    }

    public void traverse(BPMNPlane aBean, Visitor aVisitor) {
        for (JAXBElement<? extends DiagramElement> obj: aBean.getDiagramElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(BPMNShape aBean, Visitor aVisitor) {
        if (aBean.getBPMNLabel()!= null) {
            aBean.getBPMNLabel().accept(aVisitor);
        }
        if (aBean.getBounds()!= null) {
            aBean.getBounds().accept(aVisitor);
        }
        if (aBean.getExtension()!= null) {
            aBean.getExtension().accept(aVisitor);
        }
    }

    public void traverse(TAdHocSubProcess aBean, Visitor aVisitor) {
        if (aBean.getCompletionCondition()!= null) {
            aBean.getCompletionCondition().accept(aVisitor);
        }
        for (TLaneSet bean: aBean.getLaneSet()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TAssignment aBean, Visitor aVisitor) {
        if (aBean.getFrom()!= null) {
            aBean.getFrom().accept(aVisitor);
        }
        if (aBean.getTo()!= null) {
            aBean.getTo().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TAssociation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TAuditing aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TBoundaryEvent aBean, Visitor aVisitor) {
        for (TDataOutput bean: aBean.getDataOutput()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getOutputSet()!= null) {
            aBean.getOutputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TBusinessRuleTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCallActivity aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCallChoreography aBean, Visitor aVisitor) {
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCallConversation aBean, Visitor aVisitor) {
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCallableElement aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCancelEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCategory aBean, Visitor aVisitor) {
        for (TCategoryValue bean: aBean.getCategoryValue()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCategoryValue aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TChoreography aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TParticipant bean: aBean.getParticipant()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlow bean: aBean.getMessageFlow()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TConversationNode> obj: aBean.getConversationNode()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TConversationAssociation bean: aBean.getConversationAssociation()) {
            bean.accept(aVisitor);
        }
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlowAssociation bean: aBean.getMessageFlowAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TConversationLink bean: aBean.getConversationLink()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TChoreographyTask aBean, Visitor aVisitor) {
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCollaboration aBean, Visitor aVisitor) {
        for (TParticipant bean: aBean.getParticipant()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlow bean: aBean.getMessageFlow()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TConversationNode> obj: aBean.getConversationNode()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TConversationAssociation bean: aBean.getConversationAssociation()) {
            bean.accept(aVisitor);
        }
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlowAssociation bean: aBean.getMessageFlowAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TConversationLink bean: aBean.getConversationLink()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCompensateEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TComplexBehaviorDefinition aBean, Visitor aVisitor) {
        if (aBean.getCondition()!= null) {
            aBean.getCondition().accept(aVisitor);
        }
        if (aBean.getEvent()!= null) {
            aBean.getEvent().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TComplexGateway aBean, Visitor aVisitor) {
        if (aBean.getActivationCondition()!= null) {
            aBean.getActivationCondition().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TConditionalEventDefinition aBean, Visitor aVisitor) {
        if (aBean.getCondition()!= null) {
            aBean.getCondition().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TConversation aBean, Visitor aVisitor) {
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TConversationAssociation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TConversationLink aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCorrelationKey aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCorrelationProperty aBean, Visitor aVisitor) {
        for (TCorrelationPropertyRetrievalExpression bean: aBean.getCorrelationPropertyRetrievalExpression()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCorrelationPropertyBinding aBean, Visitor aVisitor) {
        if (aBean.getDataPath()!= null) {
            aBean.getDataPath().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCorrelationPropertyRetrievalExpression aBean, Visitor aVisitor) {
        if (aBean.getMessagePath()!= null) {
            aBean.getMessagePath().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TCorrelationSubscription aBean, Visitor aVisitor) {
        for (TCorrelationPropertyBinding bean: aBean.getCorrelationPropertyBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataAssociation aBean, Visitor aVisitor) {
        for (JAXBElement<Object> obj: aBean.getSourceRef()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        if (aBean.getTransformation()!= null) {
            aBean.getTransformation().accept(aVisitor);
        }
        for (TAssignment bean: aBean.getAssignment()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataInput aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataInputAssociation aBean, Visitor aVisitor) {
        for (JAXBElement<Object> obj: aBean.getSourceRef()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        if (aBean.getTransformation()!= null) {
            aBean.getTransformation().accept(aVisitor);
        }
        for (TAssignment bean: aBean.getAssignment()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataObject aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataObjectReference aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        if (aBean.getDataObjectRef() instanceof Visitable) {
            ((Visitable) aBean.getDataObjectRef()).accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataOutput aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataOutputAssociation aBean, Visitor aVisitor) {
        for (JAXBElement<Object> obj: aBean.getSourceRef()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        if (aBean.getTransformation()!= null) {
            aBean.getTransformation().accept(aVisitor);
        }
        for (TAssignment bean: aBean.getAssignment()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataState aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataStore aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDataStoreReference aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TDefinitions aBean, Visitor aVisitor) {
        for (TImport bean: aBean.getImport()) {
            bean.accept(aVisitor);
        }
        for (TExtension bean: aBean.getExtension()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TRootElement> obj: aBean.getRootElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (BPMNDiagram bean: aBean.getBPMNDiagram()) {
            bean.accept(aVisitor);
        }
        for (TRelationship bean: aBean.getRelationship()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(TDocumentation aBean, Visitor aVisitor) {
        for (Object bean: aBean.getContent()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(TEndEvent aBean, Visitor aVisitor) {
        for (TDataInput bean: aBean.getDataInput()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getInputSet()!= null) {
            aBean.getInputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TEndPoint aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TError aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TErrorEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TEscalation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TEscalationEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TEventBasedGateway aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TExclusiveGateway aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TExpression aBean, Visitor aVisitor) {
    }

    public void traverse(TExtension aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(TExtensionElements aBean, Visitor aVisitor) {
        for (Object bean: aBean.getAny()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(TFormalExpression aBean, Visitor aVisitor) {
    }

    public void traverse(TGateway aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalBusinessRuleTask aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalChoreographyTask aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TParticipant bean: aBean.getParticipant()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlow bean: aBean.getMessageFlow()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TConversationNode> obj: aBean.getConversationNode()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TConversationAssociation bean: aBean.getConversationAssociation()) {
            bean.accept(aVisitor);
        }
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlowAssociation bean: aBean.getMessageFlowAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TConversationLink bean: aBean.getConversationLink()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalConversation aBean, Visitor aVisitor) {
        for (TParticipant bean: aBean.getParticipant()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlow bean: aBean.getMessageFlow()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TConversationNode> obj: aBean.getConversationNode()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TConversationAssociation bean: aBean.getConversationAssociation()) {
            bean.accept(aVisitor);
        }
        for (TParticipantAssociation bean: aBean.getParticipantAssociation()) {
            bean.accept(aVisitor);
        }
        for (TMessageFlowAssociation bean: aBean.getMessageFlowAssociation()) {
            bean.accept(aVisitor);
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TConversationLink bean: aBean.getConversationLink()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalManualTask aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalScriptTask aBean, Visitor aVisitor) {
        if (aBean.getScript()!= null) {
            aBean.getScript().accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalTask aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGlobalUserTask aBean, Visitor aVisitor) {
        for (TRendering bean: aBean.getRendering()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TGroup aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(THumanPerformer aBean, Visitor aVisitor) {
        for (TResourceParameterBinding bean: aBean.getResourceParameterBinding()) {
            bean.accept(aVisitor);
        }
        if (aBean.getResourceAssignmentExpression()!= null) {
            aBean.getResourceAssignmentExpression().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TImplicitThrowEvent aBean, Visitor aVisitor) {
        for (TDataInput bean: aBean.getDataInput()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getInputSet()!= null) {
            aBean.getInputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TImport aBean, Visitor aVisitor) {
    }

    public void traverse(TInclusiveGateway aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TInputOutputBinding aBean, Visitor aVisitor) {
        if (aBean.getInputDataRef() instanceof Visitable) {
            ((Visitable) aBean.getInputDataRef()).accept(aVisitor);
        }
        if (aBean.getOutputDataRef() instanceof Visitable) {
            ((Visitable) aBean.getOutputDataRef()).accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TInputOutputSpecification aBean, Visitor aVisitor) {
        for (TDataInput bean: aBean.getDataInput()) {
            bean.accept(aVisitor);
        }
        for (TDataOutput bean: aBean.getDataOutput()) {
            bean.accept(aVisitor);
        }
        for (TInputSet bean: aBean.getInputSet()) {
            bean.accept(aVisitor);
        }
        for (TOutputSet bean: aBean.getOutputSet()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TInputSet aBean, Visitor aVisitor) {
        for (JAXBElement<Object> obj: aBean.getDataInputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getOptionalInputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getWhileExecutingInputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getOutputSetRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TInterface aBean, Visitor aVisitor) {
        for (TOperation bean: aBean.getOperation()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TIntermediateCatchEvent aBean, Visitor aVisitor) {
        for (TDataOutput bean: aBean.getDataOutput()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getOutputSet()!= null) {
            aBean.getOutputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TIntermediateThrowEvent aBean, Visitor aVisitor) {
        for (TDataInput bean: aBean.getDataInput()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getInputSet()!= null) {
            aBean.getInputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TItemDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TLane aBean, Visitor aVisitor) {
        if (aBean.getPartitionElement()!= null) {
            aBean.getPartitionElement().accept(aVisitor);
        }
        for (JAXBElement<Object> obj: aBean.getFlowNodeRef()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        if (aBean.getChildLaneSet()!= null) {
            aBean.getChildLaneSet().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TLaneSet aBean, Visitor aVisitor) {
        for (TLane bean: aBean.getLane()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TLinkEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TManualTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMessage aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMessageEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMessageFlow aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMessageFlowAssociation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMonitoring aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TMultiInstanceLoopCharacteristics aBean, Visitor aVisitor) {
        if (aBean.getLoopCardinality()!= null) {
            aBean.getLoopCardinality().accept(aVisitor);
        }
        if (aBean.getInputDataItem()!= null) {
            aBean.getInputDataItem().accept(aVisitor);
        }
        if (aBean.getOutputDataItem()!= null) {
            aBean.getOutputDataItem().accept(aVisitor);
        }
        for (TComplexBehaviorDefinition bean: aBean.getComplexBehaviorDefinition()) {
            bean.accept(aVisitor);
        }
        if (aBean.getCompletionCondition()!= null) {
            aBean.getCompletionCondition().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TOperation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TOutputSet aBean, Visitor aVisitor) {
        for (JAXBElement<Object> obj: aBean.getDataOutputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getOptionalOutputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getWhileExecutingOutputRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (JAXBElement<Object> obj: aBean.getInputSetRefs()) {
            if (obj.getValue() instanceof Visitable) {
                ((Visitable) obj.getValue()).accept(aVisitor);
            }
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TParallelGateway aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TParticipant aBean, Visitor aVisitor) {
        if (aBean.getParticipantMultiplicity()!= null) {
            aBean.getParticipantMultiplicity().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TParticipantAssociation aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TParticipantMultiplicity aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TPartnerEntity aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TPartnerRole aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TPerformer aBean, Visitor aVisitor) {
        for (TResourceParameterBinding bean: aBean.getResourceParameterBinding()) {
            bean.accept(aVisitor);
        }
        if (aBean.getResourceAssignmentExpression()!= null) {
            aBean.getResourceAssignmentExpression().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TPotentialOwner aBean, Visitor aVisitor) {
        for (TResourceParameterBinding bean: aBean.getResourceParameterBinding()) {
            bean.accept(aVisitor);
        }
        if (aBean.getResourceAssignmentExpression()!= null) {
            aBean.getResourceAssignmentExpression().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TProcess aBean, Visitor aVisitor) {
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TLaneSet bean: aBean.getLaneSet()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TCorrelationSubscription bean: aBean.getCorrelationSubscription()) {
            bean.accept(aVisitor);
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TInputOutputBinding bean: aBean.getIoBinding()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TProperty aBean, Visitor aVisitor) {
        if (aBean.getDataState()!= null) {
            aBean.getDataState().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TReceiveTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TRelationship aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TRendering aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TResource aBean, Visitor aVisitor) {
        for (TResourceParameter bean: aBean.getResourceParameter()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TResourceAssignmentExpression aBean, Visitor aVisitor) {
        if (aBean.getExpression()!= null) {
            aBean.getExpression().getValue().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TResourceParameter aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TResourceParameterBinding aBean, Visitor aVisitor) {
        if (aBean.getExpression()!= null) {
            aBean.getExpression().getValue().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TResourceRole aBean, Visitor aVisitor) {
        for (TResourceParameterBinding bean: aBean.getResourceParameterBinding()) {
            bean.accept(aVisitor);
        }
        if (aBean.getResourceAssignmentExpression()!= null) {
            aBean.getResourceAssignmentExpression().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TScript aBean, Visitor aVisitor) {
        for (Object bean: aBean.getContent()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(TScriptTask aBean, Visitor aVisitor) {
        if (aBean.getScript()!= null) {
            aBean.getScript().accept(aVisitor);
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSendTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSequenceFlow aBean, Visitor aVisitor) {
        if (aBean.getConditionExpression()!= null) {
            aBean.getConditionExpression().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TServiceTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSignal aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSignalEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TStandardLoopCharacteristics aBean, Visitor aVisitor) {
        if (aBean.getLoopCondition()!= null) {
            aBean.getLoopCondition().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TStartEvent aBean, Visitor aVisitor) {
        for (TDataOutput bean: aBean.getDataOutput()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getOutputSet()!= null) {
            aBean.getOutputSet().accept(aVisitor);
        }
        for (JAXBElement<? extends TEventDefinition> obj: aBean.getEventDefinition()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSubChoreography aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSubConversation aBean, Visitor aVisitor) {
        for (JAXBElement<? extends TConversationNode> obj: aBean.getConversationNode()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (TCorrelationKey bean: aBean.getCorrelationKey()) {
            bean.accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TSubProcess aBean, Visitor aVisitor) {
        for (TLaneSet bean: aBean.getLaneSet()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TTask aBean, Visitor aVisitor) {
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TTerminateEventDefinition aBean, Visitor aVisitor) {
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TText aBean, Visitor aVisitor) {
        for (Object bean: aBean.getContent()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(TTextAnnotation aBean, Visitor aVisitor) {
        if (aBean.getText()!= null) {
            aBean.getText().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TTimerEventDefinition aBean, Visitor aVisitor) {
        if (aBean.getTimeDate()!= null) {
            aBean.getTimeDate().accept(aVisitor);
        }
        if (aBean.getTimeDuration()!= null) {
            aBean.getTimeDuration().accept(aVisitor);
        }
        if (aBean.getTimeCycle()!= null) {
            aBean.getTimeCycle().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TTransaction aBean, Visitor aVisitor) {
        for (TLaneSet bean: aBean.getLaneSet()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TFlowElement> obj: aBean.getFlowElement()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        for (JAXBElement<? extends TArtifact> obj: aBean.getArtifact()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(TUserTask aBean, Visitor aVisitor) {
        for (TRendering bean: aBean.getRendering()) {
            bean.accept(aVisitor);
        }
        if (aBean.getIoSpecification()!= null) {
            aBean.getIoSpecification().accept(aVisitor);
        }
        for (TProperty bean: aBean.getProperty()) {
            bean.accept(aVisitor);
        }
        for (TDataInputAssociation bean: aBean.getDataInputAssociation()) {
            bean.accept(aVisitor);
        }
        for (TDataOutputAssociation bean: aBean.getDataOutputAssociation()) {
            bean.accept(aVisitor);
        }
        for (JAXBElement<? extends TResourceRole> obj: aBean.getResourceRole()) {
            if (obj.getValue()!= null) {
                obj.getValue().accept(aVisitor);
            }
        }
        if (aBean.getLoopCharacteristics()!= null) {
            aBean.getLoopCharacteristics().getValue().accept(aVisitor);
        }
        if (aBean.getAuditing()!= null) {
            aBean.getAuditing().accept(aVisitor);
        }
        if (aBean.getMonitoring()!= null) {
            aBean.getMonitoring().accept(aVisitor);
        }
        for (TDocumentation bean: aBean.getDocumentation()) {
            bean.accept(aVisitor);
        }
        if (aBean.getExtensionElements()!= null) {
            aBean.getExtensionElements().accept(aVisitor);
        }
    }

    public void traverse(Bounds aBean, Visitor aVisitor) {
    }

    public void traverse(Font aBean, Visitor aVisitor) {
    }

    public void traverse(Point aBean, Visitor aVisitor) {
    }

    public void traverse(DiagramElement.Extension aBean, Visitor aVisitor) {
        for (Object bean: aBean.getAny()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

}
