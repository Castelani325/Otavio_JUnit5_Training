package br.com.otavio.S05;

import br.com.otavio.Model.Person;
import br.com.otavio.Service.IPersonService;
import br.com.otavio.Service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    IPersonService service;
    Person person;

    @BeforeEach
    void setup(){
        service = new PersonService();
       person = new Person (
       "Keith",
        "Moon",
        "Kmoon@erudio.com.br",
        "Wembley - Uk",
        "Male");
    }

    @Test
    @DisplayName("When create a Pearson with Success, should Return Person Object")
    void testCreatePerson_WhenSucess_ReturnPersonObject() {
        //Given()

        //When()
        Person actual = service.createPearson(person);

        //Then()
        assertNotNull(actual, () -> "The createPerson should not have returned Null !");

    }


    @Test
    @DisplayName("When create a Pearson with Success, should contains FirstName in Returned Person Object")
    void testCreatePerson_WhenSucess_ShouldContainsAllAtributesInReturnPersonObject() {
        //Given()

        //When()
        Person actual = service.createPearson(person);

        //Then()

        assertNotNull(person.getId(), ()-> "Person ID is missing");

        assertEquals(person.getId(), actual.getId(), ()->"Should Return ID");
        assertEquals(person.getFirstName(), actual.getFirstName(), ()->"Should Return First Name");
        assertEquals(person.getLastName(), actual.getLastName(), ()->"Should Return Last Name");
        assertEquals(person.getEmail(), actual.getEmail(), ()->"Should Return Email" );
        assertEquals(person.getAdress(), actual.getAdress(), ()->"Should Return Adress");
        assertEquals(person.getGender(), actual.getGender(), ()->"Should Return Gender");

    }

        @Test
        @DisplayName("When create a person with Null email should throw exception")
        void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentException() {
            //Given()
            person.setEmail(null) ;
            var expectedMessage = "Person's email is null or empty";

            //When()/Then()

            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> service.createPearson(person), ()->"Empty Email should cause an illegal argument exception !");
            assertEquals(expectedMessage, exception.getMessage(), ()-> "Exceptions should be equal." );
        }

}
