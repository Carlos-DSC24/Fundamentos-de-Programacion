package Ejercicios_08;

import java.util.Scanner;

public class ejercicio05_b {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			String producto1 = "coca cola light lata 400 ml";
			String producto2 = "coca cola lata 400 ml";
			double precio1 = 16.0;
			double precio2 = 15.0;
			
			String menu = "Menu de Opciones \n" +
			              "1.- Productos \n" +
			              "2.- Punto de venta \n" +
			              "Que opcion deseas?";
			
			System.out.println(menu);
			int opc = entrada.nextInt();
			
			switch(opc) {
			    case 1:
			        System.out.println("Producto 1: " + producto1 + " | Precio: $" + precio1);
			        System.out.println("Producto 2: " + producto2 + " | Precio: $" + precio2);
			        break;
			    case 2:
			        System.out.println("Introduce la cantidad comprada de producto 1 (" + producto1 + "):");
			        int cant1 = entrada.nextInt();
			        
			        System.out.println("Introduce la cantidad comprada de producto 2 (" + producto2 + "):");
			        int cant2 = entrada.nextInt();
			        
			        double subtotal1 = cant1 * precio1;
			        double iva1 = subtotal1 * 0.16;
			        double total1 = subtotal1 + iva1;
			        
			        double subtotal2 = cant2 * precio2;
			        double iva2 = subtotal2 * 0.16;
			        double total2 = subtotal2 + iva2;
			        
			        double subtotalGeneral = subtotal1 + subtotal2;
			        double ivaGeneral = iva1 + iva2;
			        double totalGeneral = total1 + total2;
			        
			        System.out.println("\n--- REPORTE DE VENTA ---");
			        System.out.println("Producto 1 -> Subtotal: " + subtotal1 + ", IVA: " + iva1 + ", Total: " + total1);
			        System.out.println("Producto 2 -> Subtotal: " + subtotal2 + ", IVA: " + iva2 + ", Total: " + total2);
			        System.out.println("El subtotal fue: " + subtotalGeneral);
			        System.out.println("El total de IVA fue: " + ivaGeneral);
			        System.out.println("El total de la venta fue: " + totalGeneral);
			        break;
			    default:
			        System.out.println("Eleccion incorrecta");
			        break;
			}
		}
    }
}