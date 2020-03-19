package concurrent;

import java.util.concurrent.Semaphore;

/**
 * @author zq.huang
 * @date 2019/12/27
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        int n = 8;            //工人数
        Semaphore semaphore = new Semaphore(5); //机器数目
        for (int i = 0; i < n; i++) {
            new Worker(i, semaphore).start();
        }
    }

    static class Worker extends Thread {
        private int num;
        private Semaphore semaphore;

        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {

                semaphore.acquire();
                System.out.println("工人" + this.num + "占用一个机器在生产...");
                Thread.sleep((long) (Math.random() * 2000));
                System.out.println("工人" + this.num + "释放出机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}