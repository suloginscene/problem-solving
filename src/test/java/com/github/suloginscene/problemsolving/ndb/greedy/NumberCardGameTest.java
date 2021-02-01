package com.github.suloginscene.problemsolving.ndb.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCardGameTest {

    NumberCardGame numberCardGame;

    @BeforeEach
    void setup() {
        numberCardGame = new NumberCardGame();
    }

    @Test
    void test1() {
        String input = "3 3\n3 1 2\n4 1 4\n2 2 2";
        int result = numberCardGame.execute(input);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        String input = "2 4\n7 3 1 8\n3 3 3 4";
        int result = numberCardGame.execute(input);
        assertEquals(3, result);
    }

}