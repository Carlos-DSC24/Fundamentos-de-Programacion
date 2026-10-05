package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_50 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int anio;

System.out.print("Introduce un año: ");
anio = Integer.parseInt(entrada.readLine());

boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

if (bisiesto) {
System.out.println("El año " + anio + " es bisiesto.");
} else {
System.out.println("El año " + anio + " no es bisiesto.");
}
}
}