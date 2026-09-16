package a2261330035_Practica7;

import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {

	public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			double l1, l2, l3;

			System.out.println("Introduce el lado 1:");
			l1 = entrada.nextDouble();
			System.out.println("Introduce el lado 2:");
			l2 = entrada.nextDouble();
			System.out.println("Introduce el lado 3:");
			l3 = entrada.nextDouble();

			if (l1 == l2) {
			    if (l2 == l3) {
			        System.out.println("Es un triángulo EQUILÁTERO");
			    } else {
			        System.out.println("Es un triángulo ISÓSCELES");
			    }
			} else {
			    if ((l1 == l3) || (l2 == l3)) {
			        System.out.println("Es un triángulo ISÓSCELES");
			    } else {
			        System.out.println("Es un triángulo ESCALENO");
			    }
			}
		}
    }
}