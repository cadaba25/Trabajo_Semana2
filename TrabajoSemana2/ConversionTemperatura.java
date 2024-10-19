/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSemana2;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("""
        La temperatura en grados Celsius es: """ + celsius);
        
        entrada.close();
    }
}