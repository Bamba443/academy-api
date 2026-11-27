package sn.supdeco.academy_api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component 
@Profile ("dev")

public class NotificateurConsole implements Notificateur {

    private static final Logger log = LoggerFactory.getLogger(NotificateurConsole.class);
    @Override
    public void envoyer(String destinataire, String message) {
        log.info("[NOTIFICATION -> {}] {}", destinataire, message);
    }

}
