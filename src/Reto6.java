import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        String Repetir="s";
        int TotalCompra=0,Subtotal,Cantidad,Precio,Roja,Azul,Amarillo,PrecioFinalRojo,PrecioFinalAzul,PrecioFinalAmarillo,PagoCliente,CambioRoja,CambioAzul,CambioAmarillo,CambioTacaño;
        System.out.println("Bienvenido A Supermercados Noé");
        int ColorBola= (int)(Math.random() * 4) + 1;
        Scanner leer= new Scanner(System.in);

        while (Repetir.equalsIgnoreCase("s")){
            System.out.println("Ingrese El Precio Del Producto Adquirido");
            Precio=leer.nextInt();
            System.out.println("Ingrese La Cantidad Del Producto Adquirido");
            Cantidad=leer.nextInt();
            Subtotal=Precio*Cantidad;
            TotalCompra=TotalCompra+Subtotal;
            System.out.println("Si desea ingresar otro producto, digite s, o n para salir");
            Repetir=leer.next();
        }
        System.out.println("El valor de la compra es "+TotalCompra);
        Roja=(int) (TotalCompra*.10); PrecioFinalRojo= (int)(TotalCompra- Roja);
        Azul= (int)(TotalCompra* .30); PrecioFinalAzul= (int)(TotalCompra- Azul);
        Amarillo= (int)(TotalCompra * .50); PrecioFinalAmarillo= (int)(TotalCompra - Amarillo);

        if (TotalCompra> 50000){
            System.out.println(TotalCompra+" Mil es mayor a 50000 mil, Por lo tanto le obsequiamos el descuento Y Tendra El Privilegio De Sacar Una Bola, y la bola que saco fue ");
            switch ( ColorBola )
            {
                case 1:
                    System.out.println("Roja!..., Por Lo Tanto El Valor De Descuento Que Ha Ganado Es Del 10%, el cual es de "+Roja+ " mil y el valor final a pagar es "+PrecioFinalRojo+" mil");
                    break;
                case 2:
                    System.out.println("Azul!..., Por Lo Tanto El Valor De Descuento Que Ha Ganado Es Del 30%, el cual es de "+Azul+" mil y el valor final a pagar es "+PrecioFinalAzul+" mil");
                    break;
                case 3:
                    System.out.println("Amarilla!..., Por Lo Tanto El Valor De Descuento Que Ha Ganado Es Del 50%, el cual es de "+Amarillo+" mil y el valor final a pagar es "+PrecioFinalAmarillo+" mil");
                    break;
                case 4:
                    System.out.println("Felicidades,Sacaste La Bola Blanca!..., Te Llevas Tu Compra Totalmente Gratis");
                    break;
            }
        }
        else{
         System.out.println("50000 Mil es mayor a "+TotalCompra+" mil, Por lo tanto No Se Le Aplica El Obsequio Por Tacaño");
        }

        System.out.println("Ingresar El Valor Con El Que Pagara El Cliente ");
        PagoCliente=leer.nextInt();

        CambioRoja=PagoCliente-PrecioFinalRojo; CambioAmarillo=PagoCliente-PrecioFinalAmarillo; CambioAzul=PagoCliente-PrecioFinalAzul; CambioTacaño=PagoCliente-TotalCompra;

        if (TotalCompra>50000 && ColorBola==1){
           System.out.println("El Cambio Que Recibe El Cliente Es "+CambioRoja+" pesos");
        }
        else if (TotalCompra>50000 && ColorBola==2){
            System.out.println("El Cambio Que Recibe El Cliente Es "+CambioAzul+" pesos");
        }
        else if (TotalCompra>50000 && ColorBola==3){
            System.out.println("El Cambio Que Recibe El Cliente Es "+CambioAmarillo+" pesos");
        }
        else if (TotalCompra>50000 && ColorBola==4){
            System.out.println("Se Le Devuelve Su Dinero Y Se Lleva Todos Sus Productos Totalmente Gratis, Felicidades...");
        }
        else if  (TotalCompra<50000){
           System.out.println("El Cambio Que Recibe El Cliente Es "+CambioTacaño+" pesos");
        }
        else{
            System.out.println("El Valor Con El Que Va A Pagar No Es Suficiente");
        }
        leer.close();
    }
}