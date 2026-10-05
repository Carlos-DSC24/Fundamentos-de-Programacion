package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_19 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int nota;

System.out.print("Introduce una nota de 0 a 10: ");
nota = Integer.parseInt(entrada.readLine());

switch (nota) {
case 0: case 1: case 2: case 3: case 4:


System.out.println("Insuficiente");
break;
case 5:
System.out.println("Suficiente");
break;
case 6:
System.out.println("Bien");
break;
case 7: case 8:
System.out.println("Notable");
break;
case 9: case 10:
System.out.println("Sobresaliente");
break;
default:
System.out.println("Nota no válida.");
break;
}
}
}