package com.itheima.config;

/**
 * ClassName: ServletConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:22
 * @Version 1.0
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
