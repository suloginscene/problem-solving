package com.github.suloginscene.problemsolving.ndb.sort;

import java.util.Arrays;
import java.util.Scanner;


public class SwapCrossArray {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = scanner.nextInt();
        }

        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = scanner.nextInt();
        }


        Arrays.sort(arrA);
        Arrays.sort(arrB);


        for (int i = 0; i < k; i++) {
            int src = arrB[n - 1 - i];
            if (arrA[i] < src) {
                arrA[i] = src;
            } else {
                break;
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arrA[i];
        }
        return result;
    }

}
