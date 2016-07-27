package com.online.config;

import com.online.Interceptor.ExceptionInterceptor;
import com.online.Interceptor.LoginCheckInterceptor;
import com.online.Interceptor.PrivilegeInterceptor;
import com.online.spring.AbstractWebMvcConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableAutoConfiguration
@Import({CoreProperties.class, RedisConfiguration.class, MyBatisConfiguration.class})
@ComponentScan(basePackageClasses = {com.online.dao.Pkg.class, com.online.service.Pkg.class,com.online.controller.Pkg.class})
public class WebappConfiguration extends AbstractWebMvcConfiguration {

    @Configuration
    public static class CustomConversionService extends DelegatingWebMvcConfiguration {
        @Override
        public FormattingConversionService mvcConversionService() {
            // Use the DefaultFormattingConversionService but do not register defaults
            DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService(false);

            // Ensure @NumberFormat is still supported
            conversionService.addFormatterForFieldAnnotation(new NumberFormatAnnotationFormatterFactory());

            // DateTimeFormatterFactoryBean t = new DateTimeFormatterFactoryBean();
            // t.setPattern("yyyy-MM-dd HH:mm:ss");
            // JodaTimeFormatterRegistrar registrar = new JodaTimeFormatterRegistrar();
            // registrar.setDateTimeFormatter(t.getObject());
            // registrar.setDateFormatter(t.getObject());
            // registrar.setTimeFormatter(t.getObject());
            // registrar.registerFormatters(conversionService);

            DateFormatterRegistrar registrar = new DateFormatterRegistrar();
            registrar.setFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
            registrar.registerFormatters(conversionService);

            return conversionService;
        }
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // registry.addInterceptor(new LocaleInterceptor());
        // registry.addInterceptor(new
        // ThemeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
        // registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/secure/*");
        registry.addInterceptor(loginCheckInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(privilegeInterceptor()).addPathPatterns("/**");
    }


    // 添加方法参数验证器
    @Bean
    public MethodValidationPostProcessor configMethodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @Bean
    public LoginCheckInterceptor loginCheckInterceptor() {
        return new LoginCheckInterceptor();
    }

    @Bean
    public PrivilegeInterceptor privilegeInterceptor() {
        return new PrivilegeInterceptor();
    }

    @Bean
    public ExceptionInterceptor exceptionInterceptor() {
        return new ExceptionInterceptor();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/static/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/static/asset/**").addResourceLocations("classpath:/static/asset/");
        registry.addResourceHandler("/static/images/**").addResourceLocations("classpath:/static/images/");
    }


    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("utf-8");
        return commonsMultipartResolver;
    }

    // 支持PUT请求
    @Bean
    public HttpPutFormContentFilter httpPutFormContentFilter() {
        return new HttpPutFormContentFilter();
    }

    // 统一UTF-8编码
    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }


}
