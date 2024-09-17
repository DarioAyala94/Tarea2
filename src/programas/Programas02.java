
package programas;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Programas02 {
    public static void main(String []args){
        //declarar variables
        double radio,acirculo;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        //entrada de datos
        System.out.print("ingresar radio del circulo:");
        radio=lectura.nextDouble();
        //proceso de datos
        acirculo=Math.PI*Math.pow(radio,2);
        //salida de datos
        System.out.println("el area del circulo es:"+formato.format(acirculo));
    }
}
