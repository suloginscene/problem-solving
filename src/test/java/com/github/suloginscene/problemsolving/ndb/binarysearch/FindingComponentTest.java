package com.github.suloginscene.problemsolving.ndb.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FindingComponentTest {

    FindingComponent findingComponent;

    @BeforeEach
    void setup() {
        findingComponent = new FindingComponent();
    }

    @Test
    void test() {
        String input = "5\n8 3 7 9 2\n3\n5 7 9";
        String result = findingComponent.execute(input);
        assertEquals("no yes yes", result);
    }

}
