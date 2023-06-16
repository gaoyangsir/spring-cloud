package cloud.exercise.dubbo.controller;

import cloud.exercise.dubbo.api.DubboApi;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.HashMap;

@DubboService
public class CustomerController implements DubboApi {

    @Autowired(required = false)
    Environment environment;


    @Override
    @SentinelResource(value = "getCustomer", fallback = "fallback", blockHandler = "handle")
    public HashMap<String, String> getCustomer() {
        HashMap<String, String> result = new HashMap<>();
        result.put("port", environment.getProperty("server.port"));
        return result;
    }

    public HashMap<String, String> fallback(Throwable t) {
        HashMap<String, String> map = new HashMap<>();
        map.put("msg","降级");
        return map;
    }
    public HashMap<String, String> handle(BlockException t) {
        HashMap<String, String> map = new HashMap<>();
        map.put("msg","限流");
        return map;
    }

}
