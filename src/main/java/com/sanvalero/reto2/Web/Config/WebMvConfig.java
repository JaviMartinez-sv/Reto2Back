package com.sanvalero.reto2.Web.Config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
    @ComponentScan("com.sanvalero.reto2.Web.Config")
    public class WebMvConfig implements WebMvcConfigurer{
        @Bean
        public CookieLocaleResolver localeResolver() {
            return new CookieLocaleResolver();
        }
    
        @Bean
        public LocaleChangeInterceptor localeInterceptor() {
            LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
            localeInterceptor.setParamName("lang");
            return localeInterceptor;
        }
    
        @Bean(name = "messageSource")
        public MessageSource getMessageResource() {
            ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
            messageSource.setBasenames("classpath:i18n/messages");
            messageSource.setDefaultEncoding("UTF-8");
            return messageSource;
        }
    
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(localeInterceptor());
    
        }
    }
    

