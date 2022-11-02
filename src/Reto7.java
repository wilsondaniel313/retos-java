 import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        String Repetir="s";
        int ValorGlobal=500000,VecesJugadas=0,Moneda,Elección,DineroApostado;

        while (Repetir.equalsIgnoreCase("s")){
            Moneda=(int)(Math.random()*2)+1;
            System.out.println("Digite La Cantidad De Dinero Que Va A Apostar, Recuerde Que El Valor Global Es De "+ValorGlobal+" mil pesos");
            DineroApostado=leer.nextInt();
            ValorGlobal=ValorGlobal-DineroApostado;

            System.out.println("digite 1 para escoger Cara o 2 Para Sello ");
            Elección=leer.nextInt();
            if (Moneda==1 && Elección==1){
                System.out.println("Salió Cara, usted escogió cara, Ganaste!...");
                ValorGlobal=ValorGlobal+(DineroApostado*2);
            }
            else if(Moneda==1 && Elección==2){
                System.out.println("Salió Cara, usted escogió Sello, Perdiste!...");
            }
            else if(Moneda==2 && Elección==2){
                System.out.println("Salió Sello, usted escogió Sello, Ganaste!...");
                ValorGlobal=ValorGlobal+(DineroApostado*2);
            }
            else if(Moneda==2 && Elección==1){
                System.out.println("Salió Sello, usted escogió Cara, Perdiste!...");
            }
            else if(Moneda!=1 || Elección!=2 ){
                System.out.println("Digitaste una opción incorrecta");
            }
            else{
                System.out.println("Datos Incorrectos");
            }
            VecesJugadas=VecesJugadas+1;
            System.out.println("El Valor Global Está En "+ValorGlobal+" mil pesos");
            System.out.println("Si desea volver a jugar digite s, o n para salir");
            Repetir=leer.next();
        }
        System.out.println("Usted Jugó "+VecesJugadas+" veces, y acumulo un total de "+ValorGlobal+" mil pesos");
        leer.close();
    }
}