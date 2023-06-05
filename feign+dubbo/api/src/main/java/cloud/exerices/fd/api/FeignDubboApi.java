package cloud.exerices.fd.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@FeignClient(value = "fdCustomer")
public interface FeignDubboApi {

    @RequestMapping("/getCustomer")
    public HashMap<String,String> getCustomer();
}
