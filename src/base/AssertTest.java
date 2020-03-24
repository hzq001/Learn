package base;

/**
 * -- vm -ea 开启断言
 * @author zq.huang
 * @date 2020/3/24
 */
public class AssertTest {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        assert a > b:"a 不大于 b";
        System.out.println("11");
    }
}
