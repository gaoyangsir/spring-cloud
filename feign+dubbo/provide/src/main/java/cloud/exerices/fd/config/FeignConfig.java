package cloud.exerices.fd.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level getLevel(){
        return Logger.Level.BASIC;
    }
}
