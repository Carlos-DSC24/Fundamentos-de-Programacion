package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_36 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());

if (n1 % 2 != 0 && n2 % 2 != 0) {
System.out.println("Ambos números son impares.");
} else {
System.out.println("No ambos números son impares.");
}
}
}