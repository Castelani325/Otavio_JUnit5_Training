package br.com.otavio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleMathTest {

    @Test
    void test() {

        //Testando a soma
        SimpleMath math = new SimpleMath();

        Double firstNumber = 6.2D;
        Double secondNumber = 2D;



        Double resultSUM = math.sum(firstNumber, secondNumber); //"actual"
        Double expectedSUM = 8.2D; //"expected"

        String messageSUM = firstNumber + "+" + secondNumber + " Did not produce " + resultSUM;

        assertEquals(expectedSUM, resultSUM, () -> messageSUM); //primeiro parametro : o resultado objetivo; segundo parametro : a variável que deve carregar esse valor
        //assertEquals(expected, actual)
        //assertNotEquals(9.2D, resultSUM);
        //assertNotNull(resultSUM);

    }

    @Test
    void test2(){

        assertTrue(true);
        //Testando Subtraction


    }

}
