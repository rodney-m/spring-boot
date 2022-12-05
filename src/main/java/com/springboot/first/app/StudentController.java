package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student ")
    public Student getStudent(){
        return new Student("Rodney", "Mupanduki");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rodney", "Mupanduki"));
        students.add(new Student("Keith", "Charedzera"));
        students.add(new Student("Lionnel", "Tsuro"));
        students.add(new Student("Tafadzwa", "Pundo"));
        students.add(new Student("Shelton", "Shamhuyarira"));
        return students;
    }

    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    // build a rest api to handle query parameters
    //http:localhost:8080/student?firstName=Rodney&lastName=Mupanduki

    @GetMapping("/student/query ")
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName){
        return new Student(firstName, lastName);
    }

}
