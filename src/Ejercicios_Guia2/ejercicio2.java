
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        double VVehiculo_USA, flete, seguro;
        System.out.println("Ingrese el valor del vehículo en USA:");
        VVehiculo_USA = leer.nextDouble();
        System.out.println("Ingrese el valor del flete:");
        flete = leer.nextDouble();
        System.out.println("Ingrese el valor del seguro:");
        seguro = leer.nextDouble();
        
        double montoDAI = ejercicio2.DAI(VVehiculo_USA, flete, seguro);
        
        System.out.println("------------------------------------------");
        System.out.println("Valor del vehículo en USA: $" + formato.format(VVehiculo_USA));
        System.out.println("Depreciación: 10%.");
        System.out.println("Valor del flete: " + formato.format(flete));
        System.out.println("Valor del seguro: " + formato.format(seguro));
        System.out.println("Monto del DAI: $" + formato.format(montoDAI));
        
    }
    
    public static double depreciacion(double VVehiculo_USA){
        double resultado;
        resultado = VVehiculo_USA * 0.1;
        return resultado;
    }
    
    public static double DAI(double VVehiculo_USA, double flete, double seguro){
        double resultado;
        resultado = (VVehiculo_USA - ejercicio2.depreciacion(VVehiculo_USA - flete - seguro) * 0.25);
        return resultado;
    }
}
