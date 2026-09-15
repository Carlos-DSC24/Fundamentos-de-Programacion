package Ejemplos_08;

import java.util.Scanner;

public class ejercicio3_b {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			String cadena = "Menu de Opciones \n";
			
			cadena = cadena + "1.- Opcion 1 \n";
			cadena = cadena + "2.- Opcion 2 \n";
			cadena = cadena + "3.- Opcion 3 \n";
			cadena = cadena + "4.- Opcion 4 \n";
			cadena = cadena + "Elija una opcion [1..4] --> ";
			
			System.out.print(cadena);
			String opc = entrada.nextLine();
			cadena = "";
			
			switch(opc){
			    case "1": cadena = "Elegiste la opcion 1"; break;
			    case "2": cadena = "Elegiste la opcion 2"; break;
			    case "3": cadena = "Elegiste la opcion 3"; break;
			    case "4": cadena = "Elegiste la opcion 4"; break;
			    default: cadena = "Elegiste una opcion que no existe"; break;
			}
			
			System.out.println("\n" + cadena);
		}
    }
}