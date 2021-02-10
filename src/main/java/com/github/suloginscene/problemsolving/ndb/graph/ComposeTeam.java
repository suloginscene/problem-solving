package com.github.suloginscene.problemsolving.ndb.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class ComposeTeam {

    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Input[] inputs = new Input[m];
        for (int i = 0; i < m; i++) {
            int code = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            inputs[i] = new Input(code, a, b);
        }


        SetSet teams = new SetSet();
        for (int i = 0; i < n + 1; i++) {
            HashSet<Integer> team = new HashSet<>();
            team.add(i);
            teams.add(team);
        }


        List<Boolean> results = new ArrayList<>();
        for (Input i : inputs) {
            int a = i.getA();
            int b = i.getB();

            if (i.isUnion()) {
                teams.union(a, b);
                continue;
            }

            if (i.isCheck()) {
                boolean check = teams.check(a, b);
                results.add(check);
                continue;
            }

            throw new IllegalStateException();
        }

        return results.stream()
                .map(b -> (b) ? "YES" : "NO")
                .collect(Collectors.joining("\n"));
    }

}


class Input {

    private final int code;
    private final int a;
    private final int b;


    Input(int code, int a, int b) {
        this.code = code;
        this.a = a;
        this.b = b;
    }

    public boolean isUnion() {
        return code == 0;
    }

    public boolean isCheck() {
        return code == 1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}


class SetSet extends HashSet<Set<Integer>> {

    public void union(Integer a, Integer b) {
        Set<Integer> setA = findSet(a);
        Set<Integer> setB = findSet(b);

        remove(setA);
        remove(setB);


        HashSet<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);

        add(union);
    }

    public boolean check(Integer a, Integer b) {
        Set<Integer> setA = findSet(a);
        Set<Integer> setB = findSet(b);

        return setA == setB;
    }


    private Set<Integer> findSet(Integer element) {
        Iterator<Set<Integer>> iterator = iterator();

        while (iterator().hasNext()) {
            Set<Integer> set = iterator.next();
            if (set.contains(element)) {
                return set;
            }
        }
        throw new NoSuchElementException();
    }

}
