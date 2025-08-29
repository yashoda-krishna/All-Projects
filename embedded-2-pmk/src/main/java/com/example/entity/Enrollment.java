package com.example.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Enrollment {

    @EmbeddedId
    private EnrollmentId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId", insertable = false, updatable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId", insertable = false, updatable = false)
    private Course course;

    private String grade;

    public Enrollment() {}

    public Enrollment(EnrollmentId id, Student student, Course course, String grade) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public EnrollmentId getId() { return id; }
    public void setId(EnrollmentId id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
