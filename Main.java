package com.evan.e.m;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] memoria = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        while (true) {
            atualizarMemoria(memoria); // Atualiza a memória
            limparTerminal(); // Limpa o terminal
            simularUSB(); // Simula transferência de dados USB
            mostrarMemoria(memoria); // Mostra o estado da memória

            Thread.sleep(1000);
        }
    }

    public static void atualizarMemoria(int[][] memoria) {
        // Alterna entre 1 e 2 no meio da memória
        memoria[1][1] = (memoria[1][1] == 0) ? 1 : 0;
    }

    public static void simularUSB() {
        int[][] usb = {
            {1, 1, 1},
            {0, 0, 0}
        };

        // Simula a transferência de dados USB (para demonstração)
        System.out.println("Simulando transferência de dados USB:");
        for (int i = 0; i < usb.length; i++) {
            for (int j = 0; j < usb[i].length; j++) {
                System.out.print(usb[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMemoria(int[][] memoria) {
        System.out.println("Estado Atual da Memória:");
        for (int[] linha : memoria) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void limparTerminal() {
        // Limpa o terminal (funciona para Windows e Unix-like)
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal.");
        }
    }
              }
