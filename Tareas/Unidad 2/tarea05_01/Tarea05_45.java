package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_45 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int edad;

System.out.print("Introduce la edad: ");
edad = Integer.parseInt(entrada.readLine());

if (edad >= 18) {
System.out.println("Es mayor de edad.");
} else {
System.out.println("Es menor de edad.");
}
}
}