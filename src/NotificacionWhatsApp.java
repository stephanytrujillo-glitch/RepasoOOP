public class NotificacionWhatsApp extends Notificacion {

    protected NotificacionWhatsApp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje de voz 00:51\"" + mensaje + "\" por WhatsApp" + this.receptorNotificacion);
    }

}
