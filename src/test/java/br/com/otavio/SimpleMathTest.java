package br.com.otavio;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math in SimpleMath Operations")
public class SimpleMathTest {

    @BeforeAll
    static void setup() {
        System.out.println("Executando o @BeforeAll");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executando o @AfterAll");
    }

    @BeforeEach
    void beforeeach() {
        System.out.println("Executando o @BeforeEach");
    }

    @AfterEach
    void afterEach () {
        System.out.println("Executando o @AfterEach");
    }



    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSUM_GivenTwoNumbers_ReturnsCorrectSUM() {
        System.out.println("Test SUM");

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
    @DisplayName("Test 4 - 2.5 = 1.5")
    void testSUB_GivenTwoNumbers_ReturnsCorrectSUB() {
        System.out.println("Test SUB");
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
        String message =
                firstNumber + "-" + secondNumber +
                        " Does not produce " + expected;
        assertEquals(1.5D, result, () -> message);
        //assertNotEquals(notResult ,result);
        //assertNotNull(result);

    }


    @Test
    @DisplayName("Test 4*2.5 = 10")
    void testMULTI_GivenTwoNumbers_ReturnsCorrectMULTI() {
        System.out.println("Test MULTI");
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
    @DisplayName("Test 4/2 = 2")
    void testDIV_GivenTwoNumbers_ReturnsCorrectDIV() {
        System.out.println("Test DIV");
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
    @DisplayName("Test (4+2)/2 = 3")
    void testMEDIA_GivenTwoNumbers_ReturnsCorrectAVG () {
        System.out.println("Test AVG");
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
    @DisplayName("Test 4^-2 = 2")
    @Disabled("Teste ainda em desenvolvimento !")
    void testRaizQuadrada_GivenTwoNumbers_ReturnsCorrectSqrRoot (){
        System.out.println("Test SQR ROOT");

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




