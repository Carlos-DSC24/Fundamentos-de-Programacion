package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_34 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2, n3;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Integer.parseInt(entrada.readLine());

if (n1 < n2 && n2 < n3) {
System.out.println("Están ordenados en orden creciente.");
} else {
System.out.println("No están ordenados en orden creciente.");
}
}
}