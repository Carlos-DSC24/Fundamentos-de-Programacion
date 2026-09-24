package motores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MOTORES {

    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el numero de obreros:");
        int n = Integer.parseInt(lectura.readLine());

        System.out.println("Introduce el numero de dias:");
        int d = Integer.parseInt(lectura.readLine());

        double totalMotores = (n * d * 30.0) / (48.0 * 10.0);

        System.out.println("Total de motores ensamblados: " + totalMotores);
    }
}