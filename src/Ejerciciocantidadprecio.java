import java.util.Scanner;
public class Ejerciciocantidadprecio {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cantidad,precio,referencias=0,subtotal,Total=0,pagoclientes,cambio;
        String Si="si";
        String VerificacionTelefonica;
        for(int i=1;i<=5;i++){
            System.out.println("digite el precio del producto ");
            precio=leer.nextInt();
            System.out.println("digite la cantidad del producto ");
            cantidad=leer.nextInt();
            subtotal=precio*cantidad;
            System.out.println(cantidad+"de producto de "+precio+"es"+cantidad);
            //inciciar el contador de resultados de la compra
            referencias=referencias+1;
            //iniciamos acumulador para el total de la compra
            Total=Total+subtotal;
        }
        System.out.println("el total de la compra es "+Total);
        System.out.println("la cantidad de numeros de la compra es"+referencias);

        System.out.println("escriba la cantida con la que va a pagar la compra ");
        pagoclientes=leer .nextInt();

        cambio=pagoclientes=Total;
        System.out.println("usted pago con " +pagoclientes+ "pesos y la compra contada es" +Total+ "por lo tanto su cambio es" +cambio);

        System.out.println("escriba la cantida con la que va a pagar la compra ");
        VerificacionTelefonica= leer .next();
        if (VerificacionTelefonica.equals(Si));
        System.out.println("no pierdas mas minutos, aquiere ya la telefonia movil claro ");


        leer.close();
  } 
}