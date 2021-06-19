package com.vlabs.arc.ref.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return String.format("pinged arc-cache @ [%s]", LocalDateTime.now());
    }

}
