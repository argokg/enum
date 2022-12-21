import models.Course;
import models.Degree;
import models.Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Course.values()));
        System.out.println(Arrays.toString(Payment.values()));
        System.out.println(Arrays.toString(Degree.values()));

        System.out.println(Degree.INTERN.name());

        System.out.println(Payment.HALFPAYED.ordinal());



        Person student = new Student("DavidBekham", 20, "male", Payment.PAYED, Course.JAVA);
        Person student1 = new Student("Ronaldo", 30, "male", Payment.HALFPAYED, Course.PYTHON);
        Person student2 = new Student("Messi", 40, "male", Payment.NOTPAYED, Course.FLUTTER);

        Person[] students = new Person[]{student, student1, student2};
        for (Person a:students) {
            System.out.println(a);
            System.out.println("--------------------");
        }

        Person mentor = new Mentor("Anna Annov", 25, "female", Course.PYTHON, Degree.MIDDLE);
        Person mentor1 = new Mentor("Eminem Eminemov", 24, "male", Course.JAVA, Degree.INTERN);
        Person mentor2 = new Mentor("Monika Monikova", 23, "female", Course.JAVASCRIPT, Degree.SENIOR);

        Person[] mentors = new Person[]{mentor, mentor1, mentor2};
        for (Person b:mentors) {
            System.out.println(b);
            System.out.println("-----------------------");
        }

    }
}