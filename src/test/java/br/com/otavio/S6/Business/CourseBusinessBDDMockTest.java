package br.com.otavio.S6.Business;


import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import br.com.otavio.CourseBusiness;
import br.com.otavio.Service.CourseService;

public class CourseBusinessBDDMockTest {

    CourseService mockService ; //= mock(CourseService.class);
    CourseBusiness business;
    List<String> courses;

    @BeforeEach
    void setup(){

        //Given()
        mockService = mock(CourseService.class);
        business = new CourseBusiness(mockService);
        courses = Arrays.asList(
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

    @Test
    @DisplayName("Testing Course Business")
    void testCoursesRelatedToSpring_When_UsingMock() {
        //Give(@BeforeEach)

        given(mockService.retriveCourses("Leandro")).willReturn(courses);

        //When()
        var filteredCourses = business.retriveCourseRelatedToSpring("Leandro");


        //Then()
        assertEquals(4, filteredCourses.size());
        //assertThat(filteredCourses.size(), is(4));
    }

    @Test
    @DisplayName("Delete Courses Not Related to Spring Using Mockito should call Method")
    void testDeletedCoursesNotRelatedToSpring_UsingMockitoVerify_ShouldCallMethodDeleteCourse() {
    
        // Given
        // setup no @BeforeEach
        given(mockService.retriveCourses("Leandro")).willReturn(courses);
        String courseTest = "Docker do Zero à Maestria - Contêinerização Desmistificada"; //testando com tudo minusculo


        // When
        business.deleteCoursesNotRelatedToString("Leandro");
        business.deleteCoursesNotRelatedToString("Leandro"); //Para que o times() funcione, era necessário replicar a chamda do método em 2 vezes

        
    
        // Then
        if (!courseTest.contains("Spring")) {
            System.out.println("O curso Não contem 'Spring'".toUpperCase());
            //verify(mockService, times(2)).deleteCourse(courseTest); //Should work - Verifica se foi chamado exatas duas vezes
            verify(mockService, atLeast(1)).deleteCourse(courseTest); //Should work - Verifica se foi chamado ao menos uma vez
           //verify(mockService, atLeasOnce()).deleteCourse(courseTest); //Should work - Verifica se foi chamado ao menos uma vez
            }

        else {
            System.out.println("O curso contem 'Spring'".toUpperCase());
            verify(mockService, never()).deleteCourse(courseTest); //Should work - Verifica se nunca foi chamado
            
            }


}



//V2
    @Test
    @DisplayName("Delete Courses Not Related to Spring Using Mockito should call Method")
    void testDeletedCoursesNotRelatedToSpring_UsingMockitoVerify_ShouldCallMethodDeleteCourseV2() {
    
        // Given
        // setup no @BeforeEach
        given(mockService.retriveCourses("Leandro")).willReturn(courses);
        String courseTest = "Docker do Zero à Maestria - Contêinerização Desmistificada"; //testando com tudo minusculo

        // When
        business.deleteCoursesNotRelatedToString("Leandro");
             
  
        // Then
        if (!courseTest.contains("Spring")) {
            System.out.println("O curso Não contem 'Spring'".toUpperCase());
            BDDMockito.then(mockService).should().deleteCourse(courseTest); //Should work - Verifica se foi chamado ao menos uma vez
            }

        else {
            System.out.println("O curso contem 'Spring'".toUpperCase());
            BDDMockito.then(mockService).should(never()).deleteCourse(courseTest); //Should work - Verifica se nunca foi chamado
            
            }


}

//V2
    @Test
    @DisplayName("Testing Delete using Carpture Arguments")
    void testDeletedCoursesNotRelatedToSpring_CapturingArguments_ShouldCallMethodDeleteCourse() {
    
        // Given
        // setup no @BeforeEach

        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello");

        given(mockService.retriveCourses("Leandro")).willReturn(courses);
        String agileCourse = "Agile Desmistificado com Scrum, XP, Kanban e Trello"; //testando com tudo minusculo

        ArgumentCaptor<String> argumentCapture = ArgumentCaptor.forClass(String.class);


        
        // When
        business.deleteCoursesNotRelatedToString("Leandro");
             
  
        // Then
        
            System.out.println("O curso Não contem 'Spring'".toUpperCase());
            BDDMockito.then(mockService).should().deleteCourse(argumentCapture.capture()); //Should work - Verifica se foi chamado ao menos uma vez

            assertEquals(argumentCapture.getValue(), is(agileCourse));
            
}




}
