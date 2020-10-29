package cn.dreamccc.design.visitor;

/**
 * <h2>被访问的元素</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 11:04
 */
interface Element {

//   String accept(Visitor visitor);

   default String accept(Visitor visitor) {
      return visitor.visit(this);
   }
}
