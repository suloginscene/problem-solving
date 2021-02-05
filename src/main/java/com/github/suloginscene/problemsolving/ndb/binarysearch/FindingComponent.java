package com.github.suloginscene.problemsolving.ndb.binarysearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static java.util.stream.Collectors.joining;


public class FindingComponent {

    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        Set<Integer> store = new HashSet<>();
        for (int i = 0; i < n; i++) {
            store.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        int[] requested = new int[m];
        for (int i = 0; i < m; i++) {
            requested[i] = scanner.nextInt();
        }


        List<Boolean> results = new ArrayList<>();
        for (int req : requested) {
            boolean result = store.contains(req);
            results.add(result);
        }

        return results.stream()
                .map(bool -> (bool) ? "yes" : "no")
                .collect(joining(" "));
    }

}
