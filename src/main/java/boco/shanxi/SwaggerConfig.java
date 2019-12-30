package boco.shanxi;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-25 10:52
 * @description:
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig{

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("boco.shanxi.controller"))
                .paths(PathSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("陕西项目")
                .description("打包时注释掉swagger")
                .license("shanxi 1.0")
                .licenseUrl("")
                .termsOfServiceUrl("")
                .version("v2.0.0")
                .contact(new Contact("","",""))
                .build();
    }

}
