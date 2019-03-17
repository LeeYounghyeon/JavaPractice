package com.company.bingo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0;
        int num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(bingo[i][j]+"   ");

                }
                System.out.println();
            }
            System.out.println();

            System.out.println("1-" + SIZE*SIZE + "까지 입력(종료0):");
            num = scan.nextInt();
            outer:
            for (int k = 0; k < SIZE; k++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[k][j] == num) {
                        bingo[k][j] = 0;
                        break outer;
                    }
                }
            }

        } while (num != 0);
    }
}
