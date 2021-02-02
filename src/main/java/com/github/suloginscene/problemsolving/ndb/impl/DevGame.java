package com.github.suloginscene.problemsolving.ndb.impl;

import java.util.Scanner;


public class DevGame {

    private static final int LAND = 0;
    private static final int SEA = 1;
    private static final int VISITED = 1;


    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int direction = scanner.nextInt();

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
            }
        }


        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};


        map[y][x] = VISITED;
        int count = 1;
        int turn = 0;

        while (true) {
            if (direction == 0) {
                direction = 3;
            } else {
                direction -= 1;
            }

            int tx = x + dx[direction];
            int ty = y + dy[direction];

            if (map[ty][tx] == LAND) {
                x = tx;
                y = ty;
                map[y][x] = VISITED;
                count++;
                turn = 0;
                continue;
            } else {
                turn++;
            }

            if (turn == 4) {
                tx = x - dx[direction];
                ty = y - dy[direction];
                if (map[ty][tx] != SEA) {
                    x = tx;
                    y = ty;
                } else {
                    break;
                }
                turn = 0;
            }
        }
        return count;
    }

}
