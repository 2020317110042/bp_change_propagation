//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;


public class DepthFirstTraverserImpl
    implements Traverser
{


    public void traverse(AML aBean, Visitor aVisitor) {
        if (aBean.getHeaderInfo()!= null) {
            aBean.getHeaderInfo().accept(aVisitor);
        }
        for (Language bean: aBean.getLanguage()) {
            bean.accept(aVisitor);
        }
        for (Prefix bean: aBean.getPrefix()) {
            bean.accept(aVisitor);
        }
        if (aBean.getDatabase()!= null) {
            aBean.getDatabase().accept(aVisitor);
        }
        if (aBean.getLDAPSettings()!= null) {
            aBean.getLDAPSettings().accept(aVisitor);
        }
        for (User bean: aBean.getUser()) {
            bean.accept(aVisitor);
        }
        for (UserGroup bean: aBean.getUserGroup()) {
            bean.accept(aVisitor);
        }
        for (FontStyleSheet bean: aBean.getFontStyleSheet()) {
            bean.accept(aVisitor);
        }
        for (FFTextDef bean: aBean.getFFTextDef()) {
            bean.accept(aVisitor);
        }
        for (OLEDef bean: aBean.getOLEDef()) {
            bean.accept(aVisitor);
        }
        if (aBean.getGroup()!= null) {
            aBean.getGroup().accept(aVisitor);
        }
        for (Delete bean: aBean.getDelete()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(AttrDef aBean, Visitor aVisitor) {
        for (AttrValue bean: aBean.getAttrValue()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(AttrOcc aBean, Visitor aVisitor) {
        if (aBean.getSize()!= null) {
            aBean.getSize().accept(aVisitor);
        }
    }

    public void traverse(AttrValue aBean, Visitor aVisitor) {
        for (Object obj: aBean.getContent()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(BackGroundColor aBean, Visitor aVisitor) {
    }

    public void traverse(Bold aBean, Visitor aVisitor) {
    }

    public void traverse(Brush aBean, Visitor aVisitor) {
    }

    public void traverse(Container aBean, Visitor aVisitor) {
    }

    public void traverse(CxnDef aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnDef bean: aBean.getExtCxnDef()) {
            bean.accept(aVisitor);
        }
        for (Object obj: aBean.getLinkedModelsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(CxnOcc aBean, Visitor aVisitor) {
        if (aBean.getPen()!= null) {
            aBean.getPen().accept(aVisitor);
        }
        for (Position bean: aBean.getPosition()) {
            bean.accept(aVisitor);
        }
        for (AttrOcc bean: aBean.getAttrOcc()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnOcc bean: aBean.getExtCxnOcc()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Database aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Delete aBean, Visitor aVisitor) {
    }

    public void traverse(Enumeration aBean, Visitor aVisitor) {
    }

    public void traverse(ExtCxnDef aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnDef bean: aBean.getExtCxnDef()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(ExtCxnOcc aBean, Visitor aVisitor) {
        if (aBean.getPen()!= null) {
            aBean.getPen().accept(aVisitor);
        }
        for (Position bean: aBean.getPosition()) {
            bean.accept(aVisitor);
        }
        for (AttrOcc bean: aBean.getAttrOcc()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnOcc bean: aBean.getExtCxnOcc()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(FFTextDef aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(FFTextOcc aBean, Visitor aVisitor) {
        if (aBean.getPosition()!= null) {
            aBean.getPosition().accept(aVisitor);
        }
    }

    public void traverse(Font aBean, Visitor aVisitor) {
    }

    public void traverse(FontNode aBean, Visitor aVisitor) {
    }

    public void traverse(FontStyleSheet aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (FontNode bean: aBean.getFontNode()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(GfxObj aBean, Visitor aVisitor) {
        if (aBean.getPen()!= null) {
            aBean.getPen().accept(aVisitor);
        }
        if (aBean.getBrush()!= null) {
            aBean.getBrush().accept(aVisitor);
        }
        if (aBean.getPosition()!= null) {
            aBean.getPosition().accept(aVisitor);
        }
        if (aBean.getSize()!= null) {
            aBean.getSize().accept(aVisitor);
        }
        if (aBean.getPolygon()!= null) {
            aBean.getPolygon().accept(aVisitor);
        }
        if (aBean.getRoundedRectangle()!= null) {
            aBean.getRoundedRectangle().accept(aVisitor);
        }
    }

    public void traverse(Group aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (Group bean: aBean.getGroup()) {
            bean.accept(aVisitor);
        }
        for (Object obj: aBean.getObjDefOrModel()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(HeaderInfo aBean, Visitor aVisitor) {
    }

    public void traverse(Italic aBean, Visitor aVisitor) {
    }

    public void traverse(LDAPProperty aBean, Visitor aVisitor) {
    }

    public void traverse(LDAPSettings aBean, Visitor aVisitor) {
        for (LDAPProperty bean: aBean.getLDAPProperty()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Lane aBean, Visitor aVisitor) {
        if (aBean.getPen()!= null) {
            aBean.getPen().accept(aVisitor);
        }
        if (aBean.getBrush()!= null) {
            aBean.getBrush().accept(aVisitor);
        }
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Language aBean, Visitor aVisitor) {
        if (aBean.getLogFont()!= null) {
            aBean.getLogFont().accept(aVisitor);
        }
    }

    public void traverse(LineBreak aBean, Visitor aVisitor) {
    }

    public void traverse(LogFont aBean, Visitor aVisitor) {
    }

    public void traverse(Model aBean, Visitor aVisitor) {
        for (Lane bean: aBean.getLane()) {
            bean.accept(aVisitor);
        }
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (ObjOcc bean: aBean.getObjOcc()) {
            bean.accept(aVisitor);
        }
        for (FFTextOcc bean: aBean.getFFTextOcc()) {
            bean.accept(aVisitor);
        }
        for (GfxObj bean: aBean.getGfxObj()) {
            bean.accept(aVisitor);
        }
        for (OLEOcc bean: aBean.getOLEOcc()) {
            bean.accept(aVisitor);
        }
        for (Union bean: aBean.getUnion()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(OLEDef aBean, Visitor aVisitor) {
        for (Object obj: aBean.getContent()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(OLEOcc aBean, Visitor aVisitor) {
        if (aBean.getPosition()!= null) {
            aBean.getPosition().accept(aVisitor);
        }
        if (aBean.getSize()!= null) {
            aBean.getSize().accept(aVisitor);
        }
    }

    public void traverse(ObjDef aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        for (CxnDef bean: aBean.getCxnDef()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnDef bean: aBean.getExtCxnDef()) {
            bean.accept(aVisitor);
        }
        for (Object obj: aBean.getLinkedModelsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
        for (Object obj: aBean.getToCxnDefsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(ObjOcc aBean, Visitor aVisitor) {
        if (aBean.getPen()!= null) {
            aBean.getPen().accept(aVisitor);
        }
        if (aBean.getBrush()!= null) {
            aBean.getBrush().accept(aVisitor);
        }
        if (aBean.getPosition()!= null) {
            aBean.getPosition().accept(aVisitor);
        }
        if (aBean.getSize()!= null) {
            aBean.getSize().accept(aVisitor);
        }
        for (CxnOcc bean: aBean.getCxnOcc()) {
            bean.accept(aVisitor);
        }
        for (AttrOcc bean: aBean.getAttrOcc()) {
            bean.accept(aVisitor);
        }
        for (ExtCxnOcc bean: aBean.getExtCxnOcc()) {
            bean.accept(aVisitor);
        }
        for (Object obj: aBean.getToCxnOccsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(Paragraph aBean, Visitor aVisitor) {
    }

    public void traverse(Pen aBean, Visitor aVisitor) {
    }

    public void traverse(PlainText aBean, Visitor aVisitor) {
    }

    public void traverse(Polygon aBean, Visitor aVisitor) {
        for (Position bean: aBean.getPosition()) {
            bean.accept(aVisitor);
        }
    }

    public void traverse(Position aBean, Visitor aVisitor) {
    }

    public void traverse(Prefix aBean, Visitor aVisitor) {
    }

    public void traverse(RoundedRectangle aBean, Visitor aVisitor) {
        if (aBean.getPosition()!= null) {
            aBean.getPosition().accept(aVisitor);
        }
    }

    public void traverse(Size aBean, Visitor aVisitor) {
    }

    public void traverse(SizeElement aBean, Visitor aVisitor) {
    }

    public void traverse(SoftHyphen aBean, Visitor aVisitor) {
    }

    public void traverse(StrikeThrough aBean, Visitor aVisitor) {
    }

    public void traverse(StyledElement aBean, Visitor aVisitor) {
        for (Object obj: aBean.getContent()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(TextColor aBean, Visitor aVisitor) {
    }

    public void traverse(Underline aBean, Visitor aVisitor) {
    }

    public void traverse(Union aBean, Visitor aVisitor) {
        for (Union bean: aBean.getUnion()) {
            bean.accept(aVisitor);
        }
        for (Object obj: aBean.getOLEObjOccsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
        for (Object obj: aBean.getObjOccsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
        for (Object obj: aBean.getGfxsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
        for (Object obj: aBean.getTextOccsIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

    public void traverse(User aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        if (aBean.getPrefix()!= null) {
            aBean.getPrefix().accept(aVisitor);
        }
    }

    public void traverse(UserGroup aBean, Visitor aVisitor) {
        for (AttrDef bean: aBean.getAttrDef()) {
            bean.accept(aVisitor);
        }
        if (aBean.getPrefix()!= null) {
            aBean.getPrefix().accept(aVisitor);
        }
        for (Object obj: aBean.getUserIdRefs()) {
            if (obj instanceof Visitable) {
                ((Visitable) obj).accept(aVisitor);
            }
        }
    }

}
