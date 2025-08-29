package com.example.config;



import com.example.entity.*;
import com.example.repo.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;
    private final EnrollmentRepository enrollmentRepo;

    public DataLoader(StudentRepository studentRepo, CourseRepository courseRepo, EnrollmentRepository enrollmentRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
        this.enrollmentRepo = enrollmentRepo;
    }

    @Override
    public void run(String... args) {
        Student s1 = new Student(1L, "Alice");
        Student s2 = new Student(2L, "Bob");
        studentRepo.save(s1);
        studentRepo.save(s2);

        Course c1 = new Course(100L, "Math");
        Course c2 = new Course(200L, "Science");
        courseRepo.save(c1);
        courseRepo.save(c2);

        enrollmentRepo.save(new Enrollment(new EnrollmentId(1L, 100L), s1, c1, "A"));
        enrollmentRepo.save(new Enrollment(new EnrollmentId(2L, 200L), s2, c2, "B"));
    }
}
