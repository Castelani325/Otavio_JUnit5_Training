package br.com.otavio.S7.Mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    @DisplayName("Testing hamscrest Matchers")
    void testHamcrestMockito() {
        //Given()
        List<Integer> scores = Arrays.asList(99, 100 , 101, 105);

        //When() & Then()

//        //Cheking Intengers
//        assertThat(scores, hasSize(4));
//        assertThat(scores, hasItems(23,100,101));
//        assertThat(scores, everyItem(greaterThan(98)));
//        assertThat(scores, everyItem(lessThan(106)));


        //Cheking Strings

        assertThat("", is(emptyString()));
        assertThat(null, is(emptyOrNullString()));


        //Cheking Arrays

        Integer[] myArray = {1, 2, 3};

        assertThat(myArray, arrayWithSize(3));
        assertThat(myArray, arrayContaining(1,2,3));
        assertThat(myArray, arrayContainingInAnyOrder(2,3, 1));

    }

}
