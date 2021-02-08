package com.github.suloginscene.problemsolving.ndb.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EfficientMoneyTest {

    EfficientMoney efficientMoney;


    @BeforeEach
    void setup() {
        efficientMoney = new EfficientMoney();
    }


    @Test
    void test1() {
        String input = "2 15\n2\n3";
        int result = efficientMoney.execute(input);
        assertEquals(5, result);
    }

    @Test
    void test2() {
        String input = "3 4\n3\n5\n7";
        int result = efficientMoney.execute(input);
        assertEquals(-1, result);
    }

}
