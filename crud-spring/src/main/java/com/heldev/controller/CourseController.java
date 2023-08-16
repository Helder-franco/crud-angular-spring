package com.heldev.controller;

import com.heldev.model.Course;
import com.heldev.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

}

