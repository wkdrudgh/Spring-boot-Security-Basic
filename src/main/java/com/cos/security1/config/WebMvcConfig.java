package com.cos.security1.config;


import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Bean : 개발자가 제어 불가능한 라이브러리 또는 설정을 위한 클래스를 등록하는 경우
// @Configuration : 1개 이상의 @Bean을 제공하는 클래스를 등록하는 경우
// @Component : 개발자가 직접 개발한 클래스를 Bean으로 등록 하는 경우
@Configuration 
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		MustacheViewResolver resolver = new MustacheViewResolver();
		
		resolver.setCharset("UTF-8");
		resolver.setContentType("text/html; charset=UTF-8");
		resolver.setPrefix("classpath:/templates/");
		resolver.setSuffix(".html");
		
		registry.viewResolver(resolver);
		
	}
}
