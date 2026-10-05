package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_12 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n, decena, unidad;

System.out.print("Introduce un número entre 0 y 99: ");
n = Integer.parseInt(entrada.readLine());

if (n < 0 || n > 99) {
System.out.println("El número está fuera de rango.");
} else {
decena = n / 10;
unidad = n % 10;

if (n < 10) {
switch (n) {
case 0: System.out.println("cero"); break;
case 1: System.out.println("uno"); break;
case 2: System.out.println("dos"); break;
case 3: System.out.println("tres"); break;
case 4: System.out.println("cuatro"); break;
case 5: System.out.println("cinco"); break;
case 6: System.out.println("seis"); break;
case 7: System.out.println("siete"); break;
case 8: System.out.println("ocho"); break;
case 9: System.out.println("nueve"); break;
}
} else if (n >= 10 && n <= 15) {
switch (n) {
case 10: System.out.println("diez"); break;
case 11: System.out.println("once"); break;
case 12: System.out.println("doce"); break;
case 13: System.out.println("trece"); break;
case 14: System.out.println("catorce"); break;
case 15: System.out.println("quince"); break;
}
} else if (n < 20) {
System.out.print("dieci");
switch (unidad) {
case 6: System.out.println("séis"); break;
case 7: System.out.println("siete"); break;
case 8: System.out.println("ocho"); break;
case 9: System.out.println("nueve"); break;
}
} else if (n == 20) {
System.out.println("veinte");
} else if (n < 30) {
System.out.print("veinti");
switch (unidad) {
case 0: System.out.println("cero"); break;
case 1: System.out.println("uno"); break;
case 2: System.out.println("dos"); break;
case 3: System.out.println("tres"); break;
case 4: System.out.println("cuatro"); break;
case 5: System.out.println("cinco"); break;
case 6: System.out.println("seis"); break;
case 7: System.out.println("siete"); break;
case 8: System.out.println("ocho"); break;
case 9: System.out.println("nueve"); break;
}
} else {
switch (decena) {
case 3: System.out.print("treinta"); break;
case 4: System.out.print("cuarenta"); break;
case 5: System.out.print("cincuenta"); break;
case 6: System.out.print("sesenta"); break;
case 7: System.out.print("setenta"); break;
case 8: System.out.print("ochenta"); break;
case 9: System.out.print("noventa"); break;
}
if (unidad != 0) {
System.out.print(" y ");
switch (unidad) {
case 1: System.out.println("uno"); break;
case 2: System.out.println("dos"); break;
case 3: System.out.println("tres"); break;
case 4: System.out.println("cuatro"); break;
case 5: System.out.println("cinco"); break;
case 6: System.out.println("seis"); break;
case 7: System.out.println("siete"); break;
case 8: System.out.println("ocho"); break;
case 9: System.out.println("nueve"); break;
}
} else {
System.out.println();
}
}
}
}
}