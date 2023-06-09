package cloud.exerices.sentinel;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentinelApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplicationContext.class);
    }
}
