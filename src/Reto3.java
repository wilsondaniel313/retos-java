import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) throws Exception {
    Scanner fin=new Scanner(System.in);
    int moneda,Eleccion;
    moneda=(int)(Math.random()*2)+1;
    System.out.println("Digite 1 para escoger Cara o 2 para sello ");
    Eleccion=fin.nextInt();
    if (moneda==2 && Eleccion==2){
        System.out.println("salio Cara,usted escogio Cara Ganaste!!");
    }
    else if (moneda==2 && Eleccion==2){
        System.out.println(" salio Cara,usted escogio sello Perdiste!! ");
    }
    else if (moneda==2 && Eleccion==1){
        System.out.println("salio Sello,usted escogio sello Ganaste!! ");
    }
    else if (moneda==2 && Eleccion==2){
        System.out.println("salio Sello,usted escogio Cara Perdiste!! ");
    }
    else if (moneda==1 && Eleccion==2){
        System.out.println("Digitaste una opcion incorrecta ");
    }
    else 
     System.out.println("Datos incorrectos");
        fin .close();  
    }
}

