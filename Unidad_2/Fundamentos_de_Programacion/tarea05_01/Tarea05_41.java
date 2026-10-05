package tarea05_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_41 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2, n3;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Integer.parseInt(entrada.readLine());

if (n1 == n2 && n2 == n3) {
System.out.println("Los tres números son iguales.");
} else {
System.out.println("Los números no son todos iguales.");
}
}
}