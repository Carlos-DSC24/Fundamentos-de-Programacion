package a2261330035_Practica7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {

	public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double tarifaBase, total = 0;
        int tipoUsuario;

        System.out.println("Introduce la tarifa base del servicio:");
        tarifaBase = Double.parseDouble(entrada.readLine());

        System.out.println("Introduce el tipo de usuario (1: Profesor, 2: Alumno, 3: General):");
        tipoUsuario = Integer.parseInt(entrada.readLine());

        if (tipoUsuario == 1) {
            total = (tarifaBase - (tarifaBase * 0.20)) * 1.16;
            System.out.println("Aplicando descuento de Profesor (20%) + IVA.");
        } else {
            if (tipoUsuario == 2) {
                total = (tarifaBase - (tarifaBase * 0.10)) * 1.16;
                System.out.println("Aplicando descuento de Alumno (10%) + IVA.");
            } else {
                total = tarifaBase * 1.16;
                System.out.println("Aplicando tarifa General + IVA.");
            }
        }
        System.out.println("El total a pagar es: " + total);
    }
}	