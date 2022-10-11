package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialTest {

    ImperialCalculator exp = new ImperialCalculator();

    @Test
    void centimeterTest1() {
        double a = 10;
        double expectedResult = 25.4;
        double result = exp.centimeter(a);
        assertEquals(expectedResult, result);
    }
}