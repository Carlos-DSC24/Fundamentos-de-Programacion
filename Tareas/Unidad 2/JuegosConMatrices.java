package TAREAMATRICES_07;

import java.util.Random;
import java.util.Scanner;

public class JuegosConMatrices {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n==========================================");
            System.out.println("      6 JUEGOS CON MATRICES EN CONSOLA");
            System.out.println("==========================================");
            System.out.println("1. Tres en Raya (Tic-Tac-Toe) 3x3");
            System.out.println("2. Buscaminas simplificado 8x8");
            System.out.println("3. Serpiente (Snake) 10x10");
            System.out.println("4. Damas simplificado 6x6");
            System.out.println("5. Memoria (Adivina la posicion) 5x5");
            System.out.println("6. Laberinto 10x10");
            System.out.println("0. Salir");
            System.out.println("==========================================");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> tresEnRaya();
                case 2 -> buscaminas();
                case 3 -> serpiente();
                case 4 -> damas();
                case 5 -> memoria();
                case 6 -> laberinto();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }

    // JUEGO 1: TRES EN RAYA (3x3)
    public static void tresEnRaya() {
        String[][] tab = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) tab[i][j] = " ";
        }

        int turno = 1, ganador = 0, jugadas = 0;
        while (ganador == 0 && jugadas < 9) {
            System.out.println("\n  1   2   3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tab[i][j]);
                    if (j < 2) System.out.print(" | ");
                }
                System.out.println();
                if (i < 2) System.out.println(" ---+---+---");
            }

            String marca = (turno == 1) ? "X" : "O";
            System.out.println("\nTurno de " + marca);
            System.out.print("Fila (1-3): ");
            int fila = Integer.parseInt(sc.nextLine()) - 1;
            System.out.print("Columna (1-3): ");
            int col = Integer.parseInt(sc.nextLine()) - 1;

            if (fila >= 0 && fila < 3 && col >= 0 && col < 3 && tab[fila][col].equals(" ")) {
                tab[fila][col] = marca;
                jugadas++;

                for (int i = 0; i < 3; i++) {
                    if (tab[i][0].equals(marca) && tab[i][1].equals(marca) && tab[i][2].equals(marca)) ganador = turno;
                }
                for (int j = 0; j < 3; j++) {
                    if (tab[0][j].equals(marca) && tab[1][j].equals(marca) && tab[2][j].equals(marca)) ganador = turno;
                }
                if (tab[0][0].equals(marca) && tab[1][1].equals(marca) && tab[2][2].equals(marca)) ganador = turno;
                if (tab[0][2].equals(marca) && tab[1][1].equals(marca) && tab[2][0].equals(marca)) ganador = turno;

                if (ganador == 0) turno = (turno == 1) ? 2 : 1;
            } else {
                System.out.println("Movimiento invalido.");
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
        if (ganador == 1) System.out.println("GANA X!");
        else if (ganador == 2) System.out.println("GANA O!");
        else System.out.println("EMPATE!");
    }

    // JUEGO 2: BUSCAMINAS SIMPLIFICADO 8x8 (10 minas)
    public static void buscaminas() {
        int[][] tab = new int[8][8];
        int[][] visible = new int[8][8];

        int minasPuestas = 0;
        while (minasPuestas < 10) {
            int f = rand.nextInt(8);
            int c = rand.nextInt(8);
            if (tab[f][c] != -1) {
                tab[f][c] = -1;
                minasPuestas++;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tab[i][j] != -1) {
                    int cont = 0;
                    for (int r = i - 1; r <= i + 1; r++) {
                        for (int c = j - 1; c <= j + 1; c++) {
                            if (r >= 0 && r < 8 && c >= 0 && c < 8 && tab[r][c] == -1) cont++;
                        }
                    }
                    tab[i][j] = cont;
                }
            }
        }

        int vivo = 1, descubiertas = 0;
        while (vivo == 1 && descubiertas < 54) {
            System.out.print("\n  ");
            for (int j = 1; j <= 8; j++) System.out.print(j + " ");
            System.out.println();
            for (int i = 0; i < 8; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 8; j++) {
                    if (visible[i][j] == 1) {
                        if (tab[i][j] == -1) System.out.print("* ");
                        else if (tab[i][j] == 0) System.out.print(". ");
                        else System.out.print(tab[i][j] + " ");
                    } else {
                        System.out.print("# ");
                    }
                }
                System.out.println();
            }

            System.out.println("Descubiertas: " + descubiertas + "/54");
            System.out.print("Fila (1-8): ");
            int fila = Integer.parseInt(sc.nextLine()) - 1;
            System.out.print("Columna (1-8): ");
            int col = Integer.parseInt(sc.nextLine()) - 1;

            if (fila >= 0 && fila < 8 && col >= 0 && col < 8 && visible[fila][col] == 0) {
                visible[fila][col] = 1;
                if (tab[fila][col] == -1) {
                    System.out.println("BOOM! Pisaste una mina.");
                    vivo = 0;
                } else {
                    descubiertas++;
                    if (tab[fila][col] == 0) {
                        for (int r = fila - 1; r <= fila + 1; r++) {
                            for (int c = col - 1; c <= col + 1; c++) {
                                if (r >= 0 && r < 8 && c >= 0 && c < 8 && visible[r][c] == 0 && tab[r][c] != -1) {
                                    visible[r][c] = 1;
                                    descubiertas++;
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Movimiento invalido.");
            }
        }

        if (vivo == 1) {
            System.out.println("GANASTE! Encontraste todas las casillas seguras.");
        } else {
            System.out.println("GAME OVER. Tablero completo:");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(tab[i][j] == -1 ? "* " : tab[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // JUEGO 3: SERPIENTE (SNAKE) 10x10
    public static void serpiente() {
        String[][] tab = new String[10][10];
        int[][] cuerpo = new int[100][2];
        int largo = 3;
        cuerpo[0][0] = 4; cuerpo[0][1] = 4;
        cuerpo[1][0] = 4; cuerpo[1][1] = 3;
        cuerpo[2][0] = 4; cuerpo[2][1] = 2;

        int comidaF = rand.nextInt(10);
        int comidaC = rand.nextInt(10);
        int dir = 4, juegoActivo = 1;

        while (juegoActivo == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) tab[i][j] = ".";
            }
            tab[comidaF][comidaC] = "@";
            for (int i = 0; i < largo; i++) {
                tab[cuerpo[i][0]][cuerpo[i][1]] = (i == 0) ? "O" : "o";
            }

            System.out.println();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) System.out.print(tab[i][j] + " ");
                System.out.println();
            }

            System.out.println("Largo: " + largo + " | @=comida | O=cabeza | o=cuerpo");
            System.out.println("W=arriba S=abajo A=izq D=der Q=salir");
            System.out.print("Movimiento: ");
            String tecla = sc.nextLine().toLowerCase();

            if (tecla.equals("q")) {
                juegoActivo = 0;
            } else {
                if (tecla.equals("w")) dir = 1;
                else if (tecla.equals("s")) dir = 2;
                else if (tecla.equals("a")) dir = 3;
                else if (tecla.equals("d")) dir = 4;

                int nuevaF = cuerpo[0][0];
                int nuevaC = cuerpo[0][1];
                if (dir == 1) nuevaF--;
                if (dir == 2) nuevaF++;
                if (dir == 3) nuevaC--;
                if (dir == 4) nuevaC++;

                if (nuevaF < 0 || nuevaF >= 10 || nuevaC < 0 || nuevaC >= 10) {
                    System.out.println("Chocaste con la pared. GAME OVER.");
                    juegoActivo = 0;
                } else {
                    boolean choque = false;
                    for (int i = 0; i < largo; i++) {
                        if (cuerpo[i][0] == nuevaF && cuerpo[i][1] == nuevaC) choque = true;
                    }
                    if (choque) {
                        System.out.println("Te mordiste. GAME OVER.");
                        juegoActivo = 0;
                    } else {
                        boolean crecio = (nuevaF == comidaF && nuevaC == comidaC);
                        if (crecio) largo++;
                        for (int i = largo - 1; i >= 1; i--) {
                            cuerpo[i][0] = cuerpo[i - 1][0];
                            cuerpo[i][1] = cuerpo[i - 1][1];
                        }
                        cuerpo[0][0] = nuevaF;
                        cuerpo[0][1] = nuevaC;

                        if (crecio) {
                            int cont;
                            do {
                                comidaF = rand.nextInt(10);
                                comidaC = rand.nextInt(10);
                                cont = 0;
                                for (int i = 0; i < largo; i++) {
                                    if (cuerpo[i][0] == comidaF && cuerpo[i][1] == comidaC) cont = 1;
                                }
                            } while (cont != 0);
                        }
                        if (largo == 100) {
                            System.out.println("GANASTE! Llenaste el tablero.");
                            juegoActivo = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Juego terminado. Largo final: " + largo);
    }

    // JUEGO 4: DAMAS SIMPLIFICADO 6x6
    public static void damas() {
        String[][] tab = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) tab[i][j] = ".";
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 6; j++) if ((i + j) % 2 == 0) tab[i][j] = "X";
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) if ((i + j) % 2 == 0) tab[i][j] = "O";
        }

        int turno = 1, ganador = 0;
        while (ganador == 0) {
            System.out.print("\n  ");
            for (int j = 1; j <= 6; j++) System.out.print(j + " ");
            System.out.println();
            for (int i = 0; i < 6; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 6; j++) System.out.print(tab[i][j] + " ");
                System.out.println();
            }

            int contX = 0, contO = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (tab[i][j].equals("X")) contX++;
                    if (tab[i][j].equals("O")) contO++;
                }
            }
            if (contX == 0) ganador = 2;
            if (contO == 0) ganador = 1;

            if (ganador == 0) {
                if (turno == 1) {
                    System.out.println("Turno: X (jugador)");
                    System.out.print("Fila origen: ");
                    int fi = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.print("Col origen: ");
                    int ci = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.print("Fila destino: ");
                    int ff = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.print("Col destino: ");
                    int cf = Integer.parseInt(sc.nextLine()) - 1;

                    boolean movValido = false;
                    if (fi >= 0 && fi < 6 && ci >= 0 && ci < 6 && ff >= 0 && ff < 6 && cf >= 0 && cf < 6) {
                        if (tab[fi][ci].equals("X") && tab[ff][cf].equals(".")) {
                            if (ff == fi - 1 && (cf == ci - 1 || cf == ci + 1)) {
                                movValido = true;
                            } else if (ff == fi - 2 && (cf == ci - 2 || cf == ci + 2)) {
                                int medioF = (fi + ff) / 2;
                                int medioC = (ci + cf) / 2;
                                if (tab[medioF][medioC].equals("O")) {
                                    movValido = true;
                                    tab[medioF][medioC] = ".";
                                }
                            }
                        }
                    }
                    if (movValido) {
                        tab[ff][cf] = "X";
                        tab[fi][ci] = ".";
                        turno = 2;
                    } else {
                        System.out.println("Movimiento invalido.");
                    }
                } else {
                    System.out.println("Turno: O (CPU)...");
                    boolean movValido = false;
                    // Captura
                    for (int i = 0; i < 6 && !movValido; i++) {
                        for (int j = 0; j < 6 && !movValido; j++) {
                            if (tab[i][j].equals("O")) {
                                if (i + 2 < 6 && j + 2 < 6 && tab[i + 1][j + 1].equals("X") && tab[i + 2][j + 2].equals(".")) {
                                    tab[i + 2][j + 2] = "O"; tab[i + 1][j + 1] = "."; tab[i][j] = ".";
                                    movValido = true;
                                } else if (i + 2 < 6 && j - 2 >= 0 && tab[i + 1][j - 1].equals("X") && tab[i + 2][j - 2].equals(".")) {
                                    tab[i + 2][j - 2] = "O"; tab[i + 1][j - 1] = "."; tab[i][j] = ".";
                                    movValido = true;
                                }
                            }
                        }
                    }
                    // Movimiento simple
                    for (int i = 0; i < 6 && !movValido; i++) {
                        for (int j = 0; j < 6 && !movValido; j++) {
                            if (tab[i][j].equals("O")) {
                                if (i + 1 < 6 && j + 1 < 6 && tab[i + 1][j + 1].equals(".")) {
                                    tab[i + 1][j + 1] = "O"; tab[i][j] = ".";
                                    movValido = true;
                                } else if (i + 1 < 6 && j - 1 >= 0 && tab[i + 1][j - 1].equals(".")) {
                                    tab[i + 1][j - 1] = "O"; tab[i][j] = ".";
                                    movValido = true;
                                }
                            }
                        }
                    }
                    if (movValido) turno = 1;
                    else ganador = 1;
                }
            }
        }
        System.out.println(ganador == 1 ? "GANASTE (X)!" : "Gano la CPU (O).");
    }

    // JUEGO 5: MEMORIA (ADIVINA LA POSICION) 5x5
    public static void memoria() {
        String[][] original = new String[5][5];
        String[][] visible = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                original[i][j] = ".";
                visible[i][j] = ".";
            }
        }

        String letras = "ABCDE";
        int k = 0;
        while (k < 5) {
            int f = rand.nextInt(5);
            int c = rand.nextInt(5);
            if (original[f][c].equals(".")) {
                original[f][c] = String.valueOf(letras.charAt(k));
                k++;
            }
        }

        System.out.println("\nMemoriza las posiciones de A, B, C, D, E:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(original[i][j] + " ");
            System.out.println();
        }
        System.out.print("Presiona ENTER cuando hayas memorizado...");
        sc.nextLine();

        int aciertos = 0, intentos = 0;
        while (aciertos < 5 && intentos < 10) {
            System.out.println("\nIntento " + (intentos + 1) + "/10 - Aciertos: " + aciertos + "/5");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) System.out.print(visible[i][j] + " ");
                System.out.println();
            }
            System.out.print("Que letra (A-E): ");
            String letraBuscada = sc.nextLine().toUpperCase();
            System.out.print("Fila (1-5): ");
            int fila = Integer.parseInt(sc.nextLine()) - 1;
            System.out.print("Col (1-5): ");
            int col = Integer.parseInt(sc.nextLine()) - 1;

            if (fila >= 0 && fila < 5 && col >= 0 && col < 5) {
                if (!visible[fila][col].equals(".")) {
                    System.out.println("Esa posicion ya fue descubierta.");
                } else {
                    intentos++;
                    if (original[fila][col].equals(letraBuscada)) {
                        System.out.println("CORRECTO!");
                        visible[fila][col] = letraBuscada;
                        aciertos++;
                    } else {
                        System.out.println("FALLASTE. En esa posicion habia '" + original[fila][col] + "'.");
                    }
                }
            } else {
                System.out.println("Posicion invalida.");
            }
        }
        if (aciertos == 5) System.out.println("GANASTE! Encontraste las 5 letras.");
        else System.out.println("GAME OVER. Solo acertaste " + aciertos + " de 5.");
    }

    // JUEGO 6: LABERINTO 10x10
    public static void laberinto() {
        int[][] lab = new int[10][10];
        for (int j = 0; j < 8; j++) lab[2][j] = 1;
        for (int j = 2; j < 10; j++) lab[5][j] = 1;
        for (int i = 0; i < 6; i++) lab[i][7] = 1;
        for (int i = 3; i < 10; i++) lab[i][2] = 1;

        lab[0][0] = 0;
        lab[9][9] = 0;
        int fila = 0, col = 0, salidaF = 9, salidaC = 9, pasos = 0, juegoActivo = 1;

        while (juegoActivo == 1) {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == fila && j == col) System.out.print("@ ");
                    else if (i == salidaF && j == salidaC) System.out.print("S ");
                    else if (lab[i][j] == 1) System.out.print("# ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println("Pasos: " + pasos + " | @=tu | S=salida | #=pared");
            System.out.println("W=arriba S=abajo A=izq D=der Q=salir");
            System.out.print("Movimiento: ");
            String tecla = sc.nextLine().toLowerCase();

            if (tecla.equals("q")) {
                juegoActivo = 0;
            } else {
                if (tecla.equals("w") && fila > 0 && lab[fila - 1][col] != 1) {
                    fila--; pasos++;
                } else if (tecla.equals("s") && fila < 9 && lab[fila + 1][col] != 1) {
                    fila++; pasos++;
                } else if (tecla.equals("a") && col > 0 && lab[fila][col - 1] != 1) {
                    col--; pasos++;
                } else if (tecla.equals("d") && col < 9 && lab[fila][col + 1] != 1) {
                    col++; pasos++;
                } else {
                    System.out.println("Movimiento bloqueado.");
                }

                if (fila == salidaF && col == salidaC) {
                    System.out.println("FELICIDADES! Llegaste a la salida en " + pasos + " pasos.");
                    juegoActivo = 0;
                }
            }
        }
    }
}