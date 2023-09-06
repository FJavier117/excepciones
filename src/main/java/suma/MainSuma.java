package suma;


public class MainSuma {
    public static void main(String[] args)  {
        try{
            Operacion operacion = new Operacion();
            float res = operacion.dividir(123,0);
            System.out.println("resultado: " + res);
        }catch (MiException ex){
            System.out.println("Ha ocurrido un error: "+ ex.getCause());
        }
    }
}
