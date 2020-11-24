package com.miao.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 。整合mybatis-plus
* ..导入依赖
*   <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.1</version>
        </dependency>
* ..配置
* ...配置数据源
* ....导入数据库驱动
* ....配置数据源在application.yml中
* ...配置mybatis-plus
* ....使用MapperScan
* ....告诉mybatis-plus映射文件位置
* */
@MapperScan("com.miao.shop.product.dao")
@SpringBootApplication
public class MiaoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoProductApplication.class, args);
    }

}
