package periodo3ejercicio2;
import java.util.Scanner; 
public class Periodo3Ejercicio2 {
    public static void main(String[] args) {
       Scanner objetoNum = new Scanner (System.in);
        int valinicial, valfinal;
        
        valinicial=8;
        System.out.println("Multiplos de 8 hasta 500");
        
        while (valinicial <=500)
        {
            System.out.println(valinicial+ ",");
            valinicial=valinicial+8;
        }
    }
    
}

