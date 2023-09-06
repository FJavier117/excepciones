package trycatchfinally.main;

import trycatchfinally.main.ejemploEx.EjemploException;

public class Main {
    public static void main(String[] args) throws Exception {
        EjemploException ejemploException = new EjemploException();
        String [] ar = {"hola", "otro hola", "saludos"};
        ejemploException.suma(ar);
    }
}
