package com.github.suloginscene.problemsolving.ndb.dynamic;


public class FloorConstruction {

    public int execute(int input) {
        int[] cases = new int[input];
        cases[0] = 1;
        cases[1] = 3;

        for (int i = 2; i < input; i++) {
            int oldCase = cases[i - 2];
            int youngCase = cases[i - 1];

            cases[i] = (2 * oldCase) + youngCase;
        }
        return cases[input - 1];
    }

}
