public abstract class Notificacion {
    protected final String receptorNotificacion;

    protected Notificacion(Sttring receptorNotificacion) {
        if(receptorNotificacion == null || receptorNotificacion.isBlank()) {
            trow new IllegalArgumentException("El receptor es invalido");
        }
        this.receptorNotificacion = receptorNotificacion;

    }
    public abstract String enviarMensaje(String mensaje);
}
