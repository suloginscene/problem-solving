package com.github.suloginscene.problemsolving.ndb.shortest;

import java.util.PriorityQueue;
import java.util.Scanner;


public class Letter {

    private static final int INF = 987654321;


    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = scanner.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int dist = scanner.nextInt();
            graph[from][to] = dist;
        }


        int[] dist = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            dist[i] = INF;
        }
        dist[start] = 0;

        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        queue.add(new Vertex(start, 0));


        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            int from = v.getIndex();
            int currDist = v.getDist();

            for (int to = 1; to < n + 1; to++) {
                int nextDist = currDist + graph[from][to];
                if (nextDist < dist[to]) {
                    dist[to] = nextDist;
                    queue.add(new Vertex(to, dist[to]));
                }
            }
        }


        long count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (dist[i] != 0 && dist[i] != INF) {
                count++;
            }
        }

        int maxCost = 0;
        for (int i = 1; i < n + 1; i++) {
            if (dist[i] != INF) {
                maxCost = Math.max(maxCost, dist[i]);
            }
        }

        return count + " " + maxCost;
    }

}


class Vertex implements Comparable<Vertex> {

    private final int index;
    private final int dist;


    Vertex(int index, int dist) {
        this.index = index;
        this.dist = dist;
    }


    public int getIndex() {
        return index;
    }

    public int getDist() {
        return dist;
    }

    @Override
    public int compareTo(Vertex vertex) {
        return Integer.compare(dist, vertex.dist);
    }

}
