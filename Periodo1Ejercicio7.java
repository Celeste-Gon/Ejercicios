package periodo1ejercicio7;
import java.util.Scanner;
public class Periodo1Ejercicio7 {
    public static void main(String[] args) {
               String nombre,clave;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese Nombre de usuario: ");
       nombre = entrada.nextLine();
       System.out.println("Ingrese Clave de usuario: ");
       clave = entrada.nextLine();
       if(nombre.equals("juan") && clave.equals("123456")){
           System.out.println("Bienvenido al Sistema");
       }
       else{
           System.out.println("Nombre de Usuario o ContraseÃ±a Incorrecto");
       }
    }
}

