package ioc.cn.hzq;

import ioc.cn.hzq.anotation.MyAutowired;
import ioc.cn.hzq.anotation.MyComponent;
import ioc.cn.hzq.util.IocUtil;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zq.huang
 * @date 2020/3/23
 */
public class MyApplicationContext {

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    private Set<String> classNameSet = new HashSet<>();

    public MyApplicationContext() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

//        String beanScanPath = getBeanScanPath("ioc.bean.scan");
        loadBeanClass("ioc.cn.hzq.bean");

        registerBean();

        dependenceInjection();

    }

    /**
     * 依赖注入
     *
     * @throws InstantiationException 实例化错误
     * @throws IllegalAccessException 错误
     */
    private void dependenceInjection() throws InstantiationException, IllegalAccessException {
        if (!beanMap.isEmpty()) {
            for (Object object : beanMap.values()) {
                doInjection(object);
            }
        }
    }

    /**
     * 注入
     *
     * @param object 对象
     * @throws IllegalAccessException 错误
     * @throws InstantiationException 实例化错误
     */
    private void doInjection(Object object) throws IllegalAccessException, InstantiationException {
        // 获取成员变量
        Field[] fields = object.getClass().getDeclaredFields();

        if (fields.length != 0) {
            for (Field field : fields) {
                // 获取使用了自动注入的变量
                MyAutowired autowired = field.getAnnotation(MyAutowired.class);
                if (autowired != null) {
                    String beanName = autowired.value();

                    if (beanName.isEmpty()) {
                        beanName = IocUtil.toLowercaseIndex(field.getType().getSimpleName());
                    }

                    if (!beanMap.containsKey(beanName)) {
                        Class clazz = field.getType();
                        beanMap.put(beanName, clazz.newInstance());
                    }
                    // 注入
                    field.setAccessible(true);

                    field.set(object, beanMap.get(beanName));

                    // 执行注入依赖的注入
                    doInjection(beanMap.get(beanName));
                }
            }
        }

    }

    /**
     * 注册Bean到 beanMap，以 simpleName 为名
     *
     * @throws ClassNotFoundException 类未找到
     * @throws IllegalAccessException 错误
     * @throws InstantiationException 实例化错误
     */
    private void registerBean() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (!classNameSet.isEmpty()) {
            for (String className : classNameSet) {

                Class clazz = Class.forName(className);

                MyComponent myComponent = (MyComponent) clazz.getAnnotation(MyComponent.class);

                if (myComponent != null) {
                    String beanName = myComponent.value();

                    if (beanName.isEmpty()) {
                        beanName = IocUtil.toLowercaseIndex(clazz.getSimpleName());
                    }
                    beanMap.put(beanName, clazz.newInstance());
                }
            }
        }
    }

    /**
     * 扫描指定文件的bean。添加到classNameSet中
     *
     * @param beanScanPath bean路径
     */
    private void loadBeanClass(String beanScanPath) {
        String filePath = beanScanPath.replace(".", "/");

        URL url = this.getClass().getClassLoader().getResource(filePath);

        assert url != null;
        File rootFile = new File(url.getFile());

        for (File childFile : Objects.requireNonNull(rootFile.listFiles())) {
            if (childFile.isDirectory()) {
                loadBeanClass(beanScanPath + "." + childFile.getName());
            } else {
                classNameSet.add(beanScanPath + "." + childFile.getName().replace(".class", ""));
            }
        }

    }

    private String getBeanScanPath(String key) {
        Properties properties = IocUtil.getPropertyByName("application.properties");

        return properties.getProperty(key);
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }
}
