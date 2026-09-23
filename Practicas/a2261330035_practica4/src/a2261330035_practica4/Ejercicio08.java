package a2261330035_practica4;

public class Ejercicio08 {

	public static void main(String[] args) {
        System.out.println("Coca cola de lata -> 15.45");
        System.out.println("Cantidad vendida 12");
        System.out.printf("el SubTotal es -> %.4f el iva es -> %.2f El total es -> %.2f\n",
                (15.45 * 12),
                ((15.45 * 12) * 0.16),
                ((15.45 * 12) + ((15.45 * 12) * 0.16)));
    }
}