package com.github.suloginscene.problemsolving.ndb.dynamic;

import java.util.Arrays;
import java.util.Scanner;


public class EfficientMoney {

    private static final int INF = 987654321;


    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }


        int[] count = new int[m + 1];
        for (int i = 1; i < m + 1; i++) {
            count[i] = INF;
        }


        Arrays.sort(coins);
        for (int c : coins) {
            for (int i = c; i < m + 1; i++) {
                count[i] = Math.min(count[i], count[i - c] + 1);
            }
        }

        return (count[m] != INF) ? count[m] : -1;
    }

}
