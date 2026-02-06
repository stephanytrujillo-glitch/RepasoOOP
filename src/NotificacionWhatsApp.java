public class NotificacionWhatsApp extends Notificacion {

    protected NotificacionWhatsApp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por WhatsApp" + this.receptorNotificacion);
    }

}
