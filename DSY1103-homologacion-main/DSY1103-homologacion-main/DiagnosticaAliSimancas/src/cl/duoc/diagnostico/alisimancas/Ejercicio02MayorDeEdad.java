/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.diagnostico.alisimancas;

/**
 *
 * @author Cetecom
 */
public class Ejercicio02MayorDeEdad {
    public static void main(String[] args) {
            String nombre = "Pablo Perez";
            int edad = 28;

            if (edad >= 18) {
                System.out.println("Bienvenido/a, " + nombre + ".");
                System.out.println("Puedes completar el trámite de forma autónoma.");
            } else {
                System.out.println("Hola, " + nombre + ".");
                System.out.println("Debes asistir con tu tutor legal para completar este trámite.");
                System.out.println("Tu edad registrada: " + edad + " años.");
            }
        }
    }

