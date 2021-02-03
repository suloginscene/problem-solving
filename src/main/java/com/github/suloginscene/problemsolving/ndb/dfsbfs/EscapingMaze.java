package com.github.suloginscene.problemsolving.ndb.dfsbfs;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;


public class EscapingMaze {

    int n;
    int m;
    int[][] maze;

    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};


    public int execute(String input) {
        Scanner scanner = new Scanner(input);

        n = scanner.nextInt();
        m = scanner.nextInt();
        maze = new int[n][m];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(line[j]);
            }
        }


        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int y = pair.getY();
            int x = pair.getX();

            for (int i = 0; i < 4; i++) {
                int ty = y + dy[i];
                int tx = x + dx[i];

                if (ty < 0 || tx < 0 || ty >= n || tx >= m) continue;
                if (maze[ty][tx] == 0) continue;
                if ((tx == 0 && ty == 0) || maze[ty][tx] != 1) continue;

                maze[ty][tx] = maze[y][x] + 1;
                queue.add(new Pair(ty, tx));
            }
        }

        return maze[n - 1][m - 1];
    }

}


class Pair {

    private final int y;
    private final int x;


    Pair(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return y == pair.y && x == pair.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

}
