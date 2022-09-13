package periodo2ejercicio5;
import java.util.Scanner;
public class Periodo2Ejercicio5 {
    public static void main(String[] args) {
        double area, descuento, preciototal=1000, total;
        Scanner ingresar = new Scanner (System.in);
        area = ingresar.nextDouble();
        int valor = 0;
        if (area>400 && area<500); {
        valor = 1;
        } else if (area>500 && area<1000) {
            valor = 2;
        } else if (area>1000) {
            valor = 3;
        }
            switch (valor) {
                case 1:
                    descuento = preciototal*.10;
                    total = preciototal-descuento;
                    JOptionPane.showMessageDialog(null, "Se aplica un descuento de: 10%");
                    JOptionPane.showMessageDialog(null, "El precio es de: " +total);
                    break;
                case 2:
                    break;
                case 3 :
                    break;
                default:
            }
    }
        
