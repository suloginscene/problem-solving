package com.github.suloginscene.problemsolving.ndb.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.reverseOrder;


public class LawOfGreatNumbers {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        scanner.nextInt();
        int iterCount = scanner.nextInt();
        int runLimit = scanner.nextInt();

        List<Integer> data = new ArrayList<>();
        while (scanner.hasNext()) {
            data.add(scanner.nextInt());
        }


        data.sort(reverseOrder());
        Integer max = data.get(0);
        Integer alt = data.get(1);


        int result = 0;

        int runCount = 0;
        for (int i = 0; i < iterCount; i++) {
            runCount++;
            if (runCount <= runLimit) {
                result += max;
            } else {
                result += alt;
                runCount = 0;
            }
        }

        return result;
    }

}
