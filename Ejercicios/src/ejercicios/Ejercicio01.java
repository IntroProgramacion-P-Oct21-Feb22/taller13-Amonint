/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        double calificacion;
        double promedio;
        double suma = 0;
        int numerocalificaciones = 4;
        try {
            for (int i = 0; i < numerocalificaciones; i++) {
                System.out.println("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                suma = suma + calificacion;
            }

            promedio = suma / numerocalificaciones;

            System.out.printf("%.2f\n", promedio);

        } catch (InputMismatchException ExcepcionErrorEntrada) {
            System.out.println("Existe un error en la entrada de datos");
            System.out.println("de tipo: " + ExcepcionErrorEntrada);

        }

    }
}