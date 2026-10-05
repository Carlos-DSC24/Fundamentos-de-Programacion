package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_32 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double horas, sueldo;

System.out.print("Introduce las horas trabajadas en la semana: ");
horas = Double.parseDouble(entrada.readLine());

if (horas <= 40) {
sueldo = horas * 16;
} else {
sueldo = (40 * 16) + ((horas - 40) * 20);
}

System.out.println("El sueldo semanal total es: " + sueldo + " euros.");
}
}