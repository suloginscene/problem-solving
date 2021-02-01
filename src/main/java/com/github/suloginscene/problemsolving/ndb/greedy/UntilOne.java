package com.github.suloginscene.problemsolving.ndb.greedy;

public class UntilOne {

    public int execute(String input) {
        int n = getNumber(input);
        int k = getDenominator(input);

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

    private int getNumber(String input) {
        String[] tokens = input.split(" ");
        return Integer.parseInt(tokens[0]);
    }

    private int getDenominator(String input) {
        String[] tokens = input.split(" ");
        return Integer.parseInt(tokens[1]);
    }

}
