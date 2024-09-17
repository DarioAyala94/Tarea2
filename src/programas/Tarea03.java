
package programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los valores de los catetos
        System.out.print("Ingresa el valor del cateto a: ");
        double a = sc.nextDouble();
        
        System.out.print("Ingresa el valor del cateto b: ");
        double b = sc.nextDouble();
        
        // Calcular el valor de la hipotenusa usando Math.sqrt() y Math.pow()
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        // Mostrar el resultado
        System.out.println("La longitud de la hipotenusa es: " + c);
        
        // Cerrar el scanner
        sc.close();
    }
}
