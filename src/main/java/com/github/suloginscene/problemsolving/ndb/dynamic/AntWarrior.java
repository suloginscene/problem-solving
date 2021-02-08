package com.github.suloginscene.problemsolving.ndb.dynamic;

import java.util.Scanner;


public class AntWarrior {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();

        int[] store = new int[n];
        for (int i = 0; i < n; i++) {
            store[i] = scanner.nextInt();
        }


        int[] sum = new int[n];
        sum[0] = store[0];
        sum[1] = Math.max(sum[0], store[1]);

        for (int i = 2; i < n; i++) {
            int oldSum = sum[i - 2];
            int youngSum = sum[i - 1];

            sum[i] = Math.max(oldSum + store[i], youngSum);
        }

        return sum[n - 1];
    }

}
