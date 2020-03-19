package designpattern.template;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class Cricket extends Game {
    @Override
    void initalize() {
        System.out.println("Cricket game initialized! start play.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started. enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished!");
    }
}
