package designpattern.template;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public abstract class Game {

    abstract void initalize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play(){
        initalize();

        startPlay();

        endPlay();
    }

}
