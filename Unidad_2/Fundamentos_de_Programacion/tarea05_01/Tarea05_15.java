package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_15 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int dia, mes, anio;

System.out.print("Introduce el día: ");
dia = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el mes: ");
mes = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el año: ");
anio = Integer.parseInt(entrada.readLine());

dia--;

if (dia == 0) {
mes--;
if (mes == 0) {
mes = 12;
anio--;
if (anio == 0) {
anio = -1; // Ajuste histórico si se pasa del año 1 al -1
}
}

switch (mes) {
case 2:
boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
dia = bisiesto ? 29 : 28;
break;
case 4:
case 6:
case 9:
case 11:
dia = 30;
break;
default:
dia = 31;
break;
}
}

System.out.println("La fecha del día anterior es: " + dia + "/" + mes + "/" + anio);
}
}