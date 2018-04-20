package com.lb.test.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @FileName: ThreadSafe
 * @Author:bo.liu
 * @Date: Create in 2018/4/21 1:13
 * @Version:
 * @Description: 线程安全自定义注解(为了标记哪些类是线程安全的，只是单纯的标记)【不推荐写法】
 * @History: <author>   <time>    <version>   <desc>
 * 作者姓名    修改时间    版本号       描述
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {

    String value() default "";
    
}
