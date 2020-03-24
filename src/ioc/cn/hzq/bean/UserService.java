package ioc.cn.hzq.bean;

import ioc.cn.hzq.anotation.MyAutowired;
import ioc.cn.hzq.anotation.MyComponent;

/**
 * @author zq.huang
 * @date 2020/3/23
 */
@MyComponent
public class UserService {

    @MyAutowired
    private UserDao userDao;

    public void findUser(String userName) {
        userDao.findUser(userName);
    }
}
