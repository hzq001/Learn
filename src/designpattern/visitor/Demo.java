package designpattern.visitor;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Demo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
