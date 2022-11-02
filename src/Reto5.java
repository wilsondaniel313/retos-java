import java.util.Scanner;
public class Reto5 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    Scanner fin=new Scanner(System.in);
    String nombre,apellido;
    System.out.println("ingresee su nombre");
    nombre=fin.nextLine();
    nombre=nombre.toUpperCase();
    int longitud=nombre.length();
    System.out.println("ingrese su apellido");
    apellido=fin.nextLine();
    String nombrecompleto=nombre.concat(" ").concat(apellido);
    int letras=apellido.length();
    apellido=apellido.toLowerCase();
    System.out.println("usted se llama  "  +nombre+ "  "  +apellido);
    System.out.println("su nombre tiene " +longitud+ " letras" );
    System.out.println("su apellido tiene " +letras+ " letras" );
    System.out.println(nombrecompleto);
    fin .close();
    apellido=nombre.substring(0,2)+apellido;

    System.out.println("Las Dos Primeras Letras De Tu Nombre Con Tu Apellido Completo Seria "+apellido);
}
}
