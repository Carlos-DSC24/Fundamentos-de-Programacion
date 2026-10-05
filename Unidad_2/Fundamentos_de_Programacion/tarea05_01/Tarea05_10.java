package tarea05_01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_10 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int n1, n2, n3;

System.out.print("Introduce el primer número: ");
n1 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el segundo número: ");
n2 = Integer.parseInt(entrada.readLine());
System.out.print("Introduce el tercer número: ");
n3 = Integer.parseInt(entrada.readLine());

if (n1 > n2 && n1 > n3) {
if (n2 > n3) {
System.out.println(n1 + ", " + n2 + ", " + n3);
} else {
System.out.println(n1 + ", " + n3 + ", " + n2);
}
} else if (n2 > n1 && n2 > n3) {
if (n1 > n3) {
System.out.println(n2 + ", " + n1 + ", " + n3);
} else {
System.out.println(n2 + ", " + n3 + ", " + n1);
}
} else {
if (n1 > n2) {
System.out.println(n3 + ", " + n1 + ", " + n2);
} else {
System.out.println(n3 + ", " + n2 + ", " + n1);
}
}
}
}