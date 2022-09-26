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

public class TraversingVisitor
    implements Visitor
{

    private boolean traverseFirst;
    private Visitor visitor;
    private Traverser traverser;
    private TraversingVisitorProgressMonitor progressMonitor;

    public TraversingVisitor(Traverser aTraverser, Visitor aVisitor) {
        traverser = aTraverser;
        visitor = aVisitor;
    }

    public boolean getTraverseFirst() {
        return traverseFirst;
    }

    public void setTraverseFirst(boolean aVisitor) {
        traverseFirst = aVisitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor aVisitor) {
        visitor = aVisitor;
    }

    public Traverser getTraverser() {
        return traverser;
    }

    public void setTraverser(Traverser aVisitor) {
        traverser = aVisitor;
    }

    public TraversingVisitorProgressMonitor getProgressMonitor() {
        return progressMonitor;
    }

    public void setProgressMonitor(TraversingVisitorProgressMonitor aVisitor) {
        progressMonitor = aVisitor;
    }

    public void visit(Configurable aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Configurable.Configuration aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(ConfigurationAnnotation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(ConfigurationAnnotation.Configuration aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(ConfigurationAnnotationAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(ConfigurationAnnotationShape aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(ConfigurationMapping aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Variants aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Variants.Variant aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(SignavioMetaData aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNDiagram aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNEdge aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNLabel aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNLabelStyle aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNPlane aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(BPMNShape aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TAdHocSubProcess aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TAssignment aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TAuditing aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TBoundaryEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TBusinessRuleTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCallActivity aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCallChoreography aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCallConversation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCallableElement aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCancelEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCategory aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCategoryValue aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TChoreography aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TChoreographyTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCollaboration aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCompensateEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TComplexBehaviorDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TComplexGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TConditionalEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TConversation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TConversationAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TConversationLink aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCorrelationKey aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCorrelationProperty aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCorrelationPropertyBinding aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCorrelationPropertyRetrievalExpression aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TCorrelationSubscription aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataInput aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataInputAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataObject aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataObjectReference aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataOutput aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataOutputAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataState aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataStore aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDataStoreReference aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDefinitions aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TDocumentation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TEndEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TEndPoint aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TError aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TErrorEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TEscalation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TEscalationEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TEventBasedGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TExclusiveGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TExpression aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TExtension aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TExtensionElements aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TFormalExpression aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalBusinessRuleTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalChoreographyTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalConversation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalManualTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalScriptTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGlobalUserTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TGroup aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(THumanPerformer aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TImplicitThrowEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TImport aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TInclusiveGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TInputOutputBinding aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TInputOutputSpecification aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TInputSet aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TInterface aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TIntermediateCatchEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TIntermediateThrowEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TItemDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TLane aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TLaneSet aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TLinkEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TManualTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMessage aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMessageEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMessageFlow aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMessageFlowAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMonitoring aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TMultiInstanceLoopCharacteristics aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TOperation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TOutputSet aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TParallelGateway aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TParticipant aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TParticipantAssociation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TParticipantMultiplicity aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TPartnerEntity aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TPartnerRole aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TPerformer aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TPotentialOwner aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TProcess aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TProperty aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TReceiveTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TRelationship aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TRendering aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TResource aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TResourceAssignmentExpression aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TResourceParameter aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TResourceParameterBinding aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TResourceRole aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TScript aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TScriptTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSendTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSequenceFlow aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TServiceTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSignal aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSignalEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TStandardLoopCharacteristics aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TStartEvent aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSubChoreography aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSubConversation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TSubProcess aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TTerminateEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TText aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TTextAnnotation aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TTimerEventDefinition aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TTransaction aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(TUserTask aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Bounds aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Font aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(Point aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

    public void visit(org.omg.spec.dd._20100524.di.DiagramElement.Extension aBean) {
        if (traverseFirst == true) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
        aBean.accept(getVisitor());
        if (progressMonitor!= null) {
            progressMonitor.visited(aBean);
        }
        if (traverseFirst == false) {
            getTraverser().traverse(aBean, this);
            if (progressMonitor!= null) {
                progressMonitor.traversed(aBean);
            }
        }
    }

}
