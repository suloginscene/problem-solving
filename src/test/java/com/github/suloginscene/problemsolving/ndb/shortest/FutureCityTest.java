package com.github.suloginscene.problemsolving.ndb.shortest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FutureCityTest {

    FutureCity futureCity;


    @BeforeEach
    void setup() {
        futureCity = new FutureCity();
    }


    @Test
    void test1() {
        String input = "5 7\n1 2\n1 3\n1 4\n2 4\n3 4\n3 5\n4 5\n4 5\n";
        int result = futureCity.execute(input);
        assertEquals(3, result);
    }

    @Test
    void test2() {
        String input = "4 2\n1 3\n2 4\n3 4";
        int result = futureCity.execute(input);
        assertEquals(-1, result);
    }

}