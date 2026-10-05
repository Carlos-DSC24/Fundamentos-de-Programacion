package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_11 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int num;

System.out.print("Introduce un número entre 0 y 99999: ");
num = Integer.parseInt(entrada.readLine());

if (num < 0 || num > 99999) {
System.out.println("El número está fuera del rango permitido.");
} else {
if (num < 10) {
System.out.println("Tiene 1 cifra.");
} else if (num < 100) {
System.out.println("Tiene 2 cifras.");
} else if (num < 1000) {
System.out.println("Tiene 3 cifras.");
} else if (num < 10000) {
System.out.println("Tiene 4 cifras.");
} else {
System.out.println("Tiene 5 cifras.");
}
}
}
}