package cloud.exerices.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {


    @RequestMapping("/sentinel")
    public String hello(){
        return "hello sentinel";
    }
}
