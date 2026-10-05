package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_03 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double l, r; // longitud y radio

System.out.print("Introduce el radio de una circunferencia: ");
r = Double.parseDouble(entrada.readLine());

l = 2 * Math.PI * r;

System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
}
}