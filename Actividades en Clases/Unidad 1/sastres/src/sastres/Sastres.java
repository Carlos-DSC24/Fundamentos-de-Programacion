package sastres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sastres {

	public static void main(String[] args) throws IOException {
BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce el numero de sastres:");
        int n = Integer.parseInt(lectura.readLine());
        
        double totalPantalones = (n * 45.0) / 25.0;
        
        System.out.println("El total de pantalones fabricados es: " + totalPantalones);
	}
	}