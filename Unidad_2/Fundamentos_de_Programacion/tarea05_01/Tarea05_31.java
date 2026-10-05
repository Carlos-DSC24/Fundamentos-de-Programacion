package tarea05_01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_31 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número del 1 al 7: ");
n = Integer.parseInt(entrada.readLine());

switch (n) {
case 1: System.out.println("Lunes"); break;
case 2: System.out.println("Martes"); break;
case 3: System.out.println("Miércoles"); break;
case 4: System.out.println("Jueves"); break;
case 5: System.out.println("Viernes"); break;
case 6: System.out.println("Sábado"); break;
case 7: System.out.println("Domingo"); break;
default: System.out.println("Día de la semana no válido."); break;
}
}
}