package net.lihui.app.demo.flywaydemo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@Import({
        DataSourceAutoConfiguration.class,
        FlywayAutoConfiguration.class,
})
public class RunFlywaySeparately {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RunFlywaySeparately.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
