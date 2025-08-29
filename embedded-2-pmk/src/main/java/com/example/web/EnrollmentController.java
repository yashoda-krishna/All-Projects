package com.example.web;

import com.example.entity.Enrollment;
import com.example.entity.EnrollmentId;
import com.example.repo.EnrollmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentController(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @GetMapping
    public List<Enrollment> getAll() {
        return enrollmentRepository.findAll();
    }

    @GetMapping("/{studentId}/{courseId}")
    public Enrollment getOne(@PathVariable Long studentId, @PathVariable Long courseId) {
        return enrollmentRepository.findById(new EnrollmentId(studentId, courseId))
                .orElseThrow(() -> new RuntimeException("Enrollment not found"));
    }

    @GetMapping("/by-student/{studentId}")
    public List<Enrollment> getByStudent(@PathVariable Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }

    @GetMapping("/by-course/{courseId}")
    public List<Enrollment> getByCourse(@PathVariable Long courseId) {
        return enrollmentRepository.findByCourseId(courseId);
    }
}
