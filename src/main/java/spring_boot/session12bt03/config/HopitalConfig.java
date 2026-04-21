package spring_boot.session12bt03.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HopitalConfig {
    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hotline;

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHotline() {
        return hotline;
    }
}
