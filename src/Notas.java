import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Double valorNotas,SubtotalNotas=0.0,TotaldeNotas=0.0;
        Scanner fin=new Scanner(System.in);
        for(int i=1; i<=4;i++){
         System.out.println("Digite el valor de sus notas del valor 1 A 5 ");
            valorNotas=fin.nextDouble();
            SubtotalNotas=SubtotalNotas+valorNotas;
        }
    TotaldeNotas=SubtotalNotas/4;
    if(TotaldeNotas<=0.0 || TotaldeNotas<=2.9){
        System.out.println("Reprobaste la Asignatura con una Nota de  "+TotaldeNotas);
    }
    else if (TotaldeNotas<=3.0 || TotaldeNotas<=4.0){
        System.out.println("Pasasate la asignatura con una nota de  "+TotaldeNotas);
    }
    else if (TotaldeNotas<=4.0 || TotaldeNotas<=5.0){
        System.out.println("Paste la Asignatura con una Muy EXELENTE Nota "+TotaldeNotas);

    }
    else
     System.out.println("Digite Nuevamente las Notas! ");
        fin .close();  
    }
   
}

