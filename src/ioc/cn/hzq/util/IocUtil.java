package ioc.cn.hzq.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * IOC 工具类
 *
 * @author zq.huang
 * @date 2020/3/23
 */
public class IocUtil {

    /**
     * 根据配置文件名加载配置文件
     *
     * @param fileName 文件名
     * @return 配置文件
     */
    public static Properties getPropertyByName(String fileName) {
        InputStream inputStream;
        Properties properties;

        inputStream = IocUtil.class.getClassLoader().getResourceAsStream(fileName);
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

    /**
     * 首字母转小写
     *
     * @param name 名称
     * @return 转换后的字符串
     */
    public static String toLowercaseIndex(String name) {
        if (name != null && !name.isEmpty()) {
            return name.substring(0, 1).toLowerCase() +
                    name.substring(1);
        }
        return null;
    }

}
