package com.ak.jdbcexample;

import com.ak.jdbcexample.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ak.jdbcexample.repository.StudentRepository;

import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);

        Student student =context.getBean(Student.class);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        student.setAge(22);
        student.setId(20);
        student.setName("AK");

        studentRepository.addStudent(student);

        List<Student> students = studentRepository.findAll();
        System.out.println("student"+ students);

    }

}
