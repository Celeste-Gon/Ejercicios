package periodo1.ejercicio5;
import java.util.Scanner;
public class Periodo1Ejercicio5 {
    public static void main(String[] args) {
      Scanner Entrada = new Scanner(System.in);
      int reglas;
      double nota;
      System.out.println("Usted cumple las reglas de la Universisdad");
      System.out.println("Ingrese numero: \n 1. Siempre \n 2. Aveces \n 3. Nunca");
      reglas = Entrada.nextInt();
      System.out.println("Que nota obtubo en el laboratorio");
      nota = Entrada.nextDouble();
      if (reglas == 1) {
          if (nota >= 8 & nota <= 10){
              nota = 10;
          } else {
              System.out.println("Nota invalida");
          }         
      }else if (reglas == 2) {
          if (nota < 6){
                  nota = nota + 0.5;
      } else if (nota >= 6 & nota < 8){
          nota = nota + 0.7;
      } else {
          System.out.println("Nota invalida");
      }
} else {
          System.out.println("Usted debe cumplir la reglas");
      }
      System.out.println("La nueva nota es: " + nota);
}
}

