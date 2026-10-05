package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_24 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número: ");
n = Integer.parseInt(entrada.readLine());

if (n % 2 == 0 && n % 3 == 0) {
System.out.println("El número es divisible por 2 y por 3 a la vez.");
} else {
System.out.println("El número no es divisible por ambos a la vez.");
}
}
}