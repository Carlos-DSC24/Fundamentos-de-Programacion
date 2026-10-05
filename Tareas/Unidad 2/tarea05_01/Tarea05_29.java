package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_29 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int mes;

System.out.print("Introduce un número de mes (1-12): ");
mes = Integer.parseInt(entrada.readLine());

if (mes == 12 || mes == 1 || mes == 2) {
System.out.println("Es invierno.");
} else if (mes >= 3 && mes <= 5) {
System.out.println("Es primavera.");
} else if (mes >= 6 && mes <= 8) {
System.out.println("Es verano.");
} else if (mes >= 9 && mes <= 11) {
System.out.println("Es otoño.");
} else {
System.out.println("Mes no válido.");
}
}
}