package spring_boot.session12bt03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_boot.session12bt03.config.HopitalConfig;

@RestController
public class HopitalController {
    private final HopitalConfig config;

    public HopitalController(HopitalConfig config) {
        this.config = config;
    }

    @GetMapping("/")
    public String home() {
        return "Tên bệnh viện: " + config.getHospitalName()
                + " Hotline: " + config.getHotline();
    }
}
