package Ejemplos_08;

import java.util.Scanner;

public class ejercicio04_b {
    private static String cadena;

	public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			double operando1, operando2, resultado;
			int opcion;
			String menu;
			
			System.out.println("Introduce el valor del operando 1 ");
			operando1 = entrada.nextDouble();
			System.out.println("Introduce el valor del operando 2 ");
			operando2 = entrada.nextDouble();
			
			menu = "Menu de opciones de Operaciones Basicas \n";
			menu = menu + "1.- Suma \n";
			menu = menu + "2.- Multiplicacion \n";
			menu = menu + "3.- Division \n";
			menu = menu + "Elige una Opcion [1..2..3]\n";
			System.out.println(menu);
			
			opcion = entrada.nextInt();
			setCadena("");
			
			switch (opcion) {
			    case 1:
			        resultado = operando1 + operando2;
			        setCadena("El resultado de la suma es " + resultado);
			        break;
			    case 2:
			        resultado = operando1 * operando2;
			        setCadena("El resultado de la multiplicacion es: " + resultado);
			        break;
			    case 3:
			        resultado = operando1 / operando2;
			        setCadena("El resultado de la division es " + resultado);
			        break;
			    default:
			        setCadena("Opcion no reconocida");
			        break;
			}
		}
        char[] cadena = null;
		System.out.println(cadena);
    }

	public static String getCadena() {
		return cadena;
	}

	public static void setCadena(String cadena) {
		ejercicio04_b.cadena = cadena;
	}
}