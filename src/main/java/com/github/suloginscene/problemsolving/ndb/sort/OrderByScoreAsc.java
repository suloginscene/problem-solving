package com.github.suloginscene.problemsolving.ndb.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class OrderByScoreAsc {

    public String execute(String input) {
        Scanner scanner = new Scanner(input);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lines.add(scanner.nextLine());
        }


        return lines.stream()
                .map(Student::new)
                .sorted()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }

}


class Student implements Comparable<Student> {

    private final String name;
    private final int score;


    Student(String line) {
        String[] tokens = line.split(" ");
        this.name = tokens[0];
        this.score = Integer.parseInt(tokens[1]);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(score, student.score);
    }

}
