package com.github.suloginscene.problemsolving.ndb.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LawOfGreatNumbers {

    public int execute(String input) {
        String[] lines = input.split("\n");
        String metaLine = lines[0];
        String dataLine = lines[1];

        int m = getIterCount(metaLine);
        int k = getRunLimit(metaLine);
        List<Integer> list = toList(dataLine);


        PriorityQueue<Integer> queue = buildMaxHeap(list);
        Integer max = queue.poll();
        Integer alt = queue.poll();
        if (max == null || alt == null) throw new IllegalStateException();

        return calcResult(max, alt, m, k);
    }


    private int getIterCount(String metaLine) {
        String[] tokens = metaLine.split(" ");
        return Integer.parseInt(tokens[1]);
    }

    private int getRunLimit(String metaLine) {
        String[] tokens = metaLine.split(" ");
        return Integer.parseInt(tokens[2]);
    }

    private List<Integer> toList(String dataLine) {
        String[] tokens = dataLine.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : tokens) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }


    private PriorityQueue<Integer> buildMaxHeap(List<Integer> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(list);
        return pq;
    }

    private int calcResult(int max, int alt, int m, int k) {
        int result = 0;

        int runCount = 0;
        for (int i = 0; i < m; i++) {
            runCount++;
            if (runCount <= k) {
                result += max;
            } else {
                result += alt;
                runCount = 0;
            }
        }

        return result;
    }

}
