import models.Course;
import models.Degree;
import models.Payment;

public class Student extends Person{


    public Student(String fio, int age, String gender, Payment pl, Course course) {
        super(fio, age, gender, pl, course);
    }
}
