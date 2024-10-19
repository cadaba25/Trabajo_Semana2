/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSemana2;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la base del rectángulo: ");
        int base = entrada.nextInt();
        
        System.out.print("Ingresa la altura del rectángulo: ");
        int altura = entrada.nextInt();
        
        int perimetro = 2 * (base + altura);
        
        int area = base * altura;
        

        System.out.println("""
        El perímetro del rectángulo es: """ + perimetro);
        System.out.println("""
        El área del rectángulo es: """ + area);
        
        
    }
}

