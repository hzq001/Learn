package algorithm;

/**
 * @author zq.huang
 * @date 2020/1/5
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean isPlus = true;
        int[] resultIntArray = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            if (isPlus) {
                int temp = digits[i] + 1;
                if (temp >= 10) {
                    int currentTemp = temp % 10;
                    resultIntArray[i] = currentTemp;
                } else {
                    isPlus = false;
                    resultIntArray[i] = temp;
                }
            } else {
                resultIntArray[i] = digits[i];
            }
        }
        if (isPlus) {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            System.arraycopy(resultIntArray, 0, newResult, 1, newResult.length - 1);
            return newResult;
        }
        return resultIntArray;
    }

    public static void main(String[] args) {
        int[] ssss = new int[]{9};
        for (int ss : plusOne(ssss)) {
            System.out.print(ss);
        }
    }
}
