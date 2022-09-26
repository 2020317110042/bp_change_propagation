//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;


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

    public void visit(CANDType aBean) {
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

    public void visit(CANDType.Value aBean) {
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

    public void visit(CBpmnType aBean) {
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

    public void visit(CBpmnType.Configurable aBean) {
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

    public void visit(CBpmnType.Configurable.Configuration aBean) {
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

    public void visit(CEpcType aBean) {
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

    public void visit(CFunctionType aBean) {
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

    public void visit(CFunctionType.Value aBean) {
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

    public void visit(CMAP aBean) {
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

    public void visit(CORType aBean) {
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

    public void visit(CORType.Value aBean) {
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

    public void visit(CXORType aBean) {
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

    public void visit(CXORType.Value aBean) {
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

    public void visit(CYawlType aBean) {
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

    public void visit(CYawlType.Joins aBean) {
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

    public void visit(CYawlType.Nofis aBean) {
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

    public void visit(CYawlType.Rems aBean) {
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

    public void visit(CYawlType.Splits aBean) {
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

    public void visit(JoinPortType aBean) {
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

    public void visit(JoinPortType.Value aBean) {
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

    public void visit(NofiType aBean) {
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

    public void visit(NofiType.Value aBean) {
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

    public void visit(RemType aBean) {
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

    public void visit(RemType.Value aBean) {
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

    public void visit(SplitPortType aBean) {
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

    public void visit(SplitPortType.Value aBean) {
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
