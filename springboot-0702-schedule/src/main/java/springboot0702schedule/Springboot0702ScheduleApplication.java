package springboot0702schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Springboot0702ScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0702ScheduleApplication.class, args);
    }

}
