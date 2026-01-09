package br.com.otavio.S6.Business;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    @DisplayName("Testing Arrays Test")
    void testMockingLqist_when_GetISCalledWithArgumentMatcher_ShouldReturnMultipleValues() {
        //Given()
        List<?> list = mock(List.class);

        //When()
        //when(list.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        //when(list.get(0)).thenReturn("Otavio");
        when(list.get(anyInt())).thenReturn("Otavio");

        //Then()

        assertEquals("Otavio",
                list.get(7),
                () -> "O indice da lista não aponta para a string definida");
        //assertEquals(10, list.size());
        //assertEquals(20, list.size());
        //assertEquals(30, list.size());

    }

}
