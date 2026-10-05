package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_14 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int dia, mes, anio;

System.out.print("Introduce el día: ");
dia = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el mes: ");
mes = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el año: ");
anio = Integer.parseInt(entrada.readLine());

dia++;

boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

int diasMes = 31;
switch (mes) {
case 2:
diasMes = bisiesto ? 29 : 28;
break;
case 4:
case 6:
case 9:
case 11:
diasMes = 30;
break;
}

if (dia > diasMes) {
dia = 1;
mes++;
if (mes > 12) {
mes = 1;
anio++;
if (anio == 0) { // No existe el año 0 en el calendario gregoriano
anio = 1;
}
}
}

System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
}
}