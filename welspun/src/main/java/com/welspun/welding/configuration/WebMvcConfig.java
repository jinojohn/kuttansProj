package com.welspun.welding.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.CssLinkResourceTransformer;
import org.springframework.web.servlet.resource.VersionResourceResolver;

@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/static/**")
	            .addResourceLocations("/resources/static/")
	            .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS))
	            .resourceChain(false)
	            .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"))
	            .addTransformer(new CssLinkResourceTransformer());
	}
}
