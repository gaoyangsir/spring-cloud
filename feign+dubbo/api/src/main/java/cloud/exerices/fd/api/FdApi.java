package cloud.exerices.fd.api;


import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@FeignClient(value = "fdCustomer")
public interface FdApi {
    @RequestMapping("/fd/getCustomer")
    public HashMap<String,String> getCustomer();
}
