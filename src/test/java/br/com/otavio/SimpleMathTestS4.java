package br.com.otavio;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTestS4 {


    SimpleMath math;

    @BeforeAll
    static void setup() {
        //System.out.println("Executando o @BeforeAll");
    }

    @AfterAll
    static void cleanup() {
        // System.out.println("Executando o @AfterAll");
    }

    @BeforeEach
    void beforeeach() {

        math = new SimpleMath();
        // System.out.println("Executando o @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        // System.out.println("Executando o @AfterEach");
    }


    @ParameterizedTest
    @DisplayName("Testing division with double numbers")
    //@MethodSource() //viria o nome da função static no () se tivesse um nome diferente da função teste

    @CsvSource ({
            "6.2,2,3.1",
            "71, 14, 5.07",
            "18.3, 3.1, 5.90"
    })
    void testDIV_GivenTwoNumbers_ReturnsCorrectDIV(double firstNumber, double secondNumber, double expected) {

        //Testando Divisão

        //Given()
        //O given está nos parâmetros da função

        //When()
        double result = math.division(firstNumber, secondNumber);

        //Then()
        String message = firstNumber + "/" + secondNumber + " Is not Producing " + expected;
        assertEquals(expected, result, 2D, () -> message); // O 2D nos parâmetros determina o limite de casas decimais por output

    }


    //public static Stream<Arguments> testDivisionInputParameters() {
//    public static Stream<Arguments> testDIV_GivenTwoNumbers_ReturnsCorrectDIV() {
//        return Stream.of(
//                Arguments.of (6.2D,2D,3.1D),
//                Arguments.of (71D, 14D, 5.07D),
//                Arguments.of (18.3D, 3.1D, 5.90D)
//
//                );
//    }

}






