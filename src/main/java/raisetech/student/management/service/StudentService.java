package raisetech.student.management.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentCourse;
import raisetech.student.management.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList(){
    // 検索処理
    List<Student> students = repository.search();
    return students.stream()
        .filter(student -> {
          int age =student.getAge();
          return age >= 30 ;
        })
        .collect(Collectors.toList());


  }

  public List<StudentCourse> searchStudentCoursesList() {
    List<StudentCourse> courses = repository.searchCourses();
    return courses.stream()
        .filter(course ->"JAVA入門".equals(course.getCourseName()))
        .collect(Collectors.toList());

  }


}
