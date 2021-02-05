package com.github.suloginscene.problemsolving.ndb.binarysearch;

import java.util.Scanner;


public class MakingRiceCake {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] bars = new int[n];
        for (int i = 0; i < n; i++) {
            bars[i] = scanner.nextInt();
        }


        int max = 0;
        for (int b : bars) {
            max = Math.max(max, b);
        }

        int start = 0;
        int end = max;


        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            int sum = 0;
            for (int b : bars) {
                if (b > mid) {
                    sum += b - mid;
                }
            }

            if (sum < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        return result;
    }

}
