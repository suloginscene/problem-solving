package com.github.suloginscene.problemsolving.ndb.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AntWarriorTest {

    AntWarrior antWarrior;


    @BeforeEach
    void setup() {
        antWarrior = new AntWarrior();
    }


    @Test
    void test() {
        String input = "4\n1 3 1 5";
        int result = antWarrior.execute(input);
        assertEquals(8, result);
    }

}