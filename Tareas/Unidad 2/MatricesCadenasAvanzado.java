package MatricesCadenasAvanzado;
import java.util.Random;
import java.util.Scanner;

public class MatricesCadenasAvanzado {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static final int N_DIM = 20;

    public static void main(String[] args) {
        String[][] M = new String[N_DIM][N_DIM];
        String[][] N = new String[N_DIM][N_DIM];
        String[][] T = new String[N_DIM][N_DIM];
        int opcion;

        inicializarMatriz(M);
        inicializarMatriz(N);

        do {
            System.out.println("\n===== MATRICES DE CADENAS AVANZADO v2 =====");
            System.out.println("--- BASICAS ---");
            System.out.println("1. Llenar M manualmente");
            System.out.println("2. Llenar M con palabras aleatorias");
            System.out.println("3. Llenar N con palabras aleatorias");
            System.out.println("4. Mostrar M");
            System.out.println("5. Mostrar N");
            System.out.println("6. Buscar palabra exacta");
            System.out.println("7. Contar ocurrencias");
            System.out.println("8. Reemplazar palabra");
            System.out.println("9. Mostrar mas larga / mas corta");
            System.out.println("10. Contar vacias / llenas");
            System.out.println("11. Transpuesta de M");
            System.out.println("12. Concatenar toda M");
            System.out.println("13. Buscar palindromos");
            System.out.println("14. Ordenar filas de M");
            System.out.println("15. Ordenar toda M");
            System.out.println("16. Contar vocales y consonantes");
            System.out.println("17. Convertir a MAYUSCULAS");
            System.out.println("18. Convertir a minusculas");
            System.out.println("19. Invertir palabras");
            System.out.println("20. Filtrar por longitud minima");
            System.out.println("--- AVANZADAS ---");
            System.out.println("21. Busqueda con comodines (* y ?)");
            System.out.println("22. Busqueda con patron regex simplificado");
            System.out.println("23. Contar palabras distintas en M");
            System.out.println("24. Histograma de frecuencias de palabras");
            System.out.println("25. Frecuencia de letras en M");
            System.out.println("26. Comparar M y N (igualdad y diferencias)");
            System.out.println("27. Mapa visual de diferencias M vs N");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> llenarManual(M);
                case 2 -> llenarAleatorio(M);
                case 3 -> llenarAleatorio(N);
                case 4 -> mostrarMatrizCad(M, "M");
                case 5 -> mostrarMatrizCad(N, "N");
                case 6 -> buscarPalabra(M);
                case 7 -> contarOcurrencias(M);
                case 8 -> reemplazarPalabra(M);
                case 9 -> palabraMasLargaCorta(M);
                case 10 -> contarVacias(M);
                case 11 -> transpuestaCad(M, T);
                case 12 -> concatenarTodo(M);
                case 13 -> buscarPalindromos(M);
                case 14 -> ordenarFilas(M);
                case 15 -> ordenarToda(M);
                case 16 -> contarVocalesConsonantes(M);
                case 17 -> convertirMayusculas(M);
                case 18 -> convertirMinusculas(M);
                case 19 -> invertirPalabras(M);
                case 20 -> filtrarPorLongitud(M);
                case 21 -> busquedaComodines(M);
                case 22 -> busquedaRegexSimple(M);
                case 23 -> contarPalabrasDistintas(M);
                case 24 -> histogramaFrecuencias(M);
                case 25 -> frecuenciaLetras(M);
                case 26 -> compararMatrices(M, N);
                case 27 -> mapaDiferencias(M, N);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }

    // UTILIDADES BASICAS
    public static void inicializarMatriz(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                M[i][j] = "";
            }
        }
    }

    public static void llenarManual(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "]: ");
                M[i][j] = sc.nextLine();
            }
        }
    }

    public static void llenarAleatorio(String[][] M) {
        String[] palabras = {
            "sol", "luna", "mar", "cielo", "arbol",
            "reconocer", "oso", "radar", "computadora", "libro",
            "nube", "fuego", "anilina", "programa", "a"
        };
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                M[i][j] = palabras[rand.nextInt(palabras.length)];
            }
        }
        System.out.println("Matriz llenada con palabras aleatorias.");
    }

    public static void mostrarMatrizCad(String[][] M, String nombre) {
        System.out.println("\n===== MATRIZ " + nombre + " =====");
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                System.out.printf("%-12s", M[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // OPERACIONES BASICAS
    public static void buscarPalabra(String[][] M) {
        System.out.print("Palabra: ");
        String buscada = sc.nextLine();
        boolean encontrada = false;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (M[i][j].equals(buscada)) {
                    System.out.println("Encontrada en [" + (i + 1) + "," + (j + 1) + "]");
                    encontrada = true;
                }
            }
        }
        if (!encontrada) System.out.println("No encontrada.");
    }

    public static void contarOcurrencias(String[][] M) {
        System.out.print("Palabra: ");
        String buscada = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (M[i][j].equals(buscada)) cont++;
            }
        }
        System.out.println("Ocurrencias: " + cont);
    }

    public static void reemplazarPalabra(String[][] M) {
        System.out.print("Vieja: ");
        String vieja = sc.nextLine();
        System.out.print("Nueva: ");
        String nueva = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (M[i][j].equals(vieja)) {
                    M[i][j] = nueva;
                    cont++;
                }
            }
        }
        System.out.println("Reemplazos: " + cont);
    }

    public static void palabraMasLargaCorta(String[][] M) {
        int lenMax = 0, lenMin = 999;
        String masLarga = "", masCorta = "";
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty()) {
                    int len = M[i][j].length();
                    if (len > lenMax) {
                        lenMax = len;
                        masLarga = M[i][j];
                    }
                    if (len < lenMin) {
                        lenMin = len;
                        masCorta = M[i][j];
                    }
                }
            }
        }
        System.out.println("Mas larga: " + masLarga + " (" + lenMax + ")");
        System.out.println("Mas corta: " + masCorta + " (" + lenMin + ")");
    }

    public static void contarVacias(String[][] M) {
        int vacias = 0, llenas = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (M[i][j].isEmpty()) vacias++;
                else llenas++;
            }
        }
        System.out.println("Vacias: " + vacias + " | Llenas: " + llenas);
    }

    public static void transpuestaCad(String[][] M, String[][] T) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                T[i][j] = M[j][i];
            }
        }
        mostrarMatrizCad(T, "M^T");
    }

    public static void concatenarTodo(String[][] M) {
        StringBuilder cadenaFinal = new StringBuilder();
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty()) {
                    cadenaFinal.append(M[i][j]).append(" ");
                }
            }
        }
        System.out.println(cadenaFinal.toString());
        System.out.println("Longitud: " + cadenaFinal.length());
    }

    public static boolean esPalindromo(String palabra) {
        int len = palabra.length();
        if (len < 2) return false;
        for (int i = 0; i < len / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void buscarPalindromos(String[][] M) {
        int cont = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty() && esPalindromo(M[i][j])) {
                    System.out.println("[" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    public static void ordenarFilas(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM - 1; j++) {
                for (int k = 0; k < N_DIM - 1 - j; k++) {
                    if (M[i][k].compareTo(M[i][k + 1]) > 0) {
                        String temp = M[i][k];
                        M[i][k] = M[i][k + 1];
                        M[i][k + 1] = temp;
                    }
                }
            }
        }
        mostrarMatrizCad(M, "M filas ordenadas");
    }

    public static void ordenarToda(String[][] M) {
        String[] V = new String[N_DIM * N_DIM];
        int idx = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                V[idx++] = M[i][j];
            }
        }
        for (int a = 0; a < V.length - 1; a++) {
            for (int b = 0; b < V.length - 1 - a; b++) {
                if (V[b].compareTo(V[b + 1]) > 0) {
                    String temp = V[b];
                    V[b] = V[b + 1];
                    V[b + 1] = temp;
                }
            }
        }
        idx = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                M[i][j] = V[idx++];
            }
        }
        mostrarMatrizCad(M, "M ordenada global");
    }

    public static void contarVocalesConsonantes(String[][] M) {
        int vocales = 0, consonantes = 0;
        String vocalesStr = "aeiouAEIOU";
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                for (int k = 0; k < M[i][j].length(); k++) {
                    char letra = M[i][j].charAt(k);
                    if (vocalesStr.indexOf(letra) >= 0) {
                        vocales++;
                    } else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                        consonantes++;
                    }
                }
            }
        }
        System.out.println("Vocales: " + vocales + " | Consonantes: " + consonantes);
    }

    public static void convertirMayusculas(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                M[i][j] = M[i][j].toUpperCase();
            }
        }
        mostrarMatrizCad(M, "M mayusculas");
    }

    public static void convertirMinusculas(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                M[i][j] = M[i][j].toLowerCase();
            }
        }
        mostrarMatrizCad(M, "M minusculas");
    }

    public static void invertirPalabras(String[][] M) {
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                String invertida = "";
                for (int k = M[i][j].length() - 1; k >= 0; k--) {
                    invertida += M[i][j].charAt(k);
                }
                M[i][j] = invertida;
            }
        }
        mostrarMatrizCad(M, "M invertida");
    }

    public static void filtrarPorLongitud(String[][] M) {
        System.out.print("Longitud minima: ");
        int minLen = Integer.parseInt(sc.nextLine());
        int eliminadas = 0;
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty() && M[i][j].length() < minLen) {
                    M[i][j] = "";
                    eliminadas++;
                }
            }
        }
        System.out.println("Eliminadas: " + eliminadas);
        mostrarMatrizCad(M, "M filtrada");
    }

    // 21. BUSQUEDA CON COMODINES (* y ?)
    public static boolean coincideComodin(String texto, String patron) {
        int lt = texto.length();
        int lp = patron.length();
        boolean[][] dp = new boolean[lt + 1][lp + 1];
        dp[0][0] = true;

        for (int j = 1; j <= lp; j++) {
            if (patron.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= lt; i++) {
            for (int j = 1; j <= lp; j++) {
                char cPatron = patron.charAt(j - 1);
                char cTexto = texto.charAt(i - 1);
                if (cPatron == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (cPatron == '?' || cPatron == cTexto) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[lt][lp];
    }

    public static void busquedaComodines(String[][] M) {
        System.out.print("Patron (use * y ?): ");
        String patron = sc.nextLine();
        int cont = 0;
        System.out.println("Coincidencias:");
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty() && coincideComodin(M[i][j].toLowerCase(), patron.toLowerCase())) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    // 22. BUSQUEDA CON REGEX SIMPLIFICADO
    public static boolean esDigito(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean esLetraNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static boolean matchChar(char car, char pat) {
        if (pat == '.') return true;
        if (pat == 'd') return esDigito(car);
        if (pat == 'w') return esLetraNum(car);
        return car == pat;
    }

    public static boolean coincideRegex(String texto, String patron) {
        int lt = texto.length();
        int lp = patron.length();
        int i = 0, j = 0;
        boolean ancladoFin = false;
        boolean ok = true;

        if (lp > 0 && patron.charAt(0) == '^') {
            j = 1;
        }
        if (lp > j && patron.charAt(lp - 1) == '$') {
            ancladoFin = true;
            lp--;
        }

        while (j < lp && ok) {
            char c = patron.charAt(j);
            if (c == '\\' && j + 1 < lp) {
                c = patron.charAt(j + 1);
                j++;
            }
            char cSig = (j + 1 < lp) ? patron.charAt(j + 1) : '\0';
            boolean cuant = (cSig == '*' || cSig == '+' || cSig == '?');

            if (cuant) {
                if (cSig == '*') {
                    while (i < lt && matchChar(texto.charAt(i), c)) i++;
                } else if (cSig == '+') {
                    if (i >= lt || !matchChar(texto.charAt(i), c)) {
                        ok = false;
                    } else {
                        while (i < lt && matchChar(texto.charAt(i), c)) i++;
                    }
                } else if (cSig == '?') {
                    if (i < lt && matchChar(texto.charAt(i), c)) i++;
                }
                j += 2;
            } else {
                if (i >= lt || !matchChar(texto.charAt(i), c)) {
                    ok = false;
                } else {
                    i++;
                    j++;
                }
            }
        }

        if (ok && ancladoFin && i < lt) {
            ok = false;
        }
        return ok;
    }

    public static void busquedaRegexSimple(String[][] M) {
        System.out.print("Patron regex (^ $ . * + ? \\d \\w): ");
        String patron = sc.nextLine();
        int cont = 0;
        System.out.println("Coincidencias:");
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty() && coincideRegex(M[i][j], patron)) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    // 23. CONTAR PALABRAS DISTINTAS
    public static void contarPalabrasDistintas(String[][] M) {
        String[] unicas = new String[N_DIM * N_DIM];
        int total = 0, distintos = 0;

        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty()) {
                    total++;
                    String palabra = M[i][j];
                    boolean yaEsta = false;
                    for (int k = 0; k < distintos; k++) {
                        if (unicas[k].equals(palabra)) {
                            yaEsta = true;
                            break;
                        }
                    }
                    if (!yaEsta) {
                        unicas[distintos++] = palabra;
                    }
                }
            }
        }
        System.out.println("Total celdas con texto: " + total);
        System.out.println("Palabras distintas: " + distintos);
        System.out.println("\nListado:");
        for (int k = 0; k < distintos; k++) {
            System.out.println((k + 1) + ". " + unicas[k]);
        }
    }

    // 24. HISTOGRAMA DE FRECUENCIAS
    public static void histogramaFrecuencias(String[][] M) {
        String[] unicas = new String[N_DIM * N_DIM];
        int[] frec = new int[N_DIM * N_DIM];
        int distintos = 0;

        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (!M[i][j].isEmpty()) {
                    String palabra = M[i][j];
                    boolean yaEsta = false;
                    for (int k = 0; k < distintos; k++) {
                        if (unicas[k].equals(palabra)) {
                            frec[k]++;
                            yaEsta = true;
                            break;
                        }
                    }
                    if (!yaEsta) {
                        unicas[distintos] = palabra;
                        frec[distintos] = 1;
                        distintos++;
                    }
                }
            }
        }

        // Burbuja descendente
        for (int a = 0; a < distintos - 1; a++) {
            for (int b = 0; b < distintos - 1 - a; b++) {
                if (frec[b] < frec[b + 1]) {
                    String temp = unicas[b];
                    unicas[b] = unicas[b + 1];
                    unicas[b + 1] = temp;

                    int tempF = frec[b];
                    frec[b] = frec[b + 1];
                    frec[b + 1] = tempF;
                }
            }
        }

        int maxF = (distintos > 0) ? frec[0] : 0;
        System.out.println("\n===== HISTOGRAMA DE FRECUENCIAS =====");
        for (int k = 0; k < distintos; k++) {
            System.out.print(unicas[k] + " (" + frec[k] + "): ");
            int tamBarra = (maxF > 0) ? (frec[k] * 40) / maxF : 0;
            System.out.println("#".repeat(tamBarra));
        }
        System.out.println("\nTotal distintos: " + distintos);
    }

    // 25. FRECUENCIA DE LETRAS
    public static void frecuenciaLetras(String[][] M) {
        char[] letras = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] freq = new int[26];
        int[] ordenIdx = new int[26];
        for (int k = 0; k < 26; k++) ordenIdx[k] = k;

        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                String s = M[i][j].toLowerCase();
                for (int k = 0; k < s.length(); k++) {
                    char c = s.charAt(k);
                    if (c >= 'a' && c <= 'z') {
                        freq[c - 'a']++;
                    }
                }
            }
        }

        for (int a = 0; a < 25; a++) {
            for (int b = 0; b < 25 - a; b++) {
                if (freq[ordenIdx[b]] < freq[ordenIdx[b + 1]]) {
                    int temp = ordenIdx[b];
                    ordenIdx[b] = ordenIdx[b + 1];
                    ordenIdx[b + 1] = temp;
                }
            }
        }

        int maxF = freq[ordenIdx[0]];
        System.out.println("\n===== FRECUENCIA DE LETRAS =====");
        for (int k = 0; k < 26; k++) {
            int idx = ordenIdx[k];
            if (freq[idx] > 0) {
                System.out.print(letras[idx] + " (" + freq[idx] + "): ");
                int tamBarra = (maxF > 0) ? (freq[idx] * 40) / maxF : 0;
                System.out.println("*".repeat(tamBarra));
            }
        }
    }

    // 26. COMPARAR DOS MATRICES
    public static void compararMatrices(String[][] M, String[][] N) {
        int iguales = 0, diferentes = 0, vaciasM = 0, vaciasN = 0;
        boolean sonIguales = true;

        System.out.println("\n===== COMPARACION M vs N =====");
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                if (M[i][j].isEmpty()) vaciasM++;
                if (N[i][j].isEmpty()) vaciasN++;

                if (M[i][j].equals(N[i][j])) {
                    if (!M[i][j].isEmpty()) iguales++;
                } else {
                    diferentes++;
                    sonIguales = false;
                    System.out.println(" Dif [" + (i + 1) + "," + (j + 1) + "]: M='" + M[i][j] + "' vs N='" + N[i][j] + "'");
                }
            }
        }

        System.out.println("\n---- RESULTADOS -----");
        System.out.println("Celdas iguales (no vacias): " + iguales);
        System.out.println("Celdas diferentes:          " + diferentes);
        System.out.println("Vacias en M:                " + vaciasM);
        System.out.println("Vacias en N:                " + vaciasN);
        System.out.println(sonIguales ? "\nRESULTADO: M y N son IDENTICAS." : "\nRESULTADO: M y N son DIFERENTES.");
    }

    // 27. MAPA VISUAL DE DIFERENCIAS
    public static void mapaDiferencias(String[][] M, String[][] N) {
        System.out.println("\n===== MAPA DE DIFERENCIAS (. = igual | X = difiere) =====");
        for (int i = 0; i < N_DIM; i++) {
            for (int j = 0; j < N_DIM; j++) {
                System.out.print(M[i][j].equals(N[i][j]) ? "." : "X");
            }
            System.out.println();
        }
        System.out.println();
    }
}