public class NotificacionFacebook extends Notificacion {

    protected NotificacionFacebook(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" de Facebook" + this.receptorNotificacion);
    }

}
