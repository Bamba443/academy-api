package sn.supdeco.academy_api.controller;

import sn.supdeco.academy_api.config.AcademyProperties;
import sn.supdeco.academy_api.config.Notificateur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ping")

public class PingController {

    private final AcademyProperties props;
    private final Notificateur notificateur;

    public PingController(AcademyProperties props, Notificateur notificateur) {
        this.props = props;
        this.notificateur = notificateur;
    }

    @GetMapping
    public PingResponse ping() {
        notificateur.envoyer("admin@supdeco.sn", "Ping reçu !");
        return new PingResponse(props.nom(), props.anneeUniversitaire(), "OK");
    }

    public record PingResponse(String nom, String anneeUniversitaire, String status) {
    }

}
