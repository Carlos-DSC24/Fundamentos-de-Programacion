package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_05 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int num;

System.out.print("Introduce un número: ");
num = Integer.parseInt(entrada.readLine());

if (num < 0) {
System.out.println("Negativo");
} else {
System.out.println("Positivo"); // Suponemos que el 0 es positivo
}
}
}