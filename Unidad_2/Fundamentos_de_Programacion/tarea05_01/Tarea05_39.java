package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_39 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número entero: ");
n = Integer.parseInt(entrada.readLine());

if (n % 2 == 0) {
System.out.println("El número es par.");
} else {
System.out.println("El número es impar.");
}
}
}