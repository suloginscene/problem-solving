package com.github.suloginscene.problemsolving.ndb.dynamic;


public class CountToOne {

    public int execute(int input) {
        int[] countsToOne = new int[input + 1];
        countsToOne[1] = 0;

        for (int i = 2; i <= input; i++) {
            int prev = countsToOne[i - 1];
            int curr = prev + 1;

            if (i % 2 == 0) {
                prev = countsToOne[i / 2];
                curr = Math.min(curr, prev + 1);
            }
            if (i % 3 == 0) {
                prev = countsToOne[i / 3];
                curr = Math.min(curr, prev + 1);
            }
            if (i % 5 == 0) {
                prev = countsToOne[i / 5];
                curr = Math.min(curr, prev + 1);
            }

            countsToOne[i] = curr;
        }

        return countsToOne[input];
    }

}
