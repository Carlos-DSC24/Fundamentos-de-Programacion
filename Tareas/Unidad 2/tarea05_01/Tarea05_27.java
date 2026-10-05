package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_27 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double n1, n2;

System.out.print("Introduce el primer número: ");
n1 = Double.parseDouble(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Double.parseDouble(entrada.readLine());

if (n2 == 0) {
System.out.println("Error: No se puede dividir entre cero.");
} else {
double division = n1 / n2;
System.out.println("El resultado de la división es: " + division);
}
}
}