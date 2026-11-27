package sn.supdeco.academy_api.config;

public interface Notificateur {
    void envoyer(String destinataire, String message);
}
