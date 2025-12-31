package br.com.otavio;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//Por padrão, o JUnit já ordena por nome
@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    @Test
    @Order(2)
    //@DisplayName("Test description")
    void testA() {
        System.out.println("Testando Test A");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(1)
    //@DisplayName("Test description")
    void testB() {
        System.out.println("Testando Test B");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(4)
    //@DisplayName("Test description")
    void testC() {
        System.out.println("Testando Test C");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(3)
    //@DisplayName("Test description")
    void testD() {
        System.out.println("Testando Test D");
        //Given()
        //When()
        //Then()

            }

}
