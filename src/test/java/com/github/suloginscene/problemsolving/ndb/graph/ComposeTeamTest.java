package com.github.suloginscene.problemsolving.ndb.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ComposeTeamTest {

    ComposeTeam composeTeam;


    @BeforeEach
    void setup() {
        composeTeam = new ComposeTeam();
    }


    @Test
    void test() {
        String input = "7 8\n0 1 3\n1 1 7\n0 7 6\n1 7 1\n0 3 7\n0 4 2\n0 1 1\n1 1 1";
        String result = composeTeam.execute(input);
        assertEquals("NO\nNO\nYES", result);
    }

}
