package com.l0tu2.organisation.chart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build()
        .pathMapping("/")
        ;
  }

  @Bean
  UiConfiguration uiConfig() {
    return new UiConfiguration(
        "validatorUrl",// url
        "none",       // docExpansion          => none | list
        "alpha",      // apiSorter             => alpha
        "schema",     // defaultModelRendering => schema
        UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
        false,        // enableJsonEditor      => true | false
        true,         // showRequestHeaders    => true | false
        60000L);      // requestTimeout => in milliseconds, defaults to null (uses jquery xh timeout)
  }
}