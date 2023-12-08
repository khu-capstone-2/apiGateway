package eureka.apiGateway.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "I'm healthy!";
    }

    @GetMapping("/")
    public String welcome(){
        return "I'm api gateway Server! hi!";
    }
}
