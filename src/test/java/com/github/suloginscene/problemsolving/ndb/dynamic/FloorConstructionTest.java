package com.github.suloginscene.problemsolving.ndb.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FloorConstructionTest {

    FloorConstruction floorConstruction;


    @BeforeEach
    void setup() {
        floorConstruction = new FloorConstruction();
    }


    @Test
    void test() {
        int input = 3;
        int result = floorConstruction.execute(input);
        assertEquals(5, result);
    }

}