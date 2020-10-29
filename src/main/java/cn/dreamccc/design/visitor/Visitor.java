package cn.dreamccc.design.visitor;

import cn.dreamccc.design.visitor.Dot;

/**
 * <h2>cn.dreamccc.design.visitor</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 10:10
 */
interface Visitor {

    /**
     * 访问点
     */
    String visitDot(Dot entity);

    /**
     * 访问圆圈
     */
    String visitCircle(Circle entity);

    /**
     * 访问矩形
     */
    String visitRectangle(Rectangle entity);

    /**
     * 访问复合图形
     */
    String visitCompoundGraphic(CompoundGraphic entity);
}
