//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;


public class DepthFirstTraverserImpl
    implements Traverser
{


    public void traverse(AnnotationType aBean, Visitor aVisitor) {
        for (Object obj: aBean.getAny()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(AnnotationsType aBean, Visitor aVisitor) {
        for (AnnotationType bean: aBean.getAnnotation()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(DocumentationType aBean, Visitor aVisitor) {
        for (Object obj: aBean.getDocumentation()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
        for (Object obj: aBean.getAny()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(FillType aBean, Visitor aVisitor) {
    }

    public void traverse(FontType aBean, Visitor aVisitor) {
    }

    public void traverse(GraphicsType aBean, Visitor aVisitor) {
        for (PositionType bean: aBean.getPosition()) {
            bean.accept(aVisitor);
        }
        if (aBean.getSize()!= null) {
            aBean.getSize().accept(aVisitor);
        }
        if (aBean.getFill()!= null) {
            aBean.getFill().accept(aVisitor);
        }
        if (aBean.getLine()!= null) {
            aBean.getLine().accept(aVisitor);
        }
        if (aBean.getFont()!= null) {
            aBean.getFont().accept(aVisitor);
        }
        for (Object obj: aBean.getAny()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(LineType aBean, Visitor aVisitor) {
    }

    public void traverse(PositionType aBean, Visitor aVisitor) {
    }

    public void traverse(SimulationType aBean, Visitor aVisitor) {
        for (Object obj: aBean.getAny()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(SizeType aBean, Visitor aVisitor) {
    }

}
