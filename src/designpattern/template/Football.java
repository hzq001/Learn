package designpattern.template;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class Football extends Game {
    @Override
    void initalize() {
        System.out.println("Football game initialized! start play.");
    }

    @Override
    void startPlay() {
        System.out.println("Football game started. enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Football game finished!");
    }
}
