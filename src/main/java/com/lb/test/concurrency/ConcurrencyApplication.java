package com.lb.test.concurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @FileName: ConcurrencyApplicationTest
 * @Author:bo.liu
 * @Date: Create in 2018/4/20 18:21
 * @Version:
 * @Description: 并发编程项demo目
 * @History: <author>   <time>    <version>   <desc>
 * 作者姓名    修改时间    版本号       描述
 */
@SpringBootApplication
public class ConcurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcurrencyApplication.class, args);
    }
}
