package designpattern.template;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class Demo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
