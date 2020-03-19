package designpattern.proxy.simple;

/**
 * @author zq.huang
 * @date 2020/2/12
 */
public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFormDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }

    private void loadFormDisk(String fileName) {
        System.out.println("Loading: " + fileName);
    }
}
