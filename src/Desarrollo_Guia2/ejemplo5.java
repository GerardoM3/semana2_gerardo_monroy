
package Desarrollo_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejemplo5 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("$#,###.##");
        Scanner leer = new Scanner(System.in);
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la máquina: ");
        valorMaquina = leer.nextDouble();
        System.out.println("Valor del felte: ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro: ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = ejemplo5.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = ejemplo5.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + formato.format(valorDai));
        System.out.println("Valor del IVA: " + formato.format(valorConIva));
    }
    
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
        return dai;
    }
    
    public static double obtenerIva(double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
    }
}
