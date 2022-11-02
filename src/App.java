import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        //definir un objeto scanner
        Scanner leer=new Scanner(System.in);

        //recibe el radio del circulo y calcula su area

        //datos de entrada
        final Double PI=3.1416;
        Double radio,area;
        System.out.println ("ingrese el radio del circulo");
        radio=leer.nextDouble();

        //procesar la informacion
        area= PI*radio*radio;

        //salida
        System.out.println("el area del circulo con radio"+radio+"es"+area);
        leer.close();

        
    }
}
