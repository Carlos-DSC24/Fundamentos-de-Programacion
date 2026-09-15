package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6_MC {
    public static void main(String args[]) throws IOException {
        int dia;
        String salida;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce un numero del 1 al 7:");
        dia = Integer.parseInt(entrada.readLine());
        
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