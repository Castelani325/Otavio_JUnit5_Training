package br.com.otavio.S6.Business;


import br.com.otavio.CourseBusiness;
import br.com.otavio.Service.CourseService;
import br.com.otavio.Service.Stubs.CourseServiceStub;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class CourseBusinessMockTest {

    CourseService mockService;
    CourseBusiness business;
    List<String> courses;

    @BeforeEach
    void setup(){

        //Given()
        mockService = mock(CourseService.class);
        business = new CourseBusiness(mockService);
        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado comq Scrum, XP, Kanban e Trello",
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

    @Test
    @DisplayName("Testing Course Business")
    void testCoursesRelatedToSpring_When_UsingMock() {
        //Give(@BeforeEach)

        when(mockService.retriveCourses("Leandro")).thenReturn(courses);

        //When()
        var filteredCourses = business.retriveCourseRelatedToSpring("Leandro");


        //Then()
        assertEquals(4, filteredCourses.size());
    }



}
