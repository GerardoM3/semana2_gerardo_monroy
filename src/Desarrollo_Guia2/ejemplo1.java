
package Desarrollo_Guia2;


public class ejemplo1 {
    public static void main(String[] args) {
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    
    public static void metodoConVoid(){
        System.out.println("Contenido del método con void");
    }
    
    public static int metodoConInt(){
        System.out.println("Contenido del método con int");
        return 0;
    }
    
    public static double metodoConDouble(){
        System.out.println("Contenido del método con double");
        return 0.0;
    }
    
    public static String metodoConString(){
        System.out.println("Contenido del método con String");
        return "";
    }
}
