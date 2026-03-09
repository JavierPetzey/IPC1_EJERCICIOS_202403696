
package ipc1_tarea6_recursividad;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class IPC1_tarea6_Recursividad {

    public static void main(String[] args) throws IOException {
        System.out.println("Ingresa n");
        int n = Integer.parseInt(System.console().readLine());
        int resultado = sumaNumeros(n);
        
        System.out.println(resultado);
        System.out.println("Se genero el archivo txt");
        imprimirTXT(resultado, n);
    }
    
    public static int sumaNumeros(int n){
        
        if(n > 0){
            
            return sumaNumeros(n-1) + n;
        }
        return n;
    }
    
    public static void imprimirTXT(int suma, int n) throws IOException{
        FileWriter filewriter = null;
        PrintWriter printwriter = null;
        String ruta = "202403696.txt";
        try{
            filewriter = new FileWriter(ruta);
            printwriter = new PrintWriter(filewriter);
            
            printwriter.print("La suma de 1 hasta " + n + " es: " + suma);
        }catch(Exception e){
            System.out.println("Error; " + e.getMessage());
        }finally{
            filewriter.close();
        }
    }
}

