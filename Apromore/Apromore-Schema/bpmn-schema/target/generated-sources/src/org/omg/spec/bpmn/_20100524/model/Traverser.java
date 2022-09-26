//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

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

public interface Traverser {


    public void traverse(Configurable aBean, Visitor aVisitor);

    public void traverse(Configurable.Configuration aBean, Visitor aVisitor);

    public void traverse(ConfigurationAnnotation aBean, Visitor aVisitor);

    public void traverse(ConfigurationAnnotation.Configuration aBean, Visitor aVisitor);

    public void traverse(ConfigurationAnnotationAssociation aBean, Visitor aVisitor);

    public void traverse(ConfigurationAnnotationShape aBean, Visitor aVisitor);

    public void traverse(ConfigurationMapping aBean, Visitor aVisitor);

    public void traverse(Variants aBean, Visitor aVisitor);

    public void traverse(Variants.Variant aBean, Visitor aVisitor);

    public void traverse(SignavioMetaData aBean, Visitor aVisitor);

    public void traverse(BPMNDiagram aBean, Visitor aVisitor);

    public void traverse(BPMNEdge aBean, Visitor aVisitor);

    public void traverse(BPMNLabel aBean, Visitor aVisitor);

    public void traverse(BPMNLabelStyle aBean, Visitor aVisitor);

    public void traverse(BPMNPlane aBean, Visitor aVisitor);

    public void traverse(BPMNShape aBean, Visitor aVisitor);

    public void traverse(TAdHocSubProcess aBean, Visitor aVisitor);

    public void traverse(TAssignment aBean, Visitor aVisitor);

    public void traverse(TAssociation aBean, Visitor aVisitor);

    public void traverse(TAuditing aBean, Visitor aVisitor);

    public void traverse(TBoundaryEvent aBean, Visitor aVisitor);

    public void traverse(TBusinessRuleTask aBean, Visitor aVisitor);

    public void traverse(TCallActivity aBean, Visitor aVisitor);

    public void traverse(TCallChoreography aBean, Visitor aVisitor);

    public void traverse(TCallConversation aBean, Visitor aVisitor);

    public void traverse(TCallableElement aBean, Visitor aVisitor);

    public void traverse(TCancelEventDefinition aBean, Visitor aVisitor);

    public void traverse(TCategory aBean, Visitor aVisitor);

    public void traverse(TCategoryValue aBean, Visitor aVisitor);

    public void traverse(TChoreography aBean, Visitor aVisitor);

    public void traverse(TChoreographyTask aBean, Visitor aVisitor);

    public void traverse(TCollaboration aBean, Visitor aVisitor);

    public void traverse(TCompensateEventDefinition aBean, Visitor aVisitor);

    public void traverse(TComplexBehaviorDefinition aBean, Visitor aVisitor);

    public void traverse(TComplexGateway aBean, Visitor aVisitor);

    public void traverse(TConditionalEventDefinition aBean, Visitor aVisitor);

    public void traverse(TConversation aBean, Visitor aVisitor);

    public void traverse(TConversationAssociation aBean, Visitor aVisitor);

    public void traverse(TConversationLink aBean, Visitor aVisitor);

    public void traverse(TCorrelationKey aBean, Visitor aVisitor);

    public void traverse(TCorrelationProperty aBean, Visitor aVisitor);

    public void traverse(TCorrelationPropertyBinding aBean, Visitor aVisitor);

    public void traverse(TCorrelationPropertyRetrievalExpression aBean, Visitor aVisitor);

    public void traverse(TCorrelationSubscription aBean, Visitor aVisitor);

    public void traverse(TDataAssociation aBean, Visitor aVisitor);

    public void traverse(TDataInput aBean, Visitor aVisitor);

    public void traverse(TDataInputAssociation aBean, Visitor aVisitor);

    public void traverse(TDataObject aBean, Visitor aVisitor);

    public void traverse(TDataObjectReference aBean, Visitor aVisitor);

    public void traverse(TDataOutput aBean, Visitor aVisitor);

    public void traverse(TDataOutputAssociation aBean, Visitor aVisitor);

    public void traverse(TDataState aBean, Visitor aVisitor);

    public void traverse(TDataStore aBean, Visitor aVisitor);

    public void traverse(TDataStoreReference aBean, Visitor aVisitor);

    public void traverse(TDefinitions aBean, Visitor aVisitor);

    public void traverse(TDocumentation aBean, Visitor aVisitor);

    public void traverse(TEndEvent aBean, Visitor aVisitor);

    public void traverse(TEndPoint aBean, Visitor aVisitor);

    public void traverse(TError aBean, Visitor aVisitor);

    public void traverse(TErrorEventDefinition aBean, Visitor aVisitor);

    public void traverse(TEscalation aBean, Visitor aVisitor);

    public void traverse(TEscalationEventDefinition aBean, Visitor aVisitor);

    public void traverse(TEventBasedGateway aBean, Visitor aVisitor);

    public void traverse(TExclusiveGateway aBean, Visitor aVisitor);

    public void traverse(TExpression aBean, Visitor aVisitor);

    public void traverse(TExtension aBean, Visitor aVisitor);

    public void traverse(TExtensionElements aBean, Visitor aVisitor);

    public void traverse(TFormalExpression aBean, Visitor aVisitor);

    public void traverse(TGateway aBean, Visitor aVisitor);

    public void traverse(TGlobalBusinessRuleTask aBean, Visitor aVisitor);

    public void traverse(TGlobalChoreographyTask aBean, Visitor aVisitor);

    public void traverse(TGlobalConversation aBean, Visitor aVisitor);

    public void traverse(TGlobalManualTask aBean, Visitor aVisitor);

    public void traverse(TGlobalScriptTask aBean, Visitor aVisitor);

    public void traverse(TGlobalTask aBean, Visitor aVisitor);

    public void traverse(TGlobalUserTask aBean, Visitor aVisitor);

    public void traverse(TGroup aBean, Visitor aVisitor);

    public void traverse(THumanPerformer aBean, Visitor aVisitor);

    public void traverse(TImplicitThrowEvent aBean, Visitor aVisitor);

    public void traverse(TImport aBean, Visitor aVisitor);

    public void traverse(TInclusiveGateway aBean, Visitor aVisitor);

    public void traverse(TInputOutputBinding aBean, Visitor aVisitor);

    public void traverse(TInputOutputSpecification aBean, Visitor aVisitor);

    public void traverse(TInputSet aBean, Visitor aVisitor);

    public void traverse(TInterface aBean, Visitor aVisitor);

    public void traverse(TIntermediateCatchEvent aBean, Visitor aVisitor);

    public void traverse(TIntermediateThrowEvent aBean, Visitor aVisitor);

    public void traverse(TItemDefinition aBean, Visitor aVisitor);

    public void traverse(TLane aBean, Visitor aVisitor);

    public void traverse(TLaneSet aBean, Visitor aVisitor);

    public void traverse(TLinkEventDefinition aBean, Visitor aVisitor);

    public void traverse(TManualTask aBean, Visitor aVisitor);

    public void traverse(TMessage aBean, Visitor aVisitor);

    public void traverse(TMessageEventDefinition aBean, Visitor aVisitor);

    public void traverse(TMessageFlow aBean, Visitor aVisitor);

    public void traverse(TMessageFlowAssociation aBean, Visitor aVisitor);

    public void traverse(TMonitoring aBean, Visitor aVisitor);

    public void traverse(TMultiInstanceLoopCharacteristics aBean, Visitor aVisitor);

    public void traverse(TOperation aBean, Visitor aVisitor);

    public void traverse(TOutputSet aBean, Visitor aVisitor);

    public void traverse(TParallelGateway aBean, Visitor aVisitor);

    public void traverse(TParticipant aBean, Visitor aVisitor);

    public void traverse(TParticipantAssociation aBean, Visitor aVisitor);

    public void traverse(TParticipantMultiplicity aBean, Visitor aVisitor);

    public void traverse(TPartnerEntity aBean, Visitor aVisitor);

    public void traverse(TPartnerRole aBean, Visitor aVisitor);

    public void traverse(TPerformer aBean, Visitor aVisitor);

    public void traverse(TPotentialOwner aBean, Visitor aVisitor);

    public void traverse(TProcess aBean, Visitor aVisitor);

    public void traverse(TProperty aBean, Visitor aVisitor);

    public void traverse(TReceiveTask aBean, Visitor aVisitor);

    public void traverse(TRelationship aBean, Visitor aVisitor);

    public void traverse(TRendering aBean, Visitor aVisitor);

    public void traverse(TResource aBean, Visitor aVisitor);

    public void traverse(TResourceAssignmentExpression aBean, Visitor aVisitor);

    public void traverse(TResourceParameter aBean, Visitor aVisitor);

    public void traverse(TResourceParameterBinding aBean, Visitor aVisitor);

    public void traverse(TResourceRole aBean, Visitor aVisitor);

    public void traverse(TScript aBean, Visitor aVisitor);

    public void traverse(TScriptTask aBean, Visitor aVisitor);

    public void traverse(TSendTask aBean, Visitor aVisitor);

    public void traverse(TSequenceFlow aBean, Visitor aVisitor);

    public void traverse(TServiceTask aBean, Visitor aVisitor);

    public void traverse(TSignal aBean, Visitor aVisitor);

    public void traverse(TSignalEventDefinition aBean, Visitor aVisitor);

    public void traverse(TStandardLoopCharacteristics aBean, Visitor aVisitor);

    public void traverse(TStartEvent aBean, Visitor aVisitor);

    public void traverse(TSubChoreography aBean, Visitor aVisitor);

    public void traverse(TSubConversation aBean, Visitor aVisitor);

    public void traverse(TSubProcess aBean, Visitor aVisitor);

    public void traverse(TTask aBean, Visitor aVisitor);

    public void traverse(TTerminateEventDefinition aBean, Visitor aVisitor);

    public void traverse(TText aBean, Visitor aVisitor);

    public void traverse(TTextAnnotation aBean, Visitor aVisitor);

    public void traverse(TTimerEventDefinition aBean, Visitor aVisitor);

    public void traverse(TTransaction aBean, Visitor aVisitor);

    public void traverse(TUserTask aBean, Visitor aVisitor);

    public void traverse(Bounds aBean, Visitor aVisitor);

    public void traverse(Font aBean, Visitor aVisitor);

    public void traverse(Point aBean, Visitor aVisitor);

    public void traverse(org.omg.spec.dd._20100524.di.DiagramElement.Extension aBean, Visitor aVisitor);

}
