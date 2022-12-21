import models.Course;
import models.Degree;
import models.Payment;

public abstract class Person {

    public String fio;
    public int age;
    public String gender;
    private Payment pl;
    private Course course;
    private Degree degree;





    public Person(String fio, int age, String gender, Payment pl, Course course, Degree degree) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.pl = pl;
        this.course=course;
        this.degree=degree;

    }

    public Person(String fio, int age, String gender, Payment pl, Course course) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.pl = pl;
        this.course = course;
    }

    public Person(String fio, int age, String gender, Course course, Degree degree) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Name and Surname: " + fio +
                "\nAge: " + age +
                "\nGender: " + gender+
                "\nPayment: " + pl +
                "\nCourse: "+ course+
                "\nDegree: "+degree;
    }
}
