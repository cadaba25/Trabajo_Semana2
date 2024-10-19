/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSemana2;

import java.util.Scanner;

public class PuntajeEquipo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el número de partidos ganados: ");
        int ganados = entrada.nextInt();
        
        System.out.print("Ingresa el número de partidos empatados: ");
        int empatados = entrada.nextInt();
        
        System.out.print("Ingresa el número de partidos perdidos: ");
        int perdidos = entrada.nextInt();
        
        int puntosTotales = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        
        System.out.println("El puntaje total del equipo es: " + puntosTotales);
        
       
    }
}

