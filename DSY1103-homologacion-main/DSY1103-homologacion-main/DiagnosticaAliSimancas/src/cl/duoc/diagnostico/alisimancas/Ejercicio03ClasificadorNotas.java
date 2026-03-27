/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.diagnostico.alisimancas;

/**
 *
 * @author Cetecom
 */
public class Ejercicio03ClasificadorNotas {
    public static void main(String[] args) {
        String nombreAlumno = "Pedro Sanchez";
        double nota = 5.8;

        String clasificacion = "";
        String mensaje = "";

        if (nota < 1.0 || nota > 7.0) {
            System.out.println("Nota inválida.");
            return; 
        } else if (nota >= 6.0) {
            clasificacion = "Excelente";
            mensaje = "¡Felicitaciones! Rendimiento sobresaliente.";
        } else if (nota >= 5.0) {
            clasificacion = "Bueno";
            mensaje = "Buen trabajo, sigue asi.";
        } else if (nota >= 4.0) {
            clasificacion = "Suficiente";
            mensaje = "Aprobado, pero puedes mejorar.";
        } else {
            clasificacion = "Reprobado";
            mensaje = "No aprobaste. Debes rendir el examen de repetición.";
        }

        System.out.println("Alumno  : " + nombreAlumno);
        System.out.println("Nota    : " + nota);
        System.out.println("Estado  : " + clasificacion);
        System.out.println("Mensaje : " + mensaje);
    }
}

