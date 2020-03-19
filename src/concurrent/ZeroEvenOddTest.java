package concurrent;

/**
 * @author zq.huang
 * @date 2019/12/29
 */
public class ZeroEvenOddTest {

    private void zero(int i) {
        System.out.print(i);
    }

    private void odd(int i) {
        System.out.print(i);
    }

    private void even(int i) {
        System.out.print(i);
    }

    public static void main(String[] args) {
        ZeroEvenOddTest zeroEvenOddTest = new ZeroEvenOddTest();
        for (int i = 1; i < 9; i++) {
            zeroEvenOddTest.zero(0);
            if ((i % 2) == 0) {
                zeroEvenOddTest.even(i);
            } else {
                zeroEvenOddTest.odd(i);
            }
        }
    }

}
