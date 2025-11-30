package in.srihari.Moneymanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/health")
public class HomeController {
    @GetMapping
    public String healthcheck(){
        return "Application is running";
    }
}
