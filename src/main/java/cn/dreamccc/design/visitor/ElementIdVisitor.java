package cn.dreamccc.design.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * <h2>cn.dreamccc.design.visitor</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 11:07
 */
@Slf4j
public class ElementIdVisitor implements Visitor{

    public String visit(DotElement entity) {
        log.info("开始访问{}",entity.getClass().getSimpleName());
        return entity.accept(this);
    }

    public String visit(CircleElement entity) {
        log.info("开始访问{}",entity.getClass().getSimpleName());
        return entity.accept(this);
    }

    public String visit(RectangleElement entity) {
        log.info("开始访问{}",entity.getClass().getSimpleName());
        return entity.accept(this);
    }

    public String visit(CompoundGraphicElement entity) {
        log.info("开始访问{}",entity.getClass().getSimpleName());
        return entity.accept(this);
    }
}
