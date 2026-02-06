//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main ( String [] args ) {
        CuentaBancaria cuenta1 = new CuentaBancaria( id "1", saldoinicial: 100);
        cuenta1.retirar( valorARetirar: 100);
        cuenta1.consignar( valorAConsignar: 150);
        system.out.printf("El saldo de la cuenta es: " + cuenta1.getSaldo() );

        Notificacion [] notificaciones = new notificacion[2];
        notificaciones[0] = new NotificacionCorreo( receptorNotificacion: "Pepito" );
        notificaciones[1] = new NotificacionSMS( receptorNotificacion: "Juanito");

        notificaciones[0].enviarMensaje("Hola mi amigo");
        notificaciones[1].enviarMensaje("Hola mi broco");

        }
    }

