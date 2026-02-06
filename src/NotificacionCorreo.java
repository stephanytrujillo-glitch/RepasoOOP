public class NotificacionCorreo extends Notificacion {

    protected NotificacionCorreo(Sttring receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public String enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por correo" + this.receptorNotificacion);
    }

}
