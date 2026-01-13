package br.com.otavio.S7.Mockito;

import br.com.otavio.Model.MyUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUtilsTest {



    @Test
    @DisplayName("Testin Static methods + Params")
    void testStaticMethodes_With_Params() {

        try(MockedStatic<MyUtils> mockedStatic = mockStatic(MyUtils.class)) {

            mockedStatic.when(
                    ()-> MyUtils.getWelcomeMessage(eq("Erudio"),
                            anyBoolean())).thenReturn("Howdy Erudio !");

            String result = MyUtils.getWelcomeMessage("Erudio", false);
            assertEquals("Howdy Erudio !", result);

        }

    }

}
