package periodo3ejercicio6;
import java.util.Scanner;
public class Periodo3Ejercicio6 {
    public static void main(String[] args) {
      int fact=1, num, cont=1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        do {
            fact = fact*cont;
            cont = cont+1;
        } while (cont<=num);
        System.out.println("El factorial es: "+fact);
    }
    
}

