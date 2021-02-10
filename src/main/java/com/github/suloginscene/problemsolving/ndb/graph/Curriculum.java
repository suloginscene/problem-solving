package com.github.suloginscene.problemsolving.ndb.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Curriculum {

    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();

        boolean[][] graph = new boolean[n + 1][n + 1];
        int[] indegree = new int[n + 1];
        int[] times = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            times[i] = scanner.nextInt();

            int pre;
            while ((pre = scanner.nextInt()) != -1) {
                graph[pre][i] = true;
                indegree[i] += 1;
            }
        }


        int[] results = times.clone();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer now = queue.poll();

            List<Integer> neighbors = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                if (graph[now][i]) {
                    neighbors.add(i);
                }
            }

            for (int i : neighbors) {
                results[i] = Math.max(results[i], results[now] + times[i]);
                indegree[i] -= 1;
                if (indegree[i] == 0) {
                    queue.add(i);
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            sb.append(results[i]).append("\n");
        }
        return sb.toString().trim();
    }

}
