package a2261330035_Practica7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_2_mc_buffer {

	public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double l1, l2, l3;

        System.out.println("Introduce el lado 1:");
        l1 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 2:");
        l2 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 3:");
        l3 = Double.parseDouble(entrada.readLine());

        if ((l1 == l2) && (l2 == l3)) {
            System.out.println("Es un triángulo EQUILÁTERO");
        }
        if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
            System.out.println("Es un triángulo ESCALENO");
        }
        if (((l1 == l2) && (l1 != l3)) || ((l1 == l3) && (l1 != l2)) || ((l2 == l3) && (l2 != l1))) {
            System.out.println("Es un triángulo ISÓSCELES");
        }
    }
}