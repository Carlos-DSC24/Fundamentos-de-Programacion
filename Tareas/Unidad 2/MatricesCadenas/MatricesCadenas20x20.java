package MatricesCadenas;

import java.util.Random;
import java.util.Scanner;

public class MatricesCadenas20x20 {

    static final int TAM = 20;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] M = new String[TAM][TAM];
        String[][] T = new String[TAM][TAM];
        int opcion;

        inicializarMatriz(M);

        do {
            mostrarMenu();
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    llenarManual(M);
                    break;
                case 2:
                    llenarAleatorio(M);
                    break;
                case 3:
                    mostrarMatrizCad(M, "M");
                    break;
                case 4:
                    buscarPalabra(M);
                    break;
                case 5:
                    contarOcurrencias(M);
                    break;
                case 6:
                    reemplazarPalabra(M);
                    break;
                case 7:
                    palabraMasLargaCorta(M);
                    break;
                case 8:
                    contarVacias(M);
                    break;
                case 9:
                    transpuestaCad(M, T);
                    break;
                case 10:
                    concatenarTodo(M);
                    break;
                case 11:
                    buscarPalindromos(M);
                    break;
                case 12:
                    ordenarFilas(M);
                    break;
                case 13:
                    ordenarToda(M);
                    break;
                case 14:
                    contarVocalesConsonantes(M);
                    break;
                case 15:
                    convertirMayusculas(M);
                    break;
                case 16:
                    convertirMinusculas(M);
                    break;
                case 17:
                    invertirPalabras(M);
                    break;
                case 18:
                    filtrarPorLongitud(M);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // ==========================================
    // MODELO DE SISTEMA DE MENÚ (Capítulo 4)
    // ==========================================
    public static void mostrarMenu() {
        System.out.println("\n=== MATRICES DE CADENAS 20x20 ===");
        System.out.println("1. Llenar matriz manualmente");
        System.out.println("2. Llenar con palabras aleatorias");
        System.out.println("3. Mostrar matriz");
        System.out.println("4. Buscar una palabra (posición)");
        System.out.println("5. Contar ocurrencias de una palabra");
        System.out.println("6. Reemplazar palabra por otra");
        System.out.println("7. Mostrar la palabra más larga y más corta");
        System.out.println("8. Contar cuántas celdas están vacías");
        System.out.println("9. Transpuesta de la matriz");
        System.out.println("10. Concatenar toda la matriz en una cadena");
        System.out.println("11. Buscar palíndromos en la matriz");
        System.out.println("12. Ordenar cada fila alfabéticamente");
        System.out.println("13. Ordenar toda la matriz alfabéticamente");
        System.out.println("14. Contar vocales y consonantes totales");
        System.out.println("15. Convertir todo a MAYÚSCULAS");
        System.out.println("16. Convertir todo a minúsculas");
        System.out.println("17. Invertir cada palabra");
        System.out.println("18. Filtrar palabras por longitud mínima");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int leerEntero() {
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número: ");
            sc.next();
        }
        int num = sc.nextInt();
        sc.nextLine(); // Limpiar el salto de línea del buffer
        return num;
    }

    // ==========================================
    // FUNCIONES Y PROCEDIMIENTOS (Capítulo 3)
    // ==========================================
    public static void inicializarMatriz(String[][] M) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                M[i][j] = "";
            }
        }
    }

    public static void llenarManual(String[][] M) {
        System.out.println("Ingrese las palabras (Enter para dejar vacío):");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "]: ");
                M[i][j] = sc.nextLine();
            }
        }
        System.out.println("Matriz llenada.");
    }

    public static void llenarAleatorio(String[][] M) {
        String[] palabras = {
            "sol", "luna", "mar", "cielo", "arbol",
            "reconocer", "oso", "radar", "computadora", "libro",
            "nube", "fuego", "anilina", "programa", "a"
        };
        Random rand = new Random();

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                int idx = rand.nextInt(palabras.length);
                M[i][j] = palabras[idx];
            }
        }
        System.out.println("Matriz llenada con palabras aleatorias.");
    }

    public static void mostrarMatrizCad(String[][] M, String nombre) {
        System.out.println("\n--- MATRIZ " + nombre + " ---");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                // Formato fijo con ancho de 12 caracteres alineado a la izquierda
                System.out.printf("%-12s", M[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void buscarPalabra(String[][] M) {
        System.out.print("Palabra a buscar: ");
        String buscada = sc.nextLine();
        boolean encontrada = false;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (M[i][j].equals(buscada)) {
                    System.out.println("Encontrada en [" + (i + 1) + "," + (j + 1) + "]");
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    public static void contarOcurrencias(String[][] M) {
        System.out.print("Palabra a contar: ");
        String buscada = sc.nextLine();
        int cont = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (M[i][j].equals(buscada)) {
                    cont++;
                }
            }
        }
        System.out.println("Ocurrencias de '" + buscada + "': " + cont);
    }

    public static void reemplazarPalabra(String[][] M) {
        System.out.print("Palabra a reemplazar: ");
        String vieja = sc.nextLine();
        System.out.print("Nueva palabra: ");
        String nueva = sc.nextLine();
        int cont = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (M[i][j].equals(vieja)) {
                    M[i][j] = nueva;
                    cont++;
                }
            }
        }
        System.out.println("Reemplazos realizados: " + cont);
    }

    public static void palabraMasLargaCorta(String[][] M) {
        int lenMax = 0;
        int lenMin = Integer.MAX_VALUE;
        String masLarga = "";
        String masCorta = "";
        int posMaxF = 0, posMaxC = 0, posMinF = 0, posMinC = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (!M[i][j].isEmpty()) {
                    int len = M[i][j].length();
                    if (len > lenMax) {
                        lenMax = len;
                        masLarga = M[i][j];
                        posMaxF = i + 1;
                        posMaxC = j + 1;
                    }
                    if (len < lenMin) {
                        lenMin = len;
                        masCorta = M[i][j];
                        posMinF = i + 1;
                        posMinC = j + 1;
                    }
                }
            }
        }

        if (lenMax == 0) {
            System.out.println("La matriz está completamente vacía.");
        } else {
            System.out.println("Más larga: \"" + masLarga + "\" (" + lenMax + " chars) en [" + posMaxF + "," + posMaxC + "]");
            System.out.println("Más corta: \"" + masCorta + "\" (" + lenMin + " chars) en [" + posMinF + "," + posMinC + "]");
        }
    }

    public static void contarVacias(String[][] M) {
        int vacias = 0;
        int llenas = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (M[i][j].isEmpty()) {
                    vacias++;
                } else {
                    llenas++;
                }
            }
        }
        System.out.println("Vacías: " + vacias + " | Llenas: " + llenas);
    }

    public static void transpuestaCad(String[][] M, String[][] T) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                T[i][j] = M[j][i];
            }
        }
        System.out.println("Transpuesta generada.");
        mostrarMatrizCad(T, "M^T");
    }

    public static void concatenarTodo(String[][] M) {
        StringBuilder cadenaFinal = new StringBuilder();

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (!M[i][j].isEmpty()) {
                    cadenaFinal.append(M[i][j]).append(" ");
                }
            }
        }
        String resultado = cadenaFinal.toString();
        System.out.println("Cadena concatenada:");
        System.out.println(resultado);
        System.out.println("Longitud total: " + resultado.length());
    }

    public static boolean esPalindromo(String palabra) {
        int len = palabra.length();
        if (len < 2) {
            return false;
        }
        for (int i = 0; i < len / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void buscarPalindromos(String[][] M) {
        int cont = 0;
        System.out.println("Palíndromos encontrados:");

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (!M[i][j].isEmpty() && esPalindromo(M[i][j])) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    public static void ordenarFilas(String[][] M) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM - 1; j++) {
                for (int k = 0; k < TAM - 1 - j; k++) {
                    if (M[i][k].compareTo(M[i][k + 1]) > 0) {
                        String temp = M[i][k];
                        M[i][k] = M[i][k + 1];
                        M[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Filas ordenadas alfabéticamente.");
        mostrarMatrizCad(M, "M ordenada por filas");
    }

    public static void ordenarToda(String[][] M) {
        int totalElementos = TAM * TAM;
        String[] V = new String[totalElementos];
        int idx = 0;

        // Volcar matriz a vector
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                V[idx++] = M[i][j];
            }
        }

        // Ordenamiento burbuja sobre 400 elementos
        for (int a = 0; a < totalElementos - 1; a++) {
            for (int b = 0; b < totalElementos - 1 - a; b++) {
                if (V[b].compareTo(V[b + 1]) > 0) {
                    String temp = V[b];
                    V[b] = V[b + 1];
                    V[b + 1] = temp;
                }
            }
        }

        // Volver a la matriz
        idx = 0;
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                M[i][j] = V[idx++];
            }
        }
        System.out.println("Matriz ordenada globalmente.");
        mostrarMatrizCad(M, "M ordenada global");
    }

    public static void contarVocalesConsonantes(String[][] M) {
        int vocales = 0;
        int consonantes = 0;
        String vocalesStr = "aeiouAEIOU";

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                String palabra = M[i][j];
                for (int k = 0; k < palabra.length(); k++) {
                    char letra = palabra.charAt(k);
                    if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                        if (vocalesStr.indexOf(letra) != -1) {
                            vocales++;
                        } else {
                            consonantes++;
                        }
                    }
                }
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public static void convertirMayusculas(String[][] M) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                M[i][j] = M[i][j].toUpperCase();
            }
        }
        System.out.println("Convertido a MAYÚSCULAS.");
        mostrarMatrizCad(M, "M mayúsculas");
    }

    public static void convertirMinusculas(String[][] M) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                M[i][j] = M[i][j].toLowerCase();
            }
        }
        System.out.println("Convertido a minúsculas.");
        mostrarMatrizCad(M, "M minúsculas");
    }

    public static void invertirPalabras(String[][] M) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                String original = M[i][j];
                StringBuilder invertida = new StringBuilder();
                for (int k = original.length() - 1; k >= 0; k--) {
                    invertida.append(original.charAt(k));
                }
                M[i][j] = invertida.toString();
            }
        }
        System.out.println("Palabras invertidas.");
        mostrarMatrizCad(M, "M invertida");
    }

    public static void filtrarPorLongitud(String[][] M) {
        System.out.print("Longitud mínima a conservar: ");
        int minLen = leerEntero();
        int eliminadas = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (!M[i][j].isEmpty()) {
                    if (M[i][j].length() < minLen) {
                        M[i][j] = "";
                        eliminadas++;
                    }
                }
            }
        }
        System.out.println("Palabras eliminadas: " + eliminadas);
        mostrarMatrizCad(M, "M filtrada");
    }
}