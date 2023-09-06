package login.main;

import exceptionP.ErrorFisicoException;
import login.Aplicacion;
import login.user.Usuario;

public class Main {
    public static void main(String[] args)  {
        try {
            Aplicacion app = new Aplicacion();
            // intento el login
            Usuario u = app.login("Carlos", "Carlos123");
            // muestro el resultado
            System.out.println(u);
        } catch (ErrorFisicoException ex) {
            // ocurrio un error
            System.out.print("Servicio temporalmente interrumpido: ");
            System.out.println(ex.getMessage());
        }
    }
}