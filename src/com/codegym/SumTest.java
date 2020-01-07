package com.codegym;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @org.junit.jupiter.api.Test
    void add() {
        Sum sum = new Sum();
        int i = sum.add(5,6);
        assertEquals(11,i);
    }
}