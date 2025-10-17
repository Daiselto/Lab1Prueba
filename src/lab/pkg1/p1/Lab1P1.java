/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg1.p1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 2){
            System.out.println("MENU DE EJERCICIOS");
            System.out.println("1. Division Modificada");
            System.out.println("2. SALIR");
            System.out.println("Seleccione una opcion");
            opcion = leer.nextInt();
            
            // Opcion 1: Division Modificada
            if(opcion==1){
                System.out.println("Ingrese dividendo: ");
                int dividendo = leer.nextInt();
                
                System.out.println("Ingrese divisor");
                int divisor = leer.nextInt();
                
                int cociente = 0;
                int residuo=dividendo;
                
                while(residuo>=divisor){
                    residuo = residuo - divisor;
                    //Es lo mismo que usar cociente++
                    cociente = cociente + 1;   
                }
                
                if(residuo==0){
                    System.out.println("El resultado de la division es " + cociente);
                }else{
                    System.out.println("El resultado de la division es " + cociente + " con un residuo de " + residuo);
                }
          
            }
            
            if (opcion == 2){
                System.out.println("Saliendo del programa....");
            }
            
        }
        
    }
    
}
