package a2261330035_Practica7;

import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String[] args) {
        double tarifaBase, total = 0;
        int tipoUsuario;

        tarifaBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base del servicio:"));
        tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de usuario (1: Profesor, 2: Alumno, 3: General):"));

        if (tipoUsuario == 1) {
            total = (tarifaBase - (tarifaBase * 0.20)) * 1.16;
            JOptionPane.showMessageDialog(null, "Aplicando descuento de Profesor (20%) + IVA.");
        } else {
            if (tipoUsuario == 2) {
                total = (tarifaBase - (tarifaBase * 0.10)) * 1.16;
                JOptionPane.showMessageDialog(null, "Aplicando descuento de Alumno (10%) + IVA.");
            } else {
                total = tarifaBase * 1.16;
                JOptionPane.showMessageDialog(null, "Aplicando tarifa General + IVA.");
            }
        }
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + total);
    }
}