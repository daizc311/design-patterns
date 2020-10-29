package cn.dreamccc.design.visitor;

import lombok.var;
import org.junit.Test;

/**
 * <h2>访问者模式</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 10:07
 */
public class VisitorPatterns {


    @Test
    public void startup() {

       var dotElement = new DotElement();
       var compoundGraphicElement = new CompoundGraphicElement();
       var circleElement = new CircleElement();
       var rectangleElement = new RectangleElement();

        ElementIdVisitor elementIdVisitor = new ElementIdVisitor();
        String visitDot = elementIdVisitor.visit(dotElement);
        String visitCompoundGraphic = elementIdVisitor.visit(compoundGraphicElement);
        String visitCircle = elementIdVisitor.visit(circleElement);
        String visitRectangle = elementIdVisitor.visit(rectangleElement);
    }




}
