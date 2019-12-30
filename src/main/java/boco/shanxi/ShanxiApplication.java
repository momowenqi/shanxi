package boco.shanxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("boco.shanxi.mapper")
@EnableSwagger2
@SpringBootApplication
public class ShanxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShanxiApplication.class, args);
    }

}
