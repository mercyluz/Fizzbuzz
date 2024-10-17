package org.factoriaf5.kata_fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void test_fizzbuzzReplace_returnsFizz() {
        int number = 3;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsBuzz() {
        int number = 5;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Buzz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFizzBuzz() {
        int number = 15;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("FizzBuzz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsNumber() {
        int number = 7;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals(String.valueOf(number), word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFizzContains3() {
        int number = 131;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFizzContains5() {
        int number = 151;

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Buzz", word);
    }

}