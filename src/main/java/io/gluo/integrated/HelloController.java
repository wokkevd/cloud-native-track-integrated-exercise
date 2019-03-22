package io.gluo.integrated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class HelloController {

    @Value("${secret.background.color}")
    private String backgroundColor;

    @Value("${secret.user.name}")
    private String userName;

    @GetMapping
    public HelloResource hello() {
        return new HelloResource("Hello " + userName + "!", backgroundColor);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class HelloResource {

        private String message;
        private String backgroundColor;
    }
}
