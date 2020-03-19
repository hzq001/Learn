package algorithm;

/**
 * @author zq.huang
 * @date 2019/12/27
 */
public class ReverseNumber {
    public static int reverse(int x) {
        int ans = 0;
        // 后面计算 /=10 最后值是 0 就会停止
        while (x != 0) {
            // 获取个位
            int pop = x % 10;
            System.out.println("pop:" + pop);
            // 判断最大值溢出 Integer.MAX_VALUE = 2147483647，如果计算后的个位值不大于 7 则不会溢出
            // ans > Integer.MAX_VALUE / 10 是为了 ans*10 不溢出
            // ans == Integer.MAX_VALUE / 10 && pop > 7 是为了 ans = 214748364 不溢出
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // 判断最小值溢出 Integer.MIN_VALUE = -2147483648 ，如果计算后的个位值 不小于 -8 则不会溢出
            // ans > Integer.MIN_VALUE / 10 是为了 ans*10 不溢出
            // ans == Integer.MIN_VALUE / 10 && pop > 7 是为了 ans = -214748364 不溢出
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            // 值 * 10 ——》后移一位，再加上新的值
            ans = ans * 10 + pop;
            System.out.println("ans:" + ans);
            // 值 / 10 获取下一位数
            x /= 10;
            System.out.println("x:" + x);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(134));
    }
}
