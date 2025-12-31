package br.com.otavio;

import org.junit.jupiter.api.*;


//Por padrão, o JUnit já ordena por nome
//@Order(1)

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {

    StringBuilder stringBuilder = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println("The actual value is : " + stringBuilder);
    }


    @Test
    @Order(2)
    //@DisplayName("Test description")
    void testA() {
        System.out.println("Testando Test A");
        stringBuilder.append("2");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(1)
    //@DisplayName("Test description")
    void testB() {
        System.out.println("Testando Test B");
        stringBuilder.append("1");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(4)
    //@DisplayName("Test description")
    void testC() {
        System.out.println("Testando Test C");
        stringBuilder.append("4");
        //Given()
        //When()
        //Then()

    }

    @Test
    @Order(3)
    //@DisplayName("Test description")
    void testD() {

        System.out.println("Testando Test D");
        stringBuilder.append("3");
        //Given()
        //When()
        //Then()

            }

}
