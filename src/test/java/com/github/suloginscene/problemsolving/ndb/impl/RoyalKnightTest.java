package com.github.suloginscene.problemsolving.ndb.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoyalKnightTest {

    RoyalKnight royalKnight;

    @BeforeEach
    void setup() {
        royalKnight = new RoyalKnight();
    }

    @Test
    void test1() {
        String input = "a1";
        int result = royalKnight.execute(input);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        String input = "c2";
        int result = royalKnight.execute(input);
        assertEquals(6, result);
    }

}