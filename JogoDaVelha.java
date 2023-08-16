package sef.module4.activity;

import java.util.Scanner;

public class JogoDaVelha {
	
    public static void main(String[] args) {
    	
    	//Instanciando objeto scanner
        Scanner scanner = new Scanner(System.in);
        
        //Criando as variaveis
        char[][] jogo = new char[3][3];
        int l;
        int c;
        int linha;
        int coluna;
        int jogador;
        int ganhou;
        int jogadas;
        int opcao;

        do {
            jogador = 1;
            ganhou = 0;
            jogadas = 0;

            for (l = 0; l < 3; l++) {
                for (c = 0; c < 3; c++) {
                    jogo[l][c] = ' ';
                }
            }

            do {
                imprimeTabuleiro(jogo);

                //Ler Coordenadas
                do {
                    System.out.print("\nJogador " + jogador + " digite linha da posição desejada: ");
                    linha = scanner.nextInt();
                    System.out.print("Jogador " + jogador + " digite coluna da posição desejada: ");
                    coluna = scanner.nextInt();
                } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || jogo[linha][coluna] != ' ');

                //Salvar Coordenadas
                if (jogador == 1) {
                    jogo[linha][coluna] = '0';
                    jogador++;
                } else {
                    jogo[linha][coluna] = 'X';
                    jogador = 1;
                }
                jogadas++;

                //Verificar ganhador por linhas
                for (l = 0; l < 3; l++) {
                    if (jogo[l][0] == '0' && jogo[l][1] == '0' && jogo[l][2] == '0') {
                        ganhou = 1;
                    }
                    if (jogo[l][0] == 'X' && jogo[l][1] == 'X' && jogo[l][2] == 'X') {
                        ganhou = 2;
                    }
                }

                //Verificar ganhador por colunas
                for (c = 0; c < 3; c++) {
                    if (jogo[0][c] == '0' && jogo[1][c] == '0' && jogo[2][c] == '0') {
                        ganhou = 1;
                    }
                    if (jogo[0][c] == 'X' && jogo[1][c] == 'X' && jogo[2][c] == 'X') {
                        ganhou = 2;
                    }
                }

                //Verificar ganhador na diagonal principal
                if (jogo[0][0] == '0' && jogo[1][1] == '0' && jogo[2][2] == '0') {
                    ganhou = 1;
                }
                if (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') {
                    ganhou = 2;
                }

                //Verificar ganhador na diagonal secundária
                if (jogo[0][2] == '0' && jogo[1][1] == '0' && jogo[2][0] == '0') {
                    ganhou = 1;
                }
                if (jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X') {
                    ganhou = 2;
                }

            } while (ganhou == 0 && jogadas < 9);

            imprimeTabuleiro(jogo);

            if (ganhou == 1) {
                System.out.println("\n\tParabéns Jogador 1. Você ganhou!\n");
            } else if (ganhou == 2) {
                System.out.println("\n\tParabéns Jogador 2. Você ganhou!\n");
            }

            System.out.print("Digite 1 para jogar novamente: ");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        scanner.close();
    }

    //Função de Imprimir Tabuleiro
    public static void imprimeTabuleiro(char[][] jogo) {
        System.out.println("\n\n 0   1    2\n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + jogo[l][c]);
                if (c < 2) {
                    System.out.print(" | ");
                }
                if (c == 2) {
                    System.out.print("  " + l);
                }
            }
            if (l < 2) {
                System.out.print("\n------------");
            }
            System.out.println();
        }
    }
}