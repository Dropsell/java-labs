package ru.bfu.ipmit.lab2;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArePermutationsTests {

    @Test
    public void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "ab1";
        String secondString = "b1a";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }

    @Test
    public void shouldReturnTrueIfStringsArePermutations1() {
        String firstString = "aa";
        String secondString = "ab";
        assertTrue(!Lab2.arePermutations(firstString, secondString));
    }

    @Test
    public void shouldReturnTrueIfStringsArePermutations2() {
        String firstString = "";
        String secondString = "";
        assertTrue(Lab2.arePermutations(firstString, secondString));
    }

}
