package a2261330035_Practica7;

import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
    public static void main(String[] args) {
        double l1, l2, l3;

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1:"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2:"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3:"));

        if ((l1 == l2) && (l2 == l3)) {
            JOptionPane.showMessageDialog(null, "Es un triángulo EQUILÁTERO");
        }
        if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
            JOptionPane.showMessageDialog(null, "Es un triángulo ESCALENO");
        }
        if (((l1 == l2) && (l1 != l3)) || ((l1 == l3) && (l1 != l2)) || ((l2 == l3) && (l2 != l1))) {
            JOptionPane.showMessageDialog(null, "Es un triángulo ISÓSCELES");
        }
    }
}