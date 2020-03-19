package designpattern.visitor;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Computer computer);
}
