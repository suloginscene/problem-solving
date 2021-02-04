package com.github.suloginscene.problemsolving.ndb.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OrderByScoreAscTest {

    OrderByScoreAsc orderByScoreAsc;


    @BeforeEach
    void setup() {
        orderByScoreAsc = new OrderByScoreAsc();
    }

    @Test
    void test() {
        String input = "2\n홍길동 95\n이순신 77";
        String result = orderByScoreAsc.execute(input);
        assertEquals("이순신 홍길동", result);
    }

}
