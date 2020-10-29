package cn.dreamccc.design.visitor;

/**
 * <h2>cn.dreamccc.design.visitor</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 10:10
 */
interface Visitor {

    default String visit(Element entity) {
        return entity.accept(this);
    }
//
//    /**
//     * 访问点
//     */
//    String visit(DotElement entity);
//
//    /**
//     * 访问圆圈
//     */
//    String visit(CircleElement entity);
//
//    /**
//     * 访问矩形
//     */
//    String visit(RectangleElement entity);
//
//    /**
//     * 访问复合图形
//     */
//    String visit(CompoundGraphicElement entity);
}
