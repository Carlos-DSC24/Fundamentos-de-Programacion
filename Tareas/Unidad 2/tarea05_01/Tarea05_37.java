package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_37 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int num;

System.out.print("Introduce un número entero: ");
num = Integer.parseInt(entrada.readLine());

if (num % 5 == 0) {
System.out.println("El número es terminación o múltiplo de 5.");
} else {
System.out.println("El número no es múltiplo de 5.");
}
}
}