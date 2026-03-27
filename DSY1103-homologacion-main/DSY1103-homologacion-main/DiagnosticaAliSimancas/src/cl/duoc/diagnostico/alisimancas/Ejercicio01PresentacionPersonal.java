/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.diagnostico.alisimancas;

/**
 *
 * @author Cetecom
 */
public class Ejercicio01PresentacionPersonal {
    public static void main(String[] args) {
        String nombre = "Ali Simancas";
        int edad = 19;
        String carrera = "Ingenieria Informatica";
        int semestre = 3;
        boolean tieneExperienciaLaboral = true;

        String experienciaTexto = tieneExperienciaLaboral ? "si" : "no";

        System.out.println("/// Tarjeta de Presentación ///");
        System.out.println("Nombre   : " + nombre);
        System.out.println("Edad     : " + edad + " años");
        System.out.println("Carrera  : " + carrera);
        System.out.println("Semestre : " + semestre);
        System.out.println("Experiencia laboral: " + experienciaTexto);
    }
}
