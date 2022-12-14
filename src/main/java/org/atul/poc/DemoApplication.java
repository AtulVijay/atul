package org.atul.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args).web(WebApplicationType.NONE);

		new SpringApplicationBuilder(DemoApplication.class).web(WebApplicationType.REACTIVE)
								.run(args);

/**
 * 	new SpringApplicationBuilder(DemoApplication.class)
 * 				.web(WebApplicationType.NONE)
 * 				.run(args);
  */

	}


}
