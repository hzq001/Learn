package designpattern.visitor;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Computer  implements ComputerPart{
    ComputerPart[] parts;


    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
