package cloud.exerices.sentinel.controller;

import cloud.exercise.dubbo.api.DubboApi;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SentinelController {

    @DubboReference
    DubboApi dubboApi;

    @RequestMapping("/sentinel")
    public String hello(){
        return "hello sentinel";
    }

    @RequestMapping("/sentinel/dubbo")
    public HashMap<String, String> dubbo(){
        return dubboApi.getCustomer();
    }
    @RequestMapping("/sentinel/dubbo1")
    public HashMap<String, String> dubbo1(){
        return dubboApi.getCustomer();
    }

    /**
     * 热点管控 根据参数进行判定,参数类型只支持4类8种,依赖@SentinelResource注解才能生效
     * @param id
     * @param name
     * @return
     */
    @RequestMapping("/sentinel/hot")
    @SentinelResource(value = "hot",blockHandler = "hotHandle")
    public HashMap<String, String> hot(@RequestParam Integer id,@RequestParam String name){
        return dubboApi.getCustomer();
    }

    public HashMap<String,String> hotHandle(Throwable e){
        HashMap<String, String> map = new HashMap<>();
        map.put("msg","热点限流");
        return map;
    }





}
