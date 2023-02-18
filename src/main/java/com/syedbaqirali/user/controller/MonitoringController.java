package com.syedbaqirali.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h2/monitor")
public class MonitoringController {

    @GetMapping("/")
    public String monitor(){
        return "Monitoring is on...";
    }
}
