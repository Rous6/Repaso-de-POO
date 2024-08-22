import Modelo.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("♥ Hola mundo ♥");
         int n1 = 6;
         int n2 =7;
         int n3=6;
         int resultado = n1+n2+n3;
        System.out.println("la suma es: "+resultado);

        Persona pers =new Persona();
        System.out.println(pers.Caminar());

        int miedad=pers.Edad(22);
        System.out.println("Mi edad es: "+miedad);
        }



    }
