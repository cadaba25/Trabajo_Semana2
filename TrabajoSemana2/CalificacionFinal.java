/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSemana2;

import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la primera calificación parcial: ");
        double parcial1 = entrada.nextDouble();
        
        System.out.print("Ingresa la segunda calificación parcial: ");
        double parcial2 = entrada.nextDouble();
        
        System.out.print("Ingresa la tercera calificación parcial: ");
        double parcial3 = entrada.nextDouble();
        
        System.out.print("Ingresa la calificación del examen final: ");
        double examenFinal = entrada.nextDouble();
        
        System.out.print("Ingresa la calificación del trabajo final: ");
        double trabajoFinal = entrada.nextDouble();
        
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
        System.out.println("""
        La calificación final en Algoritmos es: """ + calificacionFinal);
        
        
    }
}