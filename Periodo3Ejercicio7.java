package periodo3ejercicio7;
import java.util.Scanner;
public class Periodo3Ejercicio7 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        int numero1, numero2, respues, contador;
        System.out.println("Ingresar el primer numero: ");
        numero1 = objeto.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = objeto.nextInt();
        contador = numero1;
        while (contador > numero2) {
            System.out.println("contador");
            contador--;
        }
    }
    
}
