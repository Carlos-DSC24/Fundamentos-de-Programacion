package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_33 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double n1, n2, n3;

System.out.print("Introduce el primer número: ");
n1 = Double.parseDouble(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Double.parseDouble(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Double.parseDouble(entrada.readLine());

if (n1 + n2 == n3 || n1 + n3 == n2 || n2 + n3 == n1) {
System.out.println("Sí, un número es la suma de los otros dos.");
} else {
System.out.println("No, ningún número es la suma de los otros dos.");
}
}
}