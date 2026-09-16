package a2261330035_Practica7;

import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {

	public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			int tipoUsuario;

			System.out.println("Introduce la tarifa base del servicio:");
			System.out.println("Introduce el tipo de usuario (1: Profesor, 2: Alumno, 3: General):");
			tipoUsuario = entrada.nextInt();

			if (tipoUsuario == 1) {
			    System.out.println("Aplicando descuento de Profesor (20%) + IVA.");
			} else {
			    if (tipoUsuario == 2) {
			        System.out.println("Aplicando descuento de Alumno (10%) + IVA.");
			    } else {
			        System.out.println("Aplicando tarifa General + IVA.");
			    }
			}
		}
        String total = null;
		System.out.println("El total a pagar es: " + total);
    }
}
