package com.github.suloginscene.problemsolving.ndb.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DivideCityTest {

    DivideCity divideCity;


    @BeforeEach
    void setup() {
        divideCity = new DivideCity();
    }


    @Test
    void test() {
        String input = "7 12\n1 2 3\n1 3 2\n3 2 1\n2 5 2\n3 4 4\n7 3 6\n5 1 5\n1 6 2\n6 4 1\n6 5 3\n4 5 3\n6 7 4";
        int result = divideCity.execute(input);
        assertEquals(8, result);
    }

}
