package a2261330035_Practica6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2261330035_Ejercicio05_BufferedReader {

	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double sumacant = 0;
        String salida;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        int cant; // Se asume cantidad como entera por el contexto de conteo de piezas
        
        // --- 1. Refresco coca cola light lata ---
        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = Double.parseDouble(reader.readLine());
        
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = Integer.parseInt(reader.readLine());
        
        subtotal = precio * cant;
        iva = 0.16 * precio; // Nota: respeta exactamente la lógica del diagrama original (0.16 * precio)
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        // --- 2. 1/4 de Arroz ---
        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = Double.parseDouble(reader.readLine());
        
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = Integer.parseInt(reader.readLine());
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        // --- 3. Pan francés ---
        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = Double.parseDouble(reader.readLine());
        
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = Integer.parseInt(reader.readLine());
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        // --- Resultados finales ---
        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println("el total del iva fue " + sumaiva);
        System.out.println("el total -----------> " + sumatotal);
    }
}