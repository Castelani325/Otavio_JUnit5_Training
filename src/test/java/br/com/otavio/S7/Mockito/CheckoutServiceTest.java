package br.com.otavio.S7.Mockito;

import br.com.otavio.Model.MyUtils;
import br.com.otavio.Model.PaymentProcessor;
import br.com.otavio.Service.CheckoutService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


//Codigo importado da aula

public class CheckoutServiceTest {

    @Test
    void testMockObjectConstruction() {

        //Given
        try(MockedConstruction<PaymentProcessor> mocked =
                    mockConstruction(PaymentProcessor.class,
                            (mock, context) ->
                            {
                                when(mock.chargeCustomer(
                                        anyString(),
                                        any(BigDecimal.class))).thenReturn(BigDecimal.TEN);
                            }))
        {

            CheckoutService service = new CheckoutService();

            //When
            BigDecimal result = service.purchaseProduct("MacBook Pro", "42");

            //Then
            assertEquals(BigDecimal.TEN, result);
            assertEquals(1, mocked.constructed().size());
        }
    }
}