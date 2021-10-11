package br.com.nfetools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;



import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.com.nftools.model"})
public class MaisNfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisNfeApplication.class, args);
	}

		
		
		
	
	   @Configuration
	   @EnableSwagger2 
	   public class SwaggerConfig{
	  
	  
	 // @Bean 
	  public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
	  .select() 
	  .apis(RequestHandlerSelectors.basePackage("br.com.nftools.controller"))
	  .apis(RequestHandlerSelectors.any())
	  .paths(PathSelectors.ant("*"))
	  .paths(PathSelectors.any()) 
	  .build() 
	  .apiInfo(ApiInfo());
	
	  
	  }
	  
	  
	  private ApiInfo ApiInfo() {
	        return new ApiInfoBuilder()
	                .title("API REST Emissão De NF-e")
	                .description("\"Spring Boot REST API for Online Store\"")
	                .version("1.0.0")
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
	                .build();
	        
	  }
	  
	  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");
	        registry.addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	  
	  
	
	  
	  }
	  
	  
	  

	  
	  
	  
	  }
	 

	public Object start() {
		return "index";
	}

}
