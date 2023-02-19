package com.said.springboot.learnjpaandhibernate.course;

import com.said.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJpaRepository repository;
    //@Autowired
    //private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "learn AWS Jpa", "in28minutes"));
        repository.save(new Course(2, "learn Azure Jpa", "in28minutes"));
        repository.save(new Course(3, "learn DevOps Jpa", "in28minutes"));
        repository.deleteById(1L);
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("learn Azure Jpa"));
    }
}
