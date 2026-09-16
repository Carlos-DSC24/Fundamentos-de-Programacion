package Ejemplos;

import javax.swing.JOptionPane;

public class Ejercicio7_CD {
    public static void main(String args[]) {
        int mes;
        String entrada, salida;
        
        entrada = JOptionPane.showInputDialog("Introduce un numero del 1 al 12:");
        mes = Integer.parseInt(entrada);
        
        if (mes == 1) { salida = "Enero"; }
        else if (mes == 2) { salida = "Febrero"; }
        else if (mes == 3) { salida = "Marzo"; }
        else if (mes == 4) { salida = "Abril"; }
        else if (mes == 5) { salida = "Mayo"; }
        else if (mes == 6) { salida = "Junio"; }
        else if (mes == 7) { salida = "Julio"; }
        else if (mes == 8) { salida = "Agosto"; }
        else if (mes == 9) { salida = "Septiembre"; }
        else if (mes == 10) { salida = "Octubre"; }
        else if (mes == 11) { salida = "Noviembre"; }
        else if (mes == 12) { salida = "Diciembre"; }
        else { salida = "Mes no válido"; }
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}