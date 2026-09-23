package a2261330035_practica4;

public class Ejercicio09 {

	public static void main(String[] args) {
        System.out.print("\"Coca cola de lata -> 15.45\"\n");
        System.out.println("Cantidad vendida\tSubTotal\tIva\tTotal");
        System.out.printf("%d\t\t\t%.4f\t\t%.2f\t%.2f\n",
                12,
                (15.45 * 12),
                ((15.45 * 12) * 0.16),
                ((15.45 * 12) + ((15.45 * 12) * 0.16)));
    }
}