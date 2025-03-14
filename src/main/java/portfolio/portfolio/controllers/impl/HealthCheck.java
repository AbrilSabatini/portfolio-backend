package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/health")
public class HealthCheck {

    @GetMapping
    public String HealthCheck() {
        return "ok";
    }
}
