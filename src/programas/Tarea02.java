
package programas;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tarea02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer el valor ingresado por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el valor del radio
        System.out.print("Ingresa el valor del radio del circulo: ");
        double radio = sc.nextDouble();
        DecimalFormat formato=new DecimalFormat("##.##");
        
        // Calcular el área usando Math.PI y Math.pow()
        double area = Math.PI * Math.pow(radio, 2);
        
        // Mostrar el resultado
        System.out.println("El area del circulo es: " +formato.format(area));
        
        // Cerrar el scanner
        sc.close();
    }
}
