package ioc.cn.hzq;

import ioc.cn.hzq.bean.UserService;

/**
 * @author zq.huang
 * @date 2020/3/23
 */
public class TestIoc {

    public static void main(String[] args) {
        MyApplicationContext myApplicationContext = new MyApplicationContext();

        UserService userService = (UserService) myApplicationContext.getBean("userService");
        userService.findUser("张三");

    }
}
