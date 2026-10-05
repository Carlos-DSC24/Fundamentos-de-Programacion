package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_26 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double dinero;

System.out.print("Introduce una cantidad de dinero: ");
dinero = Double.parseDouble(entrada.readLine());

int[] billetesMonedas = {500, 200, 100, 50, 20, 10, 5, 2, 1};
int resto = (int) dinero;

System.out.println("Desglose de " + resto + " euros:");
for (int i = 0; i < billetesMonedas.length; i++) {
if (resto >= billetesMonedas[i]) {
int cantidad = resto / billetesMonedas[i];
resto %= billetesMonedas[i];
System.out.println(cantidad + " de " + billetesMonedas[i] + " euros.");
}
}
}
}	