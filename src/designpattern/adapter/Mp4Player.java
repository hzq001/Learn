package designpattern.adapter;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name: " + fileName);
    }
}
