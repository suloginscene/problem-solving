package com.github.suloginscene.problemsolving.ndb.impl;


public class RoyalKnight {

    public int execute(String input) {
        String[] split = input.split("");

        int x = split[0].toCharArray()[0] - 'a' + 1;
        int y = Integer.parseInt(split[1]);


        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};


        int count = 0;
        for (int i = 0; i < 8; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if (tx > 0 && ty > 0 && tx <= 8 && ty <= 8) {
                count++;
            }
        }
        return count;
    }

}
