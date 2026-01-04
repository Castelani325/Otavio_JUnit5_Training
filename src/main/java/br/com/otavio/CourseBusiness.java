package br.com.otavio;


import br.com.otavio.Service.CourseService;

import java.util.ArrayList;
import java.util.List;

//courseBusiness = System(Methode) Under Test / SUT
public class CourseBusiness {

    //CouseService é a nossa dependency
    private CourseService service;

    public CourseBusiness(CourseService service) {
        this.service = service;
    }

    public List<String> retriveCourseRelatedToSpring(String student) {

        var filteredCourses = new ArrayList<String>();
        var allCourses = service.retriveCourses(student);

        if ("Gustavo".equals(student)) return filteredCourses;

        for (String course : allCourses) {
            if (course.contains("Spring")){
                filteredCourses.add(course);
                System.out.println( "Computado : "+ course);
            }
            else {
                System.out.println("Este curso não é de Spring");}
        }

        return filteredCourses;
    };


}
