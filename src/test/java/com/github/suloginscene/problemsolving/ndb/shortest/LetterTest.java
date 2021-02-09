package com.github.suloginscene.problemsolving.ndb.shortest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LetterTest {

    Letter letter;


    @BeforeEach
    void setup() {
        letter = new Letter();
    }


    @Test
    void test() {
        String input = "3 2 1\n1 2 4\n1 3 2";
        String result = letter.execute(input);
        assertEquals("2 4", result);
    }

}