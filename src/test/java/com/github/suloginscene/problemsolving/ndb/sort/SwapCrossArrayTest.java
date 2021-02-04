package com.github.suloginscene.problemsolving.ndb.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SwapCrossArrayTest {

    SwapCrossArray swapCrossArray;


    @BeforeEach
    void setup() {
        swapCrossArray = new SwapCrossArray();
    }

    @Test
    void test() {
        String input = "5 3\n1 2 5 4 3\n5 5 6 6 5";
        int result = swapCrossArray.execute(input);
        assertEquals(26, result);
    }

}
