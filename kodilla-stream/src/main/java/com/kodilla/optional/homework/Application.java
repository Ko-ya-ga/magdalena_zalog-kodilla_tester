package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Giovanni Mereno");
        Teacher t2 = new Teacher("John McWolley");
        Teacher t3 = null;
        Teacher t4 = new Teacher("Maciej Kosa");
        Teacher t5 = null;

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Francesca Piasca", t1);
        Student s2 = new Student("Jacob Towler", t2);
        Student s3 = new Student("Anthony Potter", t3);
        Student s4 = new Student("Barbara Kos", t4);
        Student s5 = new Student("Antoinette Brigard", t5);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        for (Student student : students)
            System.out.println(student.getName() + Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>")));
    }
}