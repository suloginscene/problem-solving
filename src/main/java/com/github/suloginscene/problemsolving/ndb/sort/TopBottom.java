package com.github.suloginscene.problemsolving.ndb.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class TopBottom {

    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        Arrays.sort(array, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append(array[i]).append(" ");
        }
        sb.append(array[n - 1]);
        return sb.toString();
    }

}
