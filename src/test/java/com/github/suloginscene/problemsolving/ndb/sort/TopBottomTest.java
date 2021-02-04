package com.github.suloginscene.problemsolving.ndb.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TopBottomTest {

    TopBottom topBottom;

    @BeforeEach
    void setup() {
        topBottom = new TopBottom();
    }

    @Test
    void test() {
        String input = "3\n15\n27\n12";
        String result = topBottom.execute(input);
        assertEquals("27 15 12", result);
    }

}