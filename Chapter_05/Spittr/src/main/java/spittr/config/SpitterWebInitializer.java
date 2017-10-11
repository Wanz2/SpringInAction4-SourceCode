package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/**
 * 实现了WebApplicationInitializer接口的类将完成配置Servlet容器的任务
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 该方法返回的类将用来定义ContextLoaderListener创建的应用上下文中的bean
     * ContextLoaderListener加载应用中除了Web组件的bean之外的其他bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 该方法返回的类将用来定义DispatcherServlet应用上下文中的bean
     * DispatcherServlet加载包含Web组件的bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * 该方法会将一根或多个路径映射到DispatcherServlet上
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}