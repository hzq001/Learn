package concurrent;

/**
 * @author zq.huang
 * @date 2020/3/3
 */
public class ConcurrentTest {

    public static final Long COUNT = 1000000000L;

    public static void main(String[] args) throws InterruptedException {
        concurrent();
        serial();
    }

    private static void concurrent() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (long i = 0; i < COUNT; i++) {
                a += 5;
            }
        });

        thread.start();
        int b = 0;
        for (int i = 0; i < COUNT; i++) {
            b--;
        }

        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("Concurrent time:" + time + "ms,b:" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (long i = 0; i < COUNT; i++) {
            a += 5;
        }

        int b = 0;
        for (int i = 0; i < COUNT; i++) {
            b--;
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("Serial time:" + time + "ms,b:" + b);
    }

}
