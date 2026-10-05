package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_02 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double a, r; // área y radio

System.out.print("Introduce el radio de un circulo: ");
r = Double.parseDouble(entrada.readLine());

a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow(r, 2)

System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
}
}