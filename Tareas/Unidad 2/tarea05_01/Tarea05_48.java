package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_48 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double base, altura, area;

System.out.print("Introduce la base del triángulo: ");
base = Double.parseDouble(entrada.readLine());
System.out.print("Introduce la altura del triángulo: ");
altura = Double.parseDouble(entrada.readLine());

if (base > 0 && altura > 0) {
area = (base * altura) / 2;
System.out.println("El área del triángulo es: " + area);
} else {
System.out.println("Los valores introducidos deben ser mayores que cero.");
}
}
}