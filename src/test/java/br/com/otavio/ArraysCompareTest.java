package br.com.otavio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {


    @Test
    @DisplayName("Test description")
    void testArrays_GivenTwoArrays_ReturnsEquals () {
        //Given()
        int[] numbers = {25, 8, 21, 32, 3};
        int[] expectedArray = {3, 8, 21, 25, 32};

        //When()

        // Se não houver o metodo sort antes, o java comparara os hash dos objetos, acusando serem diferentes, mesmo que tenham os mesmos numeros dentro
        Arrays.sort(numbers);

        //Then()
        assertArrayEquals(numbers, expectedArray);
    }

}


