
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*Para este ejercicio solo nos pide que ingresemos el nombre del empleado y su salario mensual.
  Pero se nos pide crear una fórmula para calcular el salario por minuto, así nos permite realizar otro
  cálculo para descontar por llegar tarde. Sin embargo, a manera de prueba, la variable que contiene
  el valor de los minutos tarde tendrá en el mes un valor constante para este ejercicio de 75 minutos
  el equivalente a 1 hora y quince minutos.
  Al final, el programa debe mostrar el nombre del mencionado empleado y su salario mensual con 
  el descuento por llegadas tardías y finalmente el descuento del 10% de la renta.
Gerardo Monroy*/


public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        String nombre;
        double salario_m, desc_llegadas_tardias, desc_renta;
        int minutos_tarde = 75;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = leer.nextLine();
        System.out.println("Ingrese el salario mensual del empleado " + nombre);
        salario_m = leer.nextDouble();
        
        desc_llegadas_tardias = ejercicio5.descuento_llegadas_tardias(salario_m, minutos_tarde);
        double n_salario = salario_m - desc_llegadas_tardias;
        desc_renta = ejercicio5.calculoRenta(n_salario);
        
        System.out.println("------------------------------------------");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("De los $" + formato.format(salario_m) + " se le va a descontar $" + formato.format(desc_llegadas_tardias) + " por los " + minutos_tarde + " minutos tarde.");
        System.out.println("Salario del empleado con el descuento por las llegadas tardías en el mes: $" + formato.format(n_salario));
        System.out.println("Salario final con los descuentos de llegadas tardías y de la renta: $" + formato.format(desc_renta));
    }
    
    public static double descuento_llegadas_tardias(double salario_m, int minutos_tarde){
        double resultado;
        resultado = ((((salario_m/30)/8)/60)*minutos_tarde);
        return resultado;
    }
    
    public static double calculoRenta(double n_salario){
        double resultado;
        resultado = n_salario - (n_salario * 0.1);
        return resultado;
    }
}
