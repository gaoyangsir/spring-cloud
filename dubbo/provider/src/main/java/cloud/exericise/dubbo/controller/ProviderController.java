package cloud.exericise.dubbo.controller;

import cloud.exercise.dubbo.api.DubboApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProviderController {

    @DubboReference
    DubboApi dubboApi;

    @RequestMapping("/getCustomer")
    public HashMap<String, String> getCustomer(){
        return dubboApi.getCustomer();
    }

}
