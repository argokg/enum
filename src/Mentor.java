import models.Course;
import models.Degree;
import models.Payment;

public class Mentor extends Person{


    public Mentor(String fio, int age, String gender, Course course, Degree degree) {
        super(fio, age, gender, course, degree);
    }
}
