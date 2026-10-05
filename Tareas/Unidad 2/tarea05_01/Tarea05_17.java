package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_17 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int segundosTrabajo;
long totalSegundos, horas, minutos, segundos;

System.out.print("Introduce el número de segundos a añadir: ");
segundosTrabajo = Integer.parseInt(entrada.readLine());

// Suponemos una hora de partida o calculamos a partir de la hora actual del sistema o una base dada:
// Tomamos la hora actual introducida o simulada. Comúnmente este ejercicio pide pedir hora, min, seg y segundos a sumar.
// Vamos a pedir la hora actual primero para mantener la estructura estándar del ejercicio.
System.out.print("Introduce la hora actual: ");
int hora = Integer.parseInt(entrada.readLine());
System.out.print("Introduce los minutos actuales: ");
int minuto = Integer.parseInt(entrada.readLine());
System.out.print("Introduce los segundos actuales: ");
int segundo = Integer.parseInt(entrada.readLine());

System.out.print("Introduce los segundos que quieres incrementar: ");
int incrementar = Integer.parseInt(entrada.readLine());

segundo += incrementar;

minuto += segundo / 60;
segundo %= 60;

hora += minuto / 60;
minuto %= 60;

hora %= 24;

System.out.println("Nueva hora: " + hora + ":" + minuto + ":" + segundo);
}
}