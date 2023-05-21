package com.itheima.config;

/**
 * ClassName: SpringMvcConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:22
 * @Version 1.0
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.itheima.controller","com.itheima.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
