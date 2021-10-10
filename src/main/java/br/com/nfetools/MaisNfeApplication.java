package br.com.nfetools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackages = {"model"})
public class MaisNfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisNfeApplication.class, args);
	}

	/*
	 * @Configuration
	 * 
	 * @EnableSwagger2 public class SwaggerConfig {
	 * 
	 * 
	 * @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
	 * .select() .apis(RequestHandlerSelectors.any())
	 * 
	 * .paths(PathSelectors.any()) .build() .apiInfo(apiInfo()); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public ApiInfo apiInfo() { return new
	 * ApiInfoBuilder().title("API Integração Grfood").version("1.0.0")
	 * .description("Essa é uma API de desenvolvida para testes.")
	 * .license("Apache License Version 2.0")
	 * .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0") .contact(new
	 * Contact ("AndreNwaDEV", "andrenwadev@gmail.com", "www.maissistem.com.br"))
	 * 
	 * .build();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public Object start() {
		return "index";
	}

}