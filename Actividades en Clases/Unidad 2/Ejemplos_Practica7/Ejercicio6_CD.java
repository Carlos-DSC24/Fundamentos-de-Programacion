package Ejemplos;

import javax.swing.JOptionPane;

public class Ejercicio6_CD {
    public static void main(String args[]) {
        int dia;
        String entrada, salida;
        
        entrada = JOptionPane.showInputDialog("Introduce un numero del 1 al 7:");
        dia = Integer.parseInt(entrada);
        
        if (dia == 1) {
            salida = "Lunes";
        } else if (dia == 2) {
            salida = "Martes";
        } else if (dia == 3) {
            salida = "Miércoles";
        } else if (dia == 4) {
            salida = "Jueves";
        } else if (dia == 5) {
            salida = "Viernes";
        } else if (dia == 6) {
            salida = "Sábado";
        } else if (dia == 7) {
            salida = "Domingo";
        } else {
            salida = "Día no válido";
        }
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}