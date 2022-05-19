package dsa_java.newfeature.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    int marks;
    String name;
    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Student[] students = {
                new Student(92, "Gyana"),
                new Student(85, "Lipun"),
                new Student(70, "Nishita")
        };


        Predicate<Student> p = s-> s.marks > 80;

        Function<Student, String> distinctFun = s-> {
          String grade = "" ;
            if(s.marks > 90) return grade="A[Distinction]";
            if(s.marks > 80) return grade="B[Distinction]";
            if(s.marks > 60) return grade="C[Distinction]";
          return grade;
        };

        Consumer<Student> con = s-> {
            System.out.print (s.name + " " + s.marks + " ");
            System.out.println(distinctFun.apply(s));
        };

        for(Student s: students) {
            if(p.test(s)) {
                con.accept(s);
            }
        }

    }
}
