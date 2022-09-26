//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;


public class DepthFirstTraverserImpl
    implements Traverser
{


    public void traverse(CANDType aBean, Visitor aVisitor) {
        for (CANDType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CANDType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(CBpmnType aBean, Visitor aVisitor) {
        for (CBpmnType.Configurable bean: aBean.getConfigurable()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CBpmnType.Configurable aBean, Visitor aVisitor) {
        for (CBpmnType.Configurable.Configuration bean: aBean.getConfiguration()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CBpmnType.Configurable.Configuration aBean, Visitor aVisitor) {
    }

    public void traverse(CEpcType aBean, Visitor aVisitor) {
        for (Object bean: aBean.getCOROrCXOROrCAND()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(CFunctionType aBean, Visitor aVisitor) {
        for (CFunctionType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CFunctionType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(CMAP aBean, Visitor aVisitor) {
        for (Object bean: aBean.getCBpmnOrCEpcOrCYawl()) {
            if (bean instanceof Visitable) {
                ((Visitable) bean).accept(aVisitor);
            }
        }
    }

    public void traverse(CORType aBean, Visitor aVisitor) {
        for (CORType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CORType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(CXORType aBean, Visitor aVisitor) {
        for (CXORType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CXORType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(CYawlType aBean, Visitor aVisitor) {
        if (aBean.getSplits()!= null) {
            aBean.getSplits().accept(aVisitor);
        }
        if (aBean.getJoins()!= null) {
            aBean.getJoins().accept(aVisitor);
        }
        if (aBean.getRems()!= null) {
            aBean.getRems().accept(aVisitor);
        }
        if (aBean.getNofis()!= null) {
            aBean.getNofis().accept(aVisitor);
        }
    }

    public void traverse(CYawlType.Joins aBean, Visitor aVisitor) {
        for (JoinPortType bean: aBean.getPort()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CYawlType.Nofis aBean, Visitor aVisitor) {
        for (NofiType bean: aBean.getNofi()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CYawlType.Rems aBean, Visitor aVisitor) {
        for (RemType bean: aBean.getRem()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(CYawlType.Splits aBean, Visitor aVisitor) {
        for (SplitPortType bean: aBean.getPort()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(JoinPortType aBean, Visitor aVisitor) {
        for (JoinPortType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(JoinPortType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(NofiType aBean, Visitor aVisitor) {
        for (NofiType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(NofiType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(RemType aBean, Visitor aVisitor) {
        for (RemType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(RemType.Value aBean, Visitor aVisitor) {
    }

    public void traverse(SplitPortType aBean, Visitor aVisitor) {
        for (SplitPortType.Value bean: aBean.getValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(SplitPortType.Value aBean, Visitor aVisitor) {
    }

}
