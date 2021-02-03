package com.github.suloginscene.problemsolving.ndb.dfsbfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IcingBeverageTest {

    IcingBeverage icingBeverage;

    @BeforeEach
    void setup() {
        icingBeverage = new IcingBeverage();
    }

    @Test
    void test1() {
        String input = "4 5\n00110\n00011\n11111\n00000";
        int result = icingBeverage.execute(input);
        assertEquals(3, result);
    }

    @Test
    void test2() {
        String input = "15 14\n" +
                "00000111100000\n11111101111110\n11011101101110\n11011101100000\n11011111111111\n" +
                "11011111111100\n11000000011111\n01111111111111\n00000000011111\n01111111111000\n" +
                "00011111111000\n00000001111000\n11111111110011\n11100011111111\n11100011111111";
        int result = icingBeverage.execute(input);
        assertEquals(8, result);
    }

}