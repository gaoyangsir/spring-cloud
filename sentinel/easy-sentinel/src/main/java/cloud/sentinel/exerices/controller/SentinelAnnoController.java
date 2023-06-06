package cloud.sentinel.exerices.controller;

import cloud.sentinel.exerices.exception.ExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelAnnoController {

    @SentinelResource(value = "hello",fallback = "fallback",blockHandler = "handle")
    @RequestMapping("/sentinel/anno1")
    public String hello(){
        return "hello";
    }

    public String fallback(Throwable t){
        return "降级ing";
    }

    public String handle(BlockException b){
        return "限流ing";
    }

    @SentinelResource(value = "hello2" ,fallbackClass = ExceptionUtil.class ,fallback = "fallbackException",blockHandlerClass = ExceptionUtil.class,blockHandler = "handleException")
    @RequestMapping("/sentinel/anno2")
    public String hello2(){
        return "hello2";
    }
}
