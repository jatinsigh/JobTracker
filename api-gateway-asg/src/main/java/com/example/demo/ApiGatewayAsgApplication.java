package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


import com.example.demo.filters.ErrorFilter;
import com.example.demo.filters.PostFilter;
import com.example.demo.filters.PreFilter;
import com.example.demo.filters.RouterFilter;


@SpringBootApplication
@EnableZuulProxy
@RefreshScope
@Configuration
@EnableEurekaClient
public class ApiGatewayAsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayAsgApplication.class, args);
	}
	@Bean
	public PreFilter myFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouterFilter routerFilter() {
		return new RouterFilter();
	}

}
