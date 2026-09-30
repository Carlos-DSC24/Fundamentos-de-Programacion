package a2261330035_PRACTICA10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RazonesTrigonometricas {

	static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static void mostrarTrigonometria(double anguloGrados) {
        double radianes = Math.toRadians(anguloGrados);
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);

        System.out.println("\n--- RESULTADOS PARA " + anguloGrados + "° ---");
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);

        if (Math.abs(coseno) < 1e-10) {
            System.out.println("Tangente: Indefinida (coseno = 0)");
        } else {
            System.out.println("Tangente: " + Math.tan(radianes));
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Ingresa el valor del ángulo en grados: ");
        double angulo = Double.parseDouble(lectura.readLine());

        mostrarTrigonometria(angulo);
    }
}