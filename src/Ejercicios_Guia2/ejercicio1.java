
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        double precio_compu;
        
        System.out.println("¿Cuánto vale la computadora?");
        precio_compu = leer.nextDouble();
        
        calculoIVA(precio_compu);
        double costofinal = descuento(precio_compu);
        System.out.println("Este es el precio final con IVA agregado y con el descuento del %15: $" + formato.format(costofinal));
        
    }
    public static double calculoIVA(double precio_compu){
        double resultado;
        resultado = precio_compu + (precio_compu * 0.13);
        return resultado;
    }
    public static double descuento(double precio_compu){
        double resultado;
        resultado = ejercicio1.calculoIVA(precio_compu) - (ejercicio1.calculoIVA(precio_compu) * 0.15);
        return resultado;
    }
}
