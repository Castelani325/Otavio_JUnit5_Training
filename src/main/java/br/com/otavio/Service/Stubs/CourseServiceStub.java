package br.com.otavio.Service.Stubs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.otavio.Service.CourseService;

public class CourseServiceStub implements CourseService {

    public List<String> retriveCourses(String student) {
        return Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
    }


    //Caso haja a inclusão de um metodo desse, cada stub deve receber esses métodos, mesmo que não seja utilizado.
    //Isso gera muito retrabalho.
    public ArrayList<Integer> CountToTen () {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i>=10 ; i++) {
            lista.add(i);
            System.out.println(i + "...");
        }
        System.out.println(lista);


        return lista;
    };

    public void deleteCourse (String student) {};
}
