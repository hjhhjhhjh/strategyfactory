package io.github.hjhhjhhjh.strategyfactory.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
@SpringBootApplication
public class SpringTestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringTestMain.class, args);

        PermissionStrategyFactory bean = run.getBean(PermissionStrategyFactory.class);
        BasePermissionHandler rootHandler = bean.getInstance("root");
        rootHandler.handler("hello");

        BasePermissionHandler nonRootHandler = bean.getInstance("nonroot");
        nonRootHandler.handler("hello");

    }
}
