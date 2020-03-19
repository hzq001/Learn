package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author zq.huang
 * @date 2019/12/27
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(() -> {
            System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
        }).start();

        new Thread(() -> {
            System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
        }).start();

        System.out.println("等待2个子线程执行完毕...");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2个子线程已经执行完毕");
        System.out.println("继续执行主线程");

    }
}
