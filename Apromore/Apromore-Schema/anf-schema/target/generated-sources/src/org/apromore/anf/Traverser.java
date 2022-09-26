//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;


public interface Traverser {


    public void traverse(AnnotationType aBean, Visitor aVisitor);

    public void traverse(AnnotationsType aBean, Visitor aVisitor);

    public void traverse(DocumentationType aBean, Visitor aVisitor);

    public void traverse(FillType aBean, Visitor aVisitor);

    public void traverse(FontType aBean, Visitor aVisitor);

    public void traverse(GraphicsType aBean, Visitor aVisitor);

    public void traverse(LineType aBean, Visitor aVisitor);

    public void traverse(PositionType aBean, Visitor aVisitor);

    public void traverse(SimulationType aBean, Visitor aVisitor);

    public void traverse(SizeType aBean, Visitor aVisitor);

}
