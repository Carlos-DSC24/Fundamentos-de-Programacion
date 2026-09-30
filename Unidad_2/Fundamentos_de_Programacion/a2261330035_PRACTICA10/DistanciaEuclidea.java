package a2261330035_PRACTICA10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DistanciaEuclidea {

	static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirDato(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("--- CÁLCULO DE DISTANCIA EUCLÍDEA ---");
        double x1 = pedirDato("Ingresa x1: ");
        double y1 = pedirDato("Ingresa y1: ");
        double x2 = pedirDato("Ingresa x2: ");
        double y2 = pedirDato("Ingresa y2: ");

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("La distancia euclídea entre los dos puntos es: " + distancia);
    }
}