package br.com.otavio.S7.Mockito;

import br.com.otavio.Model.Order;
import br.com.otavio.Service.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

public class OrderServiceTest {

    OrderService service = new OrderService();
    UUID defaultUuid = UUID.fromString("bc3d27a2-cd80-43da-8423-46db11c65a9f");

    @Test
    @DisplayName("Test Should Include Random OrderID When No Order Id Exists")
    void testShouldIncludeRandomOrderID_When_NoOrderIdExist() {

        //Given()

        try (MockedStatic<UUID> mockedUuid = mockStatic(UUID.class)) {
            mockedUuid.when(UUID::randomUUID).thenReturn(defaultUuid);

            //When()
            Order result = service.createOrder("Macbook", 2L, null);

            //Then()
            assertEquals(defaultUuid.toString(), result.getId());

        }
    }


    //Mockar o LocalDateTime
    @Test
    @DisplayName("Testing Mocking LocalDAteTIme")
    void testBDD_GivenXXX_ReturnsYYY() {
        //Given()
        //When()
        //Then()

        }
}
