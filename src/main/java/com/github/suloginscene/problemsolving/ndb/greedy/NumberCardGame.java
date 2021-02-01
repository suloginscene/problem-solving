package com.github.suloginscene.problemsolving.ndb.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;
import static java.util.Comparator.naturalOrder;


public class NumberCardGame {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scanner.nextInt();
            }
        }


        List<Integer> mins = new ArrayList<>();
        for (int[] row : board) {
            int min = stream(row).min().orElseThrow();
            mins.add(min);
        }

        return mins.stream().max(naturalOrder()).orElseThrow();
    }

}
