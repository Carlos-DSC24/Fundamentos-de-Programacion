package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_20 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int num;

System.out.print("Introduce un número menor que 1000: ");
num = Integer.parseInt(entrada.readLine());

if (num >= 1000) {
System.out.println("El número debe ser menor que 1000.");
} else {
if (num < 10) {
} else if (num < 100) {
} else {
}

// Invertir número según cifras
int inv = 0;
int aux = num;
while (aux > 0) {
inv = (inv * 10) + (aux % 10);
aux /= 10;
}
if (num == 0) inv = 0;

if (num == inv) {
System.out.println("El número es capicúa.");
} else {
System.out.println("El número no es capicúa.");
}
}
}
}