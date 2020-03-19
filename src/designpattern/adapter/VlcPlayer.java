package designpattern.adapter;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // nothing
    }
}
