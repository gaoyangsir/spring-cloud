package cloud.exerices.fd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cloud.exerices")
public class FdProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdProviderApplication.class);
    }
}
