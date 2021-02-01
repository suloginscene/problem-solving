package com.github.suloginscene.problemsolving.ndb.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LawOfGreatNumbersTest {

    LawOfGreatNumbers lawOfGreatNumbers;

    @BeforeEach
    void setup() {
        lawOfGreatNumbers = new LawOfGreatNumbers();
    }

    @Test
    void test1() {
        String input = "5 8 3\n2 4 5 4 6";
        int result = lawOfGreatNumbers.execute(input);
        assertEquals(46, result);
    }

    @Test
    void test2() {
        String input = "5 7 2\n3 4 3 4 3";
        int result = lawOfGreatNumbers.execute(input);
        assertEquals(28, result);
    }

}