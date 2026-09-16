package Ejercicios_08;

import javax.swing.JOptionPane;

public class ejercicio05_c {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;
        
        String menu = "Menu de Opciones \n" +
                      "1.- Productos \n" +
                      "2.- Punto de venta \n" +
                      "Que opcion deseas?";
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch(opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Producto 1: " + producto1 + " | Precio: $" + precio1 + "\n" +
                                                    "Producto 2: " + producto2 + " | Precio: $" + precio2);
                break;
            case 2:
                int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad comprada de producto 1 (" + producto1 + "):"));
                int cant2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad comprada de producto 2 (" + producto2 + "):"));
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = subtotal1 + iva1;
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = subtotal2 + iva2;
                
                double subtotalGeneral = subtotal1 + subtotal2;
                double ivaGeneral = iva1 + iva2;
                double totalGeneral = total1 + total2;
                
                String reporte = "--- REPORTE DE VENTA ---\n" +
                                 "Producto 1 -> Subtotal: " + subtotal1 + ", IVA: " + iva1 + ", Total: " + total1 + "\n" +
                                 "Producto 2 -> Subtotal: " + subtotal2 + ", IVA: " + iva2 + ", Total: " + total2 + "\n" +
                                 "El subtotal fue: " + subtotalGeneral + "\n" +
                                 "El total de IVA fue: " + ivaGeneral + "\n" +
                                 "El total de la venta fue: " + totalGeneral;
                
                JOptionPane.showMessageDialog(null, reporte);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Eleccion incorrecta");
                break;
        }
    }
}