package com.github.suloginscene.problemsolving.ndb.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CurriculumTest {

    Curriculum curriculum;


    @BeforeEach
    void setup() {
        curriculum = new Curriculum();
    }


    @Test
    void test() {
        String input = "5\n10 -1\n10 1 -1\n4 1 -1\n4 3 1 -1\n3 3 -1";
        String result = curriculum.execute(input);
        assertEquals("10\n20\n14\n18\n17", result);
    }

}