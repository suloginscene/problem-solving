package com.github.suloginscene.problemsolving.ndb.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NumberCardGame {

    public int execute(String input) {
        String[] lines = input.split("\n");
        String metaLine = lines[0];
        String[] dataLines = getDataLines(lines);

        int n = getRow(metaLine);
        int m = getCol(metaLine);

        int[][] board = mapData(n, m, dataLines);

        return findResult(board);
    }


    private String[] getDataLines(String[] lines) {
        int rowSize = lines.length - 1;
        String[] dataLines = new String[rowSize];
        System.arraycopy(lines, 1, dataLines, 0, rowSize);
        return dataLines;
    }

    private int getRow(String metaLine) {
        String[] tokens = metaLine.split(" ");
        return Integer.parseInt(tokens[0]);
    }

    private int getCol(String metaLine) {
        String[] tokens = metaLine.split(" ");
        return Integer.parseInt(tokens[1]);
    }

    private int[][] mapData(int n, int m, String[] dataLines) {
        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = dataLines[i];
            String[] tokens = line.split(" ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        return board;
    }


    private int findResult(int[][] board) {
        List<Integer> mins = findMinsInRow(board);
        return findMax(mins);
    }

    private List<Integer> findMinsInRow(int[][] board) {
        List<Integer> mins = new LinkedList<>();
        for (int[] row : board) {
            int min = findMin(row);
            mins.add(min);
        }
        return mins;
    }

    private int findMin(int[] row) {
        return Arrays.stream(row).min().orElseThrow();
    }

    private int findMax(List<Integer> mins) {
        return mins.stream().max(Comparator.naturalOrder()).orElseThrow();
    }

}
