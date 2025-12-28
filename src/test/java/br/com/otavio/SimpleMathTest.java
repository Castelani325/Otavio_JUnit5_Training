package br.com.otavio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleMathTest {

    @Test
    void testSUM() {
        //OK Testando a soma


        //Given()
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double resultSUM = math.sum(firstNumber, secondNumber); //"actual"

        //When()
        Double expectedSUM = 8.2D; //"expected"


        //Then()
        String messageSUM = firstNumber + "+" + secondNumber + " Did not produce " + resultSUM;
        assertEquals(expectedSUM, resultSUM, () -> messageSUM); //primeiro parametro : o resultado objetivo; segundo parametro : a variável que deve carregar esse valor
        //assertEquals(expected, actual)
        //assertNotEquals(9.2D, resultSUM);
        //assertNotNull(resultSUM);

    }

    @Test
    void testSUB() {

        //OK Testando Subtraction

        //Given()
        SimpleMath math = new SimpleMath();
        Double firstNumber = 4D;
        Double secondNumber = 2.5D;
        Double expected = 1.5D;
        //Double notResult = 5D;

        //When()
        Double result = math.subtraction(firstNumber, secondNumber);

        //Then()
        String message = firstNumber + "-" + secondNumber + " Does not produce " + expected;
        assertEquals(1.5D, result, () -> message);
        //assertNotEquals(notResult ,result);
        //assertNotNull(result);

    }


    @Test
    void testMULTI() {
        // Testando Multiplicação

        //Given()
        SimpleMath math = new SimpleMath();
        Double firstNumber = 4D;
        Double secondNumber = 2.5D;
        Double expected = 10D;


        //When()
        Double result = math.multiplication(firstNumber, secondNumber);


        //Then()
        String message = firstNumber + "*" + secondNumber + " Is not Producing " + expected;
        assertEquals(10D, expected, () -> message);

    }

    @Test
    void testDIV() {
        //Testando Divisão

        //Given()
        SimpleMath math =new SimpleMath();
        Double firstNumber = 4D;
        Double secondNumber = 2D;
        Double expected = 2D;


        //When()
        Double result = math.division(firstNumber, secondNumber);

        //Then()
        String message = firstNumber + "/" + secondNumber + " Is not Producing " + expected;
        assertEquals(expected, result, ()->message);




    }


}

