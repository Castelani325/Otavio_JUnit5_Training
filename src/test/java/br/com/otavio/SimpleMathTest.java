package br.com.otavio;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleMathTest {

    @Test
    void testSUM() {
        //OK Testando a soma


        //Given()
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double resultSUM = math.sum(firstNumber, secondNumber); //"actual"

        //When()
        double expectedSUM = 8.2D; //"expected"


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
        double firstNumber = 4D;
        double secondNumber = 2.5D;
        double expected = 1.5D;
        //double notResult = 5D;

        //When()
        double result = math.subtraction(firstNumber, secondNumber);

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
        double firstNumber = 4D;
        double secondNumber = 2.5D;
        double expected = 10D;


        //When()
        double result = math.multiplication(firstNumber, secondNumber);


        //Then()
        String message = firstNumber + "*" + secondNumber + " Is not Producing " + expected;
        assertEquals(10D, expected, () -> message);

    }

    @Test
    void testDIV() {
        //Testando Divisão

        //Given()
        SimpleMath math =new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 2D;
        double expected = 2D;


        //When()
        double result = math.division(firstNumber, secondNumber);

        //Then()
        String message = firstNumber + "/" + secondNumber + " Is not Producing " + expected;
        assertEquals(expected, result, () -> message);

    }

    @Test
    void testMEDIA () {
        //Testando Média

        //Given()
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 2D;
        double expected = 3D;

        //When()
        double result = math.mean(firstNumber, secondNumber);


        //Then()
        String message = "(" + firstNumber + "+" + secondNumber + ")" + "/ 2 " + "->" + " Is not Producing " + expected;
        assertEquals(expected, result, () -> message);
    }

    @Test
    void testRaizQuadrada (){
        //Testando raiz quadrada

        //Given()
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 2D;
        double expected = 2D;

        //When()
        double result = math.squareRoot(firstNumber, secondNumber);


        //Then()
        String message = "The root of " + firstNumber + " Is not Producing " + expected;
        assertEquals(expected, result, ()-> message);
    }

}

