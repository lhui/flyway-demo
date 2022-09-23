package net.lihui.app.demo.flywaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDemoApplication {

    public static void main(String[] args) {
        if (args.length != 0 && args[0].equals("-flyway")) {
            RunFlywaySeparately.main(new String[]{});
        } else {
            SpringApplication.run(FlywayDemoApplication.class, args);
        }
    }

}
