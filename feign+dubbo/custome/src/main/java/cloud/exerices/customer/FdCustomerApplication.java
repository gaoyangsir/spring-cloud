package cloud.exerices.customer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cloud.exerices")
public class FdCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdCustomerApplication.class);
    }
}
