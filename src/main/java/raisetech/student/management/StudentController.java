package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
  @Autowired
  private StudentRepository repository;

  @GetMapping("studentList")
  public List<Student> getStudentList(){
    return repository.search();

  }

  @GetMapping("student-courses")
  public List<StudentCourse> getStudentCoursesList() {
    return repository.searchCourses();
  }

}
