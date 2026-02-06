public class NotificacionSMS extends Notificacion {

    protected NotificacionSMS(Sttring receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public String enviarMensaje(String mensaje) {
        System.out.println("Se envió el SMS \"" + mensaje + "\" por correo" + this.receptorNotificacion);
    }

}
