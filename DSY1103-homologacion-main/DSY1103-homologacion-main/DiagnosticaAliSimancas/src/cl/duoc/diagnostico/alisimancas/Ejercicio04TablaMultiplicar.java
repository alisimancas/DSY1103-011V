/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.diagnostico.alisimancas;

/**
 *
 * @author Cetecom
 */
public class Ejercicio04TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 9;
        int suma = 0;

        System.out.println("Tabla del " + numero );

        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            
            // Use printf para alinear el %2d (2 espacios para i) y %3d (3 espacios para el resultado)
            System.out.printf("%d  x %2d  = %3d%n", numero, i, resultado);
            
            suma += resultado;
        }

        System.out.println("\nSuma total de la tabla: " + suma);
    }
}

