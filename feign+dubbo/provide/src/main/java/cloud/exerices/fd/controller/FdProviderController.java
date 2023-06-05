package cloud.exerices.fd.controller;

import cloud.exerices.fd.api.FdApi;
import cloud.exerices.fd.api.FeignDubboApi;
import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FdProviderController {

    @Autowired(required = false)
    FeignDubboApi feignDubboApi;

    @Autowired
    @DubboTransported
    FdApi fdApi;

    @RequestMapping("/getCustomer")
    public HashMap getCustomer()
    {
        return feignDubboApi.getCustomer();
    }

    @RequestMapping("/fd/getCustomer")
    public HashMap getFdCustomer()
    {
        return fdApi.getCustomer();
    }
}
