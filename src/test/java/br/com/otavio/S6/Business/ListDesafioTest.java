package br.com.otavio.S6.Business;

import br.com.otavio.Service.Stubs.CourseServiceStub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

public class ListDesafioTest {

    @Test
    @DisplayName("Testing Arrays Test - BDDmockito ")
    void testMockingList_when_GetISCalledWithArgumentMatcher_ShouldReturnMultipleValues() {

        //Given()
        List<String> list = mock(List.class); // A variavel list é do tipo List e não carrega nada específico ainda (<?>)
        ArrayList<Integer> listDeRetorno = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        CourseServiceStub course = mock(CourseServiceStub.class);
                                       // mock(List.class) -> mostra que o mock criado deve se comportar como uma List
        //When()
        given(course.CountToTen()).willReturn(listDeRetorno);

        //Then()
        assertThat(course.CountToTen(), is(listDeRetorno));



    }

}
