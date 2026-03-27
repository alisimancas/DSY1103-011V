/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.diagnostico.alisimancas;

/**
 *
 * @author Cetecom
 */
public class Ejercicio05ContadorRegresivo {

    public static void main(String[] args) {

        // === PARTE A: Validación con do-while ===
        int[] valoresPrueba = {-5, 0, 10};
        int indice = 0;
        int valorIngresado = 0;
        int intentos = 0;

        do {
            valorIngresado = valoresPrueba[indice];
            indice++;

            if (valorIngresado <= 0) {
                intentos++;
                System.out.println("Valor inválido (" + valorIngresado + "). Intento #" + intentos + ". Ingresa un número mayor a 0.");
            } else {
                System.out.println("Valor aceptado: " + valorIngresado);
            }
        } while (valorIngresado <= 0);

        System.out.println(); // Espacio estético

        // === PARTE B: Cuenta regresiva con while ===
        int contador = valorIngresado;
        System.out.println("Iniciando cuenta regresiva desde " + contador + "...");

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("¡Despegue! 🚀");
    }
}