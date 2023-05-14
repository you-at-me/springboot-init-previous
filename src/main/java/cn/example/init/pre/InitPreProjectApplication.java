package cn.example.init.pre;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.example.init.pre.mapper")
// @EnableAspectJAutoProxy(exposeProxy=true,proxyTargetClass=true)
public class InitPreProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitPreProjectApplication.class, args);
    }

}
