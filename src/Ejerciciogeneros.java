import java.util.Scanner;
public class Ejerciciogeneros {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int H=0,M=0;
        String Generoopcion;
        String hombres= "h", mujeres= "m";
        for(int i=1;i<=10;i++){
            System.out.println("eres mujer o hombre, digite H  si es hombre, o digite M si es mujer \n");
            Generoopcion=leer.nextLine();
        if(Generoopcion.equals(hombres)){H=H+1;
            System.out.println("Van "+H+"hombres");
        }
        else if (Generoopcion.equals(mujeres)){
            M=M+1;
            System.out.println("Van "+M+"mujeres");
        }
     
    }
    System.out.println("el total de hombres es"+H+"y el de mujeres es "+M);
    leer .close();
}
}
