package br.com.otavio.Service;

import br.com.otavio.Model.Person;

public class PersonService implements IPersonService {

    @Override
    public Person createPearson(Person person) {

        return new Person();
    }
}
