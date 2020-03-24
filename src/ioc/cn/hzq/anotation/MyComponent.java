package ioc.cn.hzq.anotation;

import java.lang.annotation.*;

/**
 * @author zq.huang
 * @date 2020/3/23
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyComponent {

    String value() default "";

}
