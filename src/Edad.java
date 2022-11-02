 import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
    //definir un objeto;
    Scanner leer=new Scanner(System.in);
    int Edad;
    System.out.println("ingrese su edad");
    Edad=leer.nextInt();

    if(Edad>=17){
        System.out.println("bienvenido siga");
    }
    else{
        System.out.println("pa su cas a lava platos");
    }
    leer.close();
 }  
}