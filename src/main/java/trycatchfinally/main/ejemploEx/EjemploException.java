package trycatchfinally.main.ejemploEx;

public class EjemploException {

    public void dividir(float a, float b){
        try{
            System.out.println("Holaaaaaaaaaaaaaaa!");
        }catch (Exception ex){

            System.out.println("Entre al catch...");

        }finally {
            System.out.println("Siempre me ejecuto!");

        }
    }


    public void suma (String[] a) throws Exception{
        int val;
        try{
            for (int i = 0; i <a.length ; i++) {
                val = Integer.parseInt(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dentro del catch: "+ ex.getCause());
        }finally {
            System.out.println("Siempre entro aquí");
        }
    }


}
