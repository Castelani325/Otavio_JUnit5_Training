package br.com.otavio.S03;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {


    @Test
    // @Timeout(1) 1 segundo para o Timeout
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS) //15 milisegundos para TimeOut
    @DisplayName("Testing TimeOut in Second and Miliseconds")
    void testArrays_GivenOneArray_RunthroughToTimeOut() {
        //Given()
        int[] numbers = {25, 8, 21, 32, 3};

        //When()
        for (int i = 0; i<100000000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);

        }
        //Then()

    }


    @Test
    @Disabled("Desabilitado para poder utilizar o TimeOut")
    @DisplayName("Testing Arrays comparison")
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


