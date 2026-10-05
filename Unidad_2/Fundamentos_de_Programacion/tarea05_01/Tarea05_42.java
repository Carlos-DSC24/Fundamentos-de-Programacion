package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_42 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número entero: ");
n = Integer.parseInt(entrada.readLine());

if (n >= 10 && n <= 20) {
System.out.println("El número está en el rango de 10 a 20.");
} else {
System.out.println("El número está fuera del rango de 10 a 20.");
}
}
}