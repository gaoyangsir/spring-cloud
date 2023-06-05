package cloud.exerices.customer.controller;

import cloud.exerices.fd.api.FdApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@DubboService
@RestController
public class Fd2CustomerController implements FdApi {

    @Autowired
    Environment environment;

    @RequestMapping("/fd/getCustomer")
    public HashMap<String, String> getCustomer(){
        HashMap<String, String> map = new HashMap<>();
        map.put("port",environment.getProperty("server.port"));
        return map;
    }
}
