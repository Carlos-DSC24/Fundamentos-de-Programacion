package a2261330035_practica09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculopromedios {

	public static void main(String[] args) throws IOException {
        int ciclop, cicloh, nalum, nparcial, cal, scal;
        double palum, sprom, pgeneral;
        String salida = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("cuantos alumnos vas a evaluar");
        nalum = Integer.parseInt(entrada.readLine());
        System.out.println("cuantos parciales vas a evaluar");
        nparcial = Integer.parseInt(entrada.readLine());
        
        ciclop = 0;
        sprom = 0;
        for (ciclop = 1; ciclop <= nalum; ciclop++) {
            scal = 0;
            for (cicloh = 1; cicloh <= nparcial; cicloh++) {
                System.out.println("calificacion del alumno " + ciclop + " parcial " + cicloh);
                cal = Integer.parseInt(entrada.readLine());
                scal = scal + cal;
            }
            palum = (double) scal / nparcial;
            salida = salida + "El promedio del alumno " + ciclop + " fue " + palum + "\n";
            sprom = sprom + palum;
        }
        pgeneral = sprom / nalum;
        salida = salida + "El promedio general fue " + pgeneral;
        System.out.println(salida);
    }
}