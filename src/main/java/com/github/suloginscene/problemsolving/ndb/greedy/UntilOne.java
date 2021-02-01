package com.github.suloginscene.problemsolving.ndb.greedy;

import java.util.Scanner;


public class UntilOne {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int k = scanner.nextInt();


        int count = 0;

        while (n > 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }

        return count;
    }

}
