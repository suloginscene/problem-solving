package com.github.suloginscene.problemsolving.ndb.dfsbfs;

import java.util.Scanner;


public class IcingBeverage {

    private int n;
    private int m;
    private int[][] frame;

    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};


    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        n = scanner.nextInt();
        m = scanner.nextInt();
        frame = new int[n][m];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < m; j++) {
                frame[i][j] = Integer.parseInt(line[j]);
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean newVisit = dfs(i, j);
                if (newVisit) {
                    count++;
                }
            }
        }
        return count;
    }


    private boolean dfs(int y, int x) {
        if (y < 0 || x < 0 || y >= n || x >= m) return false;
        if (frame[y][x] == 1) return false;

        frame[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            dfs(y + dy[i], x + dx[i]);
        }
        return true;
    }

}
