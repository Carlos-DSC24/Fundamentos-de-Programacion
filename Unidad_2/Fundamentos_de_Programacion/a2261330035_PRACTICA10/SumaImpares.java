package a2261330035_PRACTICA10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumaImpares {

	static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static int sumarPrimerosImpares(int n) {
        int suma = 0;
        int imparActual = 1;
        for (int i = 0; i < n; i++) {
            suma += imparActual;
            imparActual += 2;
        }
        return suma;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Ingresa la cantidad de números impares a sumar (n): ");
        int n = Integer.parseInt(lectura.readLine());

        if (n > 0) {
            int resultado = sumarPrimerosImpares(n);
            System.out.println("La suma de los primeros " + n + " impares es: " + resultado);
        } else {
            System.out.println("El valor debe ser un entero positivo mayor a 0.");
        }
    }
}