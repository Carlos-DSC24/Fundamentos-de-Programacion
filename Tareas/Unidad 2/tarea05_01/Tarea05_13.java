package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_13 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int dia, mes, anio;

System.out.print("Introduce el día: ");
dia = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el mes: ");
mes = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el año: ");
anio = Integer.parseInt(entrada.readLine());

boolean correcta = true;

if (anio == 0) {
correcta = false;
} else if (mes < 1 || mes > 12) {
correcta = false;
} else {
switch (mes) {
case 2:
if (dia < 1 || dia > 28) {
correcta = false;
}
break;
case 4:
case 6:
case 9:
case 11:
if (dia < 1 || dia > 30) {
correcta = false;
}
break;
default:
if (dia < 1 || dia > 31) {
correcta = false;
}
break;
}
}

if (correcta) {
System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
} else {
System.out.println("La fecha es incorrecta.");
}
}
}