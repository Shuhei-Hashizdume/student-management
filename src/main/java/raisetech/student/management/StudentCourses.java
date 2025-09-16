package raisetech.student.management;


import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentCourses {
  private int id;
  private String studentId;
  private String courseName;
  private Timestamp startDate;
  private Timestamp endDate;

}
