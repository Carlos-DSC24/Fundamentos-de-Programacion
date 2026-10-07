package ExamenPart2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_PaquetesMensajeria {

    public static void main(String[] args) throws IOException {
        
        int totalPaquetes = 0;
        double pesoTotal = 0.0;
        double pesoMayor = 0.0;
        int paquetesMayores10 = 0;
        double pesoActual;

        System.out.println("=== SISTEMA DE CONTROL DE PAQUETES ===");
        
        
        do {
            pesoActual = leerPesoValido("Ingrese el peso del paquete (0 para terminar): ");

            if (pesoActual > 0) {
                totalPaquetes++;
                pesoTotal += pesoActual;

                
                if (totalPaquetes == 1 || pesoActual > pesoMayor) {
                    pesoMayor = pesoActual;
                }

                if (pesoActual > 10.0) {
                    paquetesMayores10++;
                }
            }

        } while (pesoActual != 0);

      
        mostrarResultados(totalPaquetes, pesoTotal, pesoMayor, paquetesMayores10);
    }

    
    public static double leerPesoValido(String mensaje) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double peso;

        do {
            System.out.print(mensaje);
            peso = Double.parseDouble(entrada.readLine());

            if (peso < 0) {
                System.out.println("Error: No se permiten valores negativos. Ingrese un peso válido.");
            }
        } while (peso < 0);

        return peso;
    }

   
    public static void mostrarResultados(int total, double totalPeso, double mayor, int mayores10) {
        double promedio = 0.0;

        if (total > 0) {
            promedio = totalPeso / total;
        }

        System.out.println("\n=== SALIDA ESPERADA / REPORTE FINAL ===");
        System.out.println("Paquetes registrados: " + total);
        System.out.println("Peso total: " + (int)totalPeso + " kg");
        System.out.println("Promedio: " + (int)promedio + " kg");
        System.out.println("Paquete más pesado: " + (int)mayor + " kg");
        System.out.println("Paquetes mayores a 10 kg: " + mayores10);
    }
}