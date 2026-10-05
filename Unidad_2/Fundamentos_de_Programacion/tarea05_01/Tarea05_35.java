package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_35 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2, n3, n4;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el cuarto número: ");
n4 = Integer.parseInt(entrada.readLine());

int suma = n1 + n2 + n3 + n4;
double media = suma / 4.0;

System.out.println("La suma de los cuatro números es: " + suma);
System.out.println("La media aritmética es: " + media);
}
}