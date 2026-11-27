package sn.supdeco.academy_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.academy")

public record AcademyProperties(String nom, String anneeUniversitaire) {

}
