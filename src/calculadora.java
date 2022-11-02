import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) throws Exception {
    Scanner leer=new Scanner(System.in);
    int op,num,num2;
    System.out.println("Menu opciones \n 1.Suma  \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Potenciacion \n 6.Raiz cuadrada \n ingrese el numero de la opcion que desea  ");
    op=leer.nextInt();
    System.out.println("ingrese el numero 1");
    num=leer.nextInt();
    System.out.println("ingrese el numero 2");
    num2=leer.nextInt();
    
    switch(op){
        case 1:
            int suma=num+num2;
            System.out.println("el resulttado es "+suma);
        break;
        
        case 2:
            int resta=num+num2;
            System.out.println("el resulttado es "+resta);
        break;

        case 3:
            int multiplicacion=num+num2;
            System.out.println("el resulttado es "+multiplicacion);
        break;

        case 4:
            int division=num+num2;
            System.out.println("el resulttado es "+division);
        break;

        case 5:
            int potenciacion=num+num2;
         System.out.println("el resulttado es "+potenciacion);
        break;

        case 6:
         Double Raizcuadrada1= Math.sqrt(num) ;
         Double Raizcuadrada2= Math.sqrt(num2);
         System.out.println("La raiz cuadrada de: "+num+"es"+Raizcuadrada1+"La Raiz cuadrada de:  "+num2+"es"+Raizcuadrada2 );
        break;
        default:
        System.out.println("fin");
      
        break;
   }
    leer.close();

}
}