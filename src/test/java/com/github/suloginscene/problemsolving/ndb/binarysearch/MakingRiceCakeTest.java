package com.github.suloginscene.problemsolving.ndb.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MakingRiceCakeTest {

    MakingRiceCake makingRiceCake;

    @BeforeEach
    void setup() {
        makingRiceCake = new MakingRiceCake();
    }

    @Test
    void test() {
        String input = "4 6\n19 15 10 17";
        int result = makingRiceCake.execute(input);
        assertEquals(15, result);
    }

}