package designpattern.mediator;

import java.util.Date;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}
