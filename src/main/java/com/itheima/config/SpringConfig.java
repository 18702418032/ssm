package com.itheima.config;

/**
 * ClassName: SpringConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:35
 * @Version 1.0
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.itheima.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
