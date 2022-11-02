import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) throws Exception {
        //Definir un objeto
        Scanner leer=new Scanner(System.in);
        //defina radio del circulo y calcula el area
       //defina la entrada double
    
       double dosisvacuna,pesobebe,mesesbebe;
       System.out.println("ingrese el peso del bebe ");
       pesobebe=leer .nextDouble();
       System.out.println("ingrese los meses del bebe ");
       mesesbebe=leer.nextDouble();
       System.out.println("el peso del bebe es "+pesobebe+"la edad del bebe es "+mesesbebe);
       //proceso de in formacion
       dosisvacuna=(pesobebe+10)/(mesesbebe*10)*8;
       //salida
       System.out.println("la dosis e vacuna que se le debe aplicar al bebe es  "+dosisvacuna+"miligramos");

       leer .close();


    }
}