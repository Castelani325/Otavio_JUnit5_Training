package br.com.otavio.S6.Business;


import br.com.otavio.CourseBusiness;
import br.com.otavio.Service.CourseService;
import br.com.otavio.Service.Stubs.CourseServiceStub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseBusinessTest {

    @Test
    @DisplayName("Testing Course Business")
    void testCoursesRelatedToSpring_When_UsingStub() {
        //Given()
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);


        //When()
        var filteredCourses = business.retriveCourseRelatedToSpring("Leandro");


        //Then()
        assertEquals(4, filteredCourses.size());
    }

    @Test
    @DisplayName("Test description")
    void testCourseRelatedToSpring_When_UsingGustavoStudent() {
        //Given()
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);


        //When()
        var filteredCourses = business.retriveCourseRelatedToSpring("Gustavo");


        //Then()
        assertEquals(0, filteredCourses.size());
    }

}
