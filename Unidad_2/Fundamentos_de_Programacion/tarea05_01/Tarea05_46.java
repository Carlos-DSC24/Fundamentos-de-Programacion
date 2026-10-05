package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_46 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2, n3;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Integer.parseInt(entrada.readLine());

int menor = n1;
if (n2 < menor) {
menor = n2;
}
if (n3 < menor) {
menor = n3;
}

System.out.println("El número menor de los tres es: " + menor);
}
}