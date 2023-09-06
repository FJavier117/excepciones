package suma;


public class Operacion {

    public float dividir(float a, float b) throws MiException
    {
        float respuesta;
        if (a ==0 && b == 0){
            throw  new MiException("No es posible la división 0 / 0", new Throwable());
        } else if (b == 0) {
            throw  new MiException("No es posible la división: "+  a +"/"+ b, new Throwable());
        }else {
            respuesta = a /b;
        }

        return respuesta;
    }


}
