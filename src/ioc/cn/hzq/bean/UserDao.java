package ioc.cn.hzq.bean;

import ioc.cn.hzq.anotation.MyComponent;

/**
 * @author zq.huang
 * @date 2020/3/23
 */
@MyComponent
public class UserDao {

    public void findUser(String userName) {
        System.out.println("找到一个用户名字叫：" + userName);
    }
}
