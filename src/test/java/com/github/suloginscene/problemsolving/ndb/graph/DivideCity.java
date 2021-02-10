package com.github.suloginscene.problemsolving.ndb.graph;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;


public class DivideCity {

    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        PriorityQueue<Path> paths = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int cost = scanner.nextInt();

            Path path = new Path(a, b, cost);
            paths.add(path);
        }


        SetSet setSet = new SetSet();
        for (int i = 1; i < n + 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(i);
            setSet.add(set);
        }


        int edges = 0;
        int costs = 0;

        while (edges < (n - 2)) {
            Path path = paths.poll();
            if (path == null) throw new IllegalStateException();

            int a = path.getA();
            int b = path.getB();

            if (setSet.isLinked(a, b)) {
                continue;
            }

            setSet.union(a, b);
            edges += 1;
            costs += path.getCost();
        }

        return costs;
    }

}


class Path implements Comparable<Path> {

    private final int a;
    private final int b;
    private final int cost;


    Path(int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int compareTo(Path path) {
        return Integer.compare(cost, path.cost);
    }

}


class SetSet extends HashSet<Set<Integer>> {

    boolean isLinked(int a, int b) {
        return findSet(a) == findSet(b);
    }

    public void union(int a, int b) {
        Set<Integer> setA = findSet(a);
        Set<Integer> setB = findSet(b);

        remove(setA);
        remove(setB);

        Set<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);

        add(union);
    }


    private Set<Integer> findSet(int a) {
        for (Set<Integer> set : this) {
            if (set.contains(a)) {
                return set;
            }
        }
        return new HashSet<>();
    }

}
