package com.sanjay.jwtbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SecureController {

    @GetMapping("/public")
    public Map<String, String> publicEndpoint() {
        return Map.of("message", "Welcome! This is a public endpoint accessible by anyone.");
    }

    @GetMapping("/secure")
    public Map<String, String> secureEndpoint() {
        return Map.of("message", "Authorized! You are viewing a secured endpoint guarded by JWT.");
    }
}
