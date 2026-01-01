package br.com.otavio.S04;

import br.com.otavio.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math in SimpleMath Operations")
public class DemoRepeatedTest {

    SimpleMath math;


    @BeforeEach
    void beforeeach() {

        math = new SimpleMath();
        System.out.println("Executando o @BeforeEach");
    }


    //@RepeatedTest(3) -> Repetindo o teste 3 vezes
    @RepeatedTest(value = 3, name = "{DisplayName}. Repetition" + "{currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division by zero")
    void testDivision_GivenOneNumberAndZero_ShouldThrowArithmeticException(

            RepetitionInfo repetitionInfo, TestInfo testInfo
    ) {

        System.out.println("Repetition Nº : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running : " + testInfo.getTestMethod().get().getName());

        //Given()
        double firstNumber = 6D;
        double secondNumber = 0D;
        String expectedMessage = "Impossivel dividir por zero !";

        //When() && Then()
        ArithmeticException actual = assertThrows(ArithmeticException.class, ()->
            {
                math.division(firstNumber, secondNumber);
                    });

    }





}




