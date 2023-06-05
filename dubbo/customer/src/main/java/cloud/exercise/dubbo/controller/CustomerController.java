package cloud.exercise.dubbo.controller;

import cloud.exercise.dubbo.api.DubboApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.HashMap;

@DubboService
public class CustomerController implements DubboApi {

    @Autowired(required = false)
    Environment environment;


    @Override
    public HashMap<String, String> getCustomer() {
        HashMap<String, String> result = new HashMap<>();
        result.put("port",environment.getProperty("server.port"));
        return result;
    }
}
