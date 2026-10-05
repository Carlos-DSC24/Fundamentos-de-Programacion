package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_38 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n;

System.out.print("Introduce un número de mes (1 al 12): ");
n = Integer.parseInt(entrada.readLine());

switch (n) {
case 1: System.out.println("Enero"); break;
case 2: System.out.println("Febrero"); break;
case 3: System.out.println("Marzo"); break;
case 4: System.out.println("Abril"); break;
case 5: System.out.println("Mayo"); break;
case 6: System.out.println("Junio"); break;
case 7: System.out.println("Julio"); break;
case 8: System.out.println("Agosto"); break;
case 9: System.out.println("Septiembre"); break;
case 10: System.out.println("Octubre"); break;
case 11: System.out.println("Noviembre"); break;
case 12: System.out.println("Diciembre"); break;
default: System.out.println("Mes no válido."); break;
}
}
}	