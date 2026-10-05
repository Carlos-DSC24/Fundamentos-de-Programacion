package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_16 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int hora, minuto, segundo;

System.out.print("Introduce la hora: ");
hora = Integer.parseInt(entrada.readLine());
System.out.print("Introduce los minutos: ");
minuto = Integer.parseInt(entrada.readLine());
System.out.print("Introduce los segundos: ");
segundo = Integer.parseInt(entrada.readLine());

segundo++;

if (segundo == 60) {
segundo = 0;
minuto++;
if (minuto == 60) {
minuto = 0;
hora++;
if (hora == 24) {
hora = 0;
}
}
}

System.out.println("Hora un segundo después: " + hora + ":" + minuto + ":" + segundo);
}
}