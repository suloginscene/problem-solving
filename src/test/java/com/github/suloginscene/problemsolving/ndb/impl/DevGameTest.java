package com.github.suloginscene.problemsolving.ndb.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevGameTest {

    DevGame devGame;

    @BeforeEach
    void setup() {
        devGame = new DevGame();
    }

    @Test
    void test() {
        String input = "4 4\n1 1 0\n1 1 1 1\n1 0 0 1\n1 1 0 1\n1 1 1 1";
        int result = devGame.execute(input);
        assertEquals(3, result);
    }

}