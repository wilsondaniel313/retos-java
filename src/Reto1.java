import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
       
        //definir un objeto scanner
        Scanner leer=new Scanner(System.in);

        //datos de entrada
        float centigrados;
        int  fareheint;
        System.out.println("ingrese los datos Fahreint");
        fareheint=leer.nextInt();
    
        //procesar la informacion
        centigrados=(float)((fareheint-32)/1.8);

        //salida
        System.out.println("los farehint"+fareheint+"se convierten a"+centigrados+"entoncews puedes colocar tu horno A"+centigrados);
        leer.close();
    
}

}