package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_25 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
char letra;

System.out.print("Introduce una letra: ");
letra = (char) entrada.read();

if (Character.isUpperCase(letra)) {
System.out.println("La letra es mayúscula.");
} else {
System.out.println("La letra no es mayúscula.");
}
}
}