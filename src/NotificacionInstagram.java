public class NotificacionInstagram extends Notificacion {

    protected NotificacionInstagram(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió la notificacion \"" + mensaje + "\" por instagram" + this.receptorNotificacion);
    }

}
