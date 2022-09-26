//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;


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

    public void visit(ANDJoinType aBean) {
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

    public void visit(ANDSplitType aBean) {
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

    public void visit(CancellationRefType aBean) {
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

    public void visit(CanonicalProcessType aBean) {
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

    public void visit(ConditionExpressionType aBean) {
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

    public void visit(EdgeType aBean) {
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

    public void visit(EventType aBean) {
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

    public void visit(ExpressionType aBean) {
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

    public void visit(HardType aBean) {
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

    public void visit(HumanType aBean) {
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

    public void visit(InputExpressionType aBean) {
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

    public void visit(JoinType aBean) {
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

    public void visit(MessageType aBean) {
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

    public void visit(NetType aBean) {
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

    public void visit(NodeType aBean) {
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

    public void visit(NonhumanType aBean) {
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

    public void visit(ORJoinType aBean) {
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

    public void visit(ORSplitType aBean) {
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

    public void visit(ObjectRefType aBean) {
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

    public void visit(ObjectType aBean) {
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

    public void visit(OutputExpressionType aBean) {
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

    public void visit(ResourceDataFilterExpressionType aBean) {
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

    public void visit(ResourceRuntimeFilterExpressionType aBean) {
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

    public void visit(ResourceTypeRefType aBean) {
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

    public void visit(ResourceTypeType aBean) {
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

    public void visit(SoftType aBean) {
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

    public void visit(SplitType aBean) {
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

    public void visit(StateType aBean) {
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

    public void visit(TaskType aBean) {
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

    public void visit(TimerExpressionType aBean) {
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

    public void visit(TimerType aBean) {
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

    public void visit(TypeAttribute aBean) {
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

    public void visit(WorkType aBean) {
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

    public void visit(XORJoinType aBean) {
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

    public void visit(XORSplitType aBean) {
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
