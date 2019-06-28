package zbh.springboot.springboot0701asyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
/*开启异步功能*/
@EnableAsync
@SpringBootApplication
public class Springboot0701AsynApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0701AsynApplication.class, args);
    }

}
