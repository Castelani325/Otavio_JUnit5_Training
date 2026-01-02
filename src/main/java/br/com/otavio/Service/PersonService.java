package br.com.otavio.Service;

import br.com.otavio.Model.Person;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {

    @Override
    public Person createPearson(Person person) {

        if (person.getEmail() == null || person.getEmail().isBlank()){
            throw new IllegalArgumentException("Person's email is null or empty");

        }
        var id = new AtomicLong().incrementAndGet();
        person.setId(id);
        return person;
    }
}
