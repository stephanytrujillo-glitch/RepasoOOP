public class NotificacionCelular extends Notificacion{
    protected NotificacionCelular(String receptorNotificacion) { super(receptorNotificacion ); }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje  \"" + mensaje + "\" por celular" + this.receptorNotificacion);
    }
}
