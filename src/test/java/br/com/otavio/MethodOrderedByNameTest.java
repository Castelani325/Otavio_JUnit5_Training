package br.com.otavio;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



//Por padrão, o JUnit já ordena por nome
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest {

    @Test
    //@DisplayName("Test description")
    void testA() {
        System.out.println("Testando Test A");
        //Given()
        //When()
        //Then()

    }

    @Test
    //@DisplayName("Test description")
    void testB() {
        System.out.println("Testando Test B");
        //Given()
        //When()
        //Then()

    }

    @Test
    //@DisplayName("Test description")
    void testC() {
        System.out.println("Testando Test C");
        //Given()
        //When()
        //Then()

    }

    @Test
    //@DisplayName("Test description")
    void testD() {
        System.out.println("Testando Test D");
        //Given()
        //When()
        //Then()

            }

}
