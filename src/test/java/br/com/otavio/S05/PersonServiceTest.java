package br.com.otavio.S05;

import br.com.otavio.Model.Person;
import br.com.otavio.Service.IPersonService;
import br.com.otavio.Service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    @Test
    @DisplayName("When create a Pearson with Success, should Return Person Object")
    void testCreatePerson_WhenSucess_ReturnPersonObject() {
        //Given()
        IPersonService service = new PersonService();

        Person person = new Person(
                "Keith",
                "Moon",
                "Kmoon@erudio.com.br",
                "Wmbley - Uk",
                "Male"
        );
        //When()
        service.createPearson(person);
        Person actual = service.createPearson(person);

        //Then()

        assertNotNull(actual, () -> "The createPerson should not have returned Null !");

    }

}
