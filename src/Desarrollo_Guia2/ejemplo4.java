
package Desarrollo_Guia2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejemplo4 {
    public static void main(String[] args) {
        double cantidad1 = 0, cantidad2 = 0;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese cantidad 1:");
            cantidad1= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese cantidad 2:");
            cantidad2 = Double.parseDouble(leer.readLine());
            
            System.out.println("El resultado de la suma es: " + ejemplo4.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es: " + ejemplo4.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicación es: " + ejemplo4.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la división es: " + ejemplo4.dividir(cantidad1, cantidad2));
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1 + " " + cantidad2);
    }
    
    public static double sumar(double cantidad1, double cantidad2){
        double suma = cantidad1 + cantidad2;
        return suma;
    }
    public static double restar(double cantidad1, double cantidad2){
        double resta = cantidad1 - cantidad2;
        return resta;
    }
    public static double multiplicar(double cantidad1, double cantidad2){
        double multiplicacion = cantidad1 * cantidad2;
        return multiplicacion;
    }
    public static double dividir(double cantidad1, double cantidad2){
        double division = cantidad1 / cantidad2;
        return division;
    }
}
