package periodo2ejercicio3;
public class Periodo2Ejercicio3 {
    public static void main(String[] args) {
         String Branch = "CSE";
       int year = 2;
       
       switch (year)
       {
           case 1:
               System.out.println("Cursos electivos, Ingles, Calculo");
               break;
           case 2:
               switch (Branch)
               {
                   case "CCE":
                       System.out.println("Cursos electivos : Machine Learning, Big Data");
                       break;
                       
                   case "ECE":
                       System.out.println("Cursos Electivos : Programacion");
                       break;
                       
                   default:
                       System.out.println("Cursos electivos : Ingenieria de Software");
                   
               }
       }
    }
    
}
