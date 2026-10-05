package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_47 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
char caracter;

System.out.print("Introduce un carácter: ");
caracter = (char) entrada.read();

if (Character.isDigit(caracter)) {
System.out.println("El carácter es un dígito numérico.");
} else {
System.out.println("El carácter no es un dígito numérico.");
}
}
}