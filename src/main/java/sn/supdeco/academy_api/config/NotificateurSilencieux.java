package sn.supdeco.academy_api.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component 
@Profile ("dev")

public class NotificateurSilencieux implements Notificateur {

    @Override
    public void envoyer(String destinataire, String message) {
        // Ne fait rien
    }

}
