//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;


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

    public void visit(AML aBean) {
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

    public void visit(AttrDef aBean) {
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

    public void visit(AttrOcc aBean) {
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

    public void visit(AttrValue aBean) {
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

    public void visit(BackGroundColor aBean) {
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

    public void visit(Bold aBean) {
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

    public void visit(Brush aBean) {
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

    public void visit(Container aBean) {
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

    public void visit(CxnDef aBean) {
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

    public void visit(CxnOcc aBean) {
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

    public void visit(Database aBean) {
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

    public void visit(Delete aBean) {
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

    public void visit(Enumeration aBean) {
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

    public void visit(ExtCxnDef aBean) {
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

    public void visit(ExtCxnOcc aBean) {
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

    public void visit(FFTextDef aBean) {
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

    public void visit(FFTextOcc aBean) {
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

    public void visit(FontNode aBean) {
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

    public void visit(FontStyleSheet aBean) {
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

    public void visit(GfxObj aBean) {
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

    public void visit(Group aBean) {
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

    public void visit(HeaderInfo aBean) {
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

    public void visit(Italic aBean) {
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

    public void visit(LDAPProperty aBean) {
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

    public void visit(LDAPSettings aBean) {
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

    public void visit(Lane aBean) {
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

    public void visit(Language aBean) {
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

    public void visit(LineBreak aBean) {
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

    public void visit(LogFont aBean) {
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

    public void visit(Model aBean) {
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

    public void visit(OLEDef aBean) {
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

    public void visit(OLEOcc aBean) {
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

    public void visit(ObjDef aBean) {
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

    public void visit(ObjOcc aBean) {
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

    public void visit(Paragraph aBean) {
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

    public void visit(Pen aBean) {
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

    public void visit(PlainText aBean) {
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

    public void visit(Polygon aBean) {
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

    public void visit(Position aBean) {
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

    public void visit(Prefix aBean) {
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

    public void visit(RoundedRectangle aBean) {
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

    public void visit(Size aBean) {
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

    public void visit(SizeElement aBean) {
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

    public void visit(SoftHyphen aBean) {
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

    public void visit(StrikeThrough aBean) {
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

    public void visit(StyledElement aBean) {
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

    public void visit(TextColor aBean) {
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

    public void visit(Underline aBean) {
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

    public void visit(Union aBean) {
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

    public void visit(User aBean) {
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

    public void visit(UserGroup aBean) {
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
