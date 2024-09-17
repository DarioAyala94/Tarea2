
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Programa01 {
    //Metodo de la clase
    public static void main(String[] args){
        //declarar variables
        int num1,num2,maximo,minimo;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("ingrear numero 1:");
        num1=lectura.nextInt();
        System.out.println("ingrear numero 2:");
        num2=lectura.nextInt();
        //proceso de datos
        maximo=Math.max(num1, num2);
        minimo=Math.min(num1, num2);
        //salida de datos
        System.out.println("El maximo numero es:"+maximo);
        System.out.println("El minimo numero es:"+minimo);
    }
}
