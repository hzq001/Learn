package designpattern.visitor;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
