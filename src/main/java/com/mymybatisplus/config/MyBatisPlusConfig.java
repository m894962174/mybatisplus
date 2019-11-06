package com.mymybatisplus.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mymybatisplus.mapper")
public class MyBatisPlusConfig {

    /*
    * 分页插件*/
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }
}
