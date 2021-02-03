package com.github.suloginscene.problemsolving.ndb.dfsbfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EscapingMazeTest {

    EscapingMaze escapingMaze;

    @BeforeEach
    void setup() {
        escapingMaze = new EscapingMaze();
    }

    @Test
    void test() {
        String input = "5 6\n" +
                "101010\n111111\n000001\n111111\n111111";
        int result = escapingMaze.execute(input);
        assertEquals(10, result);
    }

}