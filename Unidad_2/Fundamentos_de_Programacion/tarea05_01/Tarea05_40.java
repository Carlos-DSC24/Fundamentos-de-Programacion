package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_40 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double peso;

System.out.print("Introduce el peso en kg: ");
peso = Double.parseDouble(entrada.readLine());

if (peso > 0) {
System.out.println("El peso introducido es válido: " + peso + " kg.");
} else {
System.out.println("El peso introducido no es válido.");
}
}
}