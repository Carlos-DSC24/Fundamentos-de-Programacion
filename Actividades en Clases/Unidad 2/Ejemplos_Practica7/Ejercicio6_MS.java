package Ejemplos;

import java.util.Scanner;

public class Ejercicio6_MS {
    public static void main(String args[]) {
        int dia;
        String salida;
        try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce un numero del 1 al 7:");
			dia = entrada.nextInt();
		}
        
        if (dia == 1) {
            salida = "Lunes";
        } else if (dia == 2) {
            salida = "Martes";
        } else if (dia == 3) {
            salida = "Miércoles";
        } else if (dia == 4) {
            salida = "Jueves";
        } else if (dia == 5) {
            salida = "Viernes";
        } else if (dia == 6) {
            salida = "Sábado";
        } else if (dia == 7) {
            salida = "Domingo";
        } else {
            salida = "Día no válido";
        }
        
        System.out.println(salida);
        System.exit(0);
    }
}
