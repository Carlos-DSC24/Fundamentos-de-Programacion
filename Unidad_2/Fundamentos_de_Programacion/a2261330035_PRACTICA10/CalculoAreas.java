package a2261330035_PRACTICA10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreas {

	static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static void mostrarmenu() {
        System.out.println("\nMenú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("r.- Calcular área del rectángulo");
        System.out.println("p.- Calcular área del trapecio");
        System.out.println("s.- Salir");
        System.out.print("Elige una opción: ");
    }

    public static double pedirdato(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double calcularareacirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularareatriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calculararearectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularareatrapecio(double bMayor, double bMenor, double altura) {
        return ((bMayor + bMenor) * altura) / 2;
    }

    public static void circulo() throws IOException {
        double radio = pedirdato("Ingresa el radio del círculo: ");
        System.out.println("El área del círculo es: " + calcularareacirculo(radio));
    }

    public static void triangulo() throws IOException {
        double base = pedirdato("Ingresa la base del triángulo: ");
        double altura = pedirdato("Ingresa la altura del triángulo: ");
        System.out.println("El área del triángulo es: " + calcularareatriangulo(base, altura));
    }

    public static void rectangulo() throws IOException {
        double base = pedirdato("Ingresa la base del rectángulo: ");
        double altura = pedirdato("Ingresa la altura del rectángulo: ");
        System.out.println("El área del rectángulo es: " + calculararearectangulo(base, altura));
    }

    public static void trapecio() throws IOException {
        double bMayor = pedirdato("Ingresa la base mayor del trapecio: ");
        double bMenor = pedirdato("Ingresa la base menor del trapecio: ");
        double altura = pedirdato("Ingresa la altura del trapecio: ");
        System.out.println("El área del trapecio es: " + calcularareatrapecio(bMayor, bMenor, altura));
    }

    public static void main(String[] args) throws IOException {
        String opcion = "";

        mostrarmenu();
        opcion = lectura.readLine().trim().toUpperCase();

        while (!opcion.equals("S")) {
            switch (opcion) {
                case "C":
                    circulo();
                    break;
                case "T":
                    triangulo();
                    break;
                case "R":
                    rectangulo();
                    break;
                case "P":
                    trapecio();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            mostrarmenu();
            opcion = lectura.readLine().trim().toUpperCase();
        }

        System.out.println("Saliendo del programa.");
    }
}