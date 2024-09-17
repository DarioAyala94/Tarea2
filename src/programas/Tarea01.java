
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Tarea01 {
    //Metodo de la clase
    public static void main(String[] args){
        //declarar variables
        int edad1,edad2,mayor,menor;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("ingrear la primera edad:");
        edad1=lectura.nextInt();
        System.out.println("ingrear la segunda edad:");
        edad2=lectura.nextInt();
        //proceso de datos
        mayor=Math.max(edad1, edad2);
        menor=Math.min(edad1, edad2);
        //salida de datos
        System.out.println("La edad de la persona mayor es:"+mayor);
        System.out.println("La edad de la persona menor es:"+menor);
    }
}