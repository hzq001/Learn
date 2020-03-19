package designpattern.visitor;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
