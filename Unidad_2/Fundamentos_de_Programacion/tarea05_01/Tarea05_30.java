package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_30 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double n;

System.out.print("Introduce un número decimal: ");
n = Double.parseDouble(entrada.readLine());

if (n >= 0 && n < 1) {
System.out.println("El número es casi cero.");
} else {
System.out.println("El número no es casi cero.");
}
}
}