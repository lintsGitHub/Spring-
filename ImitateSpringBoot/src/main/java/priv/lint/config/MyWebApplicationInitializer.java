/*
package priv.lint.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        配置Spring
        servletContext.setInitParameter("contextConfigLocation","priv.lint.config.ApplicationConfig");
        servletContext.addListener(new ContextLoaderListener());

        //配置springmvc
        ServletRegistration.Dynamic springMVC= servletContext.addServlet("spring",new DispatcherServlet());
        //加载springMVC核心类
        springMVC.addMapping("/");
        //设置springmvc的配置文件位置

        springMVC.setInitParameter("contextConfigLocation","priv.lint.config.WebConfig");
        springMVC.setInitParameter("contextClass","org.springframework.web.context.support.AnnotationConfigWebApplicationContext");

    }
}
*/
