package com.pintabar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class PintabarZuulServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(PintabarZuulServerApplication.class).web(true).run(args);
	}
}
