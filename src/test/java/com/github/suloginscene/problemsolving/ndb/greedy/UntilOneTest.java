package com.github.suloginscene.problemsolving.ndb.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UntilOneTest {

    UntilOne untilOne;

    @BeforeEach
    void setup() {
        untilOne = new UntilOne();
    }

    @Test
    void test1() {
        String input = "25 5";
        int result = untilOne.execute(input);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        String input = "17 4";
        int result = untilOne.execute(input);
        assertEquals(3, result);
    }

}
