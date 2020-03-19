package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author zq.huang
 * @date 2019/12/26
 */
public class SequentialExecution {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.getCount();
        Thread.yield();
    }

}
