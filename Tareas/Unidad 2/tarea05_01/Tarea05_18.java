package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_18 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número de mes (1 al 12): ");
n = Integer.parseInt(entrada.readLine());

switch (n) {
case 1: case 3: case 5: case 7: case 8: case 10: case 12:
System.out.println("El mes tiene 31 días.");
break;
case 4: case 6: case 9: case 11:
System.out.println("El mes tiene 30 días.");
break;
case 2:
System.out.println("El mes tiene 28 días (o 29 si es bisiesto).");
break;
default:
System.out.println("Número de mes incorrecto.");
break;
}
}
}	