/*
    * StudentProfile.java
    * Created on Jul 1st 2020
    * @author: Hozaifa Owaisi <ggk4b00m@gmail.com>
 */

import com.fasterxml.jackson.annotation.JsonGetter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class School {

    List<Student> students =  new ArrayList<Student>();

    public School(List<Student> students) {
        this.students = students;
    }
    public School(){}

    public int numberOfStudentsInSchool(){
        return students.size();
    }

    @JsonGetter("Students")
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}