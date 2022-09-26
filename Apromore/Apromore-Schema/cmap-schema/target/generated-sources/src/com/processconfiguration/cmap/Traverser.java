//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;


public interface Traverser {


    public void traverse(CANDType aBean, Visitor aVisitor);

    public void traverse(CANDType.Value aBean, Visitor aVisitor);

    public void traverse(CBpmnType aBean, Visitor aVisitor);

    public void traverse(CBpmnType.Configurable aBean, Visitor aVisitor);

    public void traverse(CBpmnType.Configurable.Configuration aBean, Visitor aVisitor);

    public void traverse(CEpcType aBean, Visitor aVisitor);

    public void traverse(CFunctionType aBean, Visitor aVisitor);

    public void traverse(CFunctionType.Value aBean, Visitor aVisitor);

    public void traverse(CMAP aBean, Visitor aVisitor);

    public void traverse(CORType aBean, Visitor aVisitor);

    public void traverse(CORType.Value aBean, Visitor aVisitor);

    public void traverse(CXORType aBean, Visitor aVisitor);

    public void traverse(CXORType.Value aBean, Visitor aVisitor);

    public void traverse(CYawlType aBean, Visitor aVisitor);

    public void traverse(CYawlType.Joins aBean, Visitor aVisitor);

    public void traverse(CYawlType.Nofis aBean, Visitor aVisitor);

    public void traverse(CYawlType.Rems aBean, Visitor aVisitor);

    public void traverse(CYawlType.Splits aBean, Visitor aVisitor);

    public void traverse(JoinPortType aBean, Visitor aVisitor);

    public void traverse(JoinPortType.Value aBean, Visitor aVisitor);

    public void traverse(NofiType aBean, Visitor aVisitor);

    public void traverse(NofiType.Value aBean, Visitor aVisitor);

    public void traverse(RemType aBean, Visitor aVisitor);

    public void traverse(RemType.Value aBean, Visitor aVisitor);

    public void traverse(SplitPortType aBean, Visitor aVisitor);

    public void traverse(SplitPortType.Value aBean, Visitor aVisitor);

}
