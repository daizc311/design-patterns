package cn.dreamccc.design.visitor;

import lombok.Data;

/**
 * <h2>cn.dreamccc.design.visitor.entity</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 10:14
 */
@Data
class DotElement implements Element {

    private Integer id;

    private String name;

    //    @Override
//    public String accept(Visitor visitor) {
//        return name;
//    }
}
