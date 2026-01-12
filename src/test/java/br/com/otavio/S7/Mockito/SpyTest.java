package br.com.otavio.S7.Mockito;

import net.bytebuddy.agent.Attacher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {


    @Test
    @DisplayName("Testing Spy - V1")
    void testBDDSpyV1() {
        //Given()
        List<String> mockArrayList = spy(ArrayList.class);

        //When() + Then()

        when(mockArrayList.size()).thenReturn(5);
        //assertEquals(0, mockArrayList.size());

        mockArrayList.add("Foor-Bar");

        assertEquals(5, mockArrayList.size());
        }


        @Test
        @DisplayName("Testing Spy - V2")
        void testBDDSpyV2() {

            List<String> mockArrayList = spy(ArrayList.class);
            assertEquals(0, mockArrayList.size());

            when(mockArrayList.size()).thenReturn(5);
            assertEquals(5, mockArrayList.size());
        }


    @Test
    @DisplayName("Testing Spy - V3")
    void testBDDSpyV3() {

        List<String> mockArrayList = spy(ArrayList.class);
        mockArrayList.add("Foo-Bar");

        verify(mockArrayList).add("Foo-Bar");
        verify(mockArrayList, never()).remove(anyString());
        verify(mockArrayList, never()).clear();

    }


}
