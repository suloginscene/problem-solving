package com.github.suloginscene.problemsolving.ndb.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CountToOneTest {

    CountToOne countToOne;


    @BeforeEach
    void setup() {
        countToOne = new CountToOne();
    }


    @Test
    void test() {
        int input = 26;
        int result = countToOne.execute(input);
        assertEquals(3, result);
    }

}