//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;


public class DepthFirstTraverserImpl
    implements Traverser
{


    public void traverse(ANDJoinType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ANDSplitType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CancellationRefType aBean, Visitor aVisitor) {
    }

    public void traverse(CanonicalProcessType aBean, Visitor aVisitor) {
        for (NetType bean: aBean.getNet()) {
            bean.accept(aVisitor);
        }
        for (ResourceTypeType bean: aBean.getResourceType()) {
            bean.accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ConditionExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(EdgeType aBean, Visitor aVisitor) {
        if (aBean.getConditionExpr()!= null) {
            aBean.getConditionExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(EventType aBean, Visitor aVisitor) {
        for (ResourceTypeRefType bean: aBean.getResourceTypeRef()) {
            bean.accept(aVisitor);
        }
        for (ObjectRefType bean: aBean.getObjectRef()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelNodeId()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelEdgeId()) {
            bean.accept(aVisitor);
        }
        for (InputExpressionType bean: aBean.getInputExpr()) {
            bean.accept(aVisitor);
        }
        for (OutputExpressionType bean: aBean.getOutputExpr()) {
            bean.accept(aVisitor);
        }
        if (aBean.getFilterByDataExpr()!= null) {
            aBean.getFilterByDataExpr().accept(aVisitor);
        }
        if (aBean.getFilterByRuntimeExpr()!= null) {
            aBean.getFilterByRuntimeExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(HardType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(HumanType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(InputExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(JoinType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(MessageType aBean, Visitor aVisitor) {
        for (ResourceTypeRefType bean: aBean.getResourceTypeRef()) {
            bean.accept(aVisitor);
        }
        for (ObjectRefType bean: aBean.getObjectRef()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelNodeId()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelEdgeId()) {
            bean.accept(aVisitor);
        }
        for (InputExpressionType bean: aBean.getInputExpr()) {
            bean.accept(aVisitor);
        }
        for (OutputExpressionType bean: aBean.getOutputExpr()) {
            bean.accept(aVisitor);
        }
        if (aBean.getFilterByDataExpr()!= null) {
            aBean.getFilterByDataExpr().accept(aVisitor);
        }
        if (aBean.getFilterByRuntimeExpr()!= null) {
            aBean.getFilterByRuntimeExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(NetType aBean, Visitor aVisitor) {
        for (NodeType bean: aBean.getNode()) {
            bean.accept(aVisitor);
        }
        for (EdgeType bean: aBean.getEdge()) {
            bean.accept(aVisitor);
        }
        for (ObjectType bean: aBean.getObject()) {
            bean.accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(NodeType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(NonhumanType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ORJoinType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ORSplitType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ObjectRefType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ObjectType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(OutputExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(ResourceDataFilterExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(ResourceRuntimeFilterExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(ResourceTypeRefType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ResourceTypeType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(SoftType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(SplitType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(StateType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(TaskType aBean, Visitor aVisitor) {
        for (ResourceTypeRefType bean: aBean.getResourceTypeRef()) {
            bean.accept(aVisitor);
        }
        for (ObjectRefType bean: aBean.getObjectRef()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelNodeId()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelEdgeId()) {
            bean.accept(aVisitor);
        }
        for (InputExpressionType bean: aBean.getInputExpr()) {
            bean.accept(aVisitor);
        }
        for (OutputExpressionType bean: aBean.getOutputExpr()) {
            bean.accept(aVisitor);
        }
        if (aBean.getFilterByDataExpr()!= null) {
            aBean.getFilterByDataExpr().accept(aVisitor);
        }
        if (aBean.getFilterByRuntimeExpr()!= null) {
            aBean.getFilterByRuntimeExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(TimerExpressionType aBean, Visitor aVisitor) {
    }

    public void traverse(TimerType aBean, Visitor aVisitor) {
        if (aBean.getTimeExpression()!= null) {
            aBean.getTimeExpression().accept(aVisitor);
        }
        for (ResourceTypeRefType bean: aBean.getResourceTypeRef()) {
            bean.accept(aVisitor);
        }
        for (ObjectRefType bean: aBean.getObjectRef()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelNodeId()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelEdgeId()) {
            bean.accept(aVisitor);
        }
        for (InputExpressionType bean: aBean.getInputExpr()) {
            bean.accept(aVisitor);
        }
        for (OutputExpressionType bean: aBean.getOutputExpr()) {
            bean.accept(aVisitor);
        }
        if (aBean.getFilterByDataExpr()!= null) {
            aBean.getFilterByDataExpr().accept(aVisitor);
        }
        if (aBean.getFilterByRuntimeExpr()!= null) {
            aBean.getFilterByRuntimeExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(TypeAttribute aBean, Visitor aVisitor) {
    }

    public void traverse(WorkType aBean, Visitor aVisitor) {
        for (ResourceTypeRefType bean: aBean.getResourceTypeRef()) {
            bean.accept(aVisitor);
        }
        for (ObjectRefType bean: aBean.getObjectRef()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelNodeId()) {
            bean.accept(aVisitor);
        }
        for (CancellationRefType bean: aBean.getCancelEdgeId()) {
            bean.accept(aVisitor);
        }
        for (InputExpressionType bean: aBean.getInputExpr()) {
            bean.accept(aVisitor);
        }
        for (OutputExpressionType bean: aBean.getOutputExpr()) {
            bean.accept(aVisitor);
        }
        if (aBean.getFilterByDataExpr()!= null) {
            aBean.getFilterByDataExpr().accept(aVisitor);
        }
        if (aBean.getFilterByRuntimeExpr()!= null) {
            aBean.getFilterByRuntimeExpr().accept(aVisitor);
        }
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(XORJoinType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(XORSplitType aBean, Visitor aVisitor) {
        for (TypeAttribute bean: aBean.getAttribute()) {
            bean.accept(aVisitor);
        }
    }

}
