package br.com.otavio.S7.Mockito;

import br.com.otavio.Model.Order;
import br.com.otavio.Service.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

public class OrderServiceTest {

    OrderService service = new OrderService();
    UUID defaultUuid = UUID.fromString("bc3d27a2-cd80-43da-8423-46db11c65a9f");
    private final LocalDateTime defaultLocalDateTime = LocalDateTime.of(2026, 12, 1 , 20, 17);

    @Test
    @DisplayName("Test Should Include OrderId When no Order Exists")
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
    @DisplayName("Test Should Include Current TIme When Create a New Order")
    void testShouldIncludeCurrenteTime_When_CreateANewOrder() {

        //Giver()
        try (MockedStatic<LocalDateTime> mockedLocalDateTime = mockStatic(LocalDateTime.class)) {
            mockedLocalDateTime.when(LocalDateTime::now).thenReturn(defaultLocalDateTime);

            //When()
            Order result = service.createOrder("Macbook", 2L, null);

            //Then()
            assertEquals(defaultLocalDateTime.toString(), result.getCreationDate().toLocalDate());

        }

        }
}
