package com.github.suloginscene.problemsolving.ndb.shortest;

import java.util.Scanner;


public class FutureCity {

    private static final int INF = 987654321;


    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        int x = scanner.nextInt();
        int k = scanner.nextInt();


        for (int t = 1; t < n + 1; t++) {
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][t] + graph[t][j]);
                }
            }
        }

        int toK = graph[1][k];
        int toX = graph[k][x];
        boolean possible = (toK != INF) && (toX != INF);
        return (possible) ? toK + toX : -1;
    }

}
