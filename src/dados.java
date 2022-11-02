import java.util.Scanner;
public class dados {
    public static void main(String[] args) {
        
    Scanner leer=new Scanner(System.in);

    int dado1=1,dado2=1;
    dado1=(int)(Math.random()*6);
    dado2=(int)(Math.random()*6);
    //procesar la informacion
    if (dado1==1 && dado2==1){
        System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",salio un par de unos en los dados, Ganaste!!");
    }
    else if (dado1+dado2==3){
    System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",salio un total  de Tres, Ganaste!!");
    }
    else if (dado1+dado2==11){
    System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",salio un Total de once en  los dados, Ganaste!!");
    }
    else if (dado1+dado2==12){
    System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",salio un Total de Doce en los dados, Ganaste!!");
    }
    else if (dado1+dado2==7){
    System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",salio un Total de siete  en los dados, Ganaste!!");
    }
    else {
        System.out.println("el lanzamiento arrrojo "+dado1+"y"+dado2+",El Lanzamiento no cayo en Ninguna Situacion Para Ganar Perdiste!!");
        leer .close();
    }
    
    }

    

}
