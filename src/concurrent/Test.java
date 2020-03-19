package concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq.huang
 * @date 2019/12/30
 */
public class Test {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        List<char[]> charList = new ArrayList<>(strs.length);

        for (String string : strs) {
            char[] charArray = string.toCharArray();
            charList.add(charArray);
        }
        char[] firstCharArray = charList.get(0);
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < firstCharArray.length; i++) {
            char tempChar = firstCharArray[i];
            boolean flag = true;
            for (char[] charArray : charList) {
                if (charArray.length > i) {
                    if (charArray[i] == tempChar) {

                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }

            if (!flag){
                return resultString.toString();
            }
            resultString.append(tempChar);
        }

        return resultString.toString();

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aca", "cba"}));

        new ArrayList<>();
    }
}
