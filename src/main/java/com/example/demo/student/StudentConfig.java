package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student david = new Student(
                    "David",
                    LocalDate.of(1990, Month.JANUARY, 10),
                    "david.chan@abc.com"
            );
            Student alex = new Student(
                    "alex",
                    LocalDate.of(1991, Month.FEBRUARY, 21),
                    "Alex.chan@abc.com"
            );

            studentRepository.saveAll(List.of(david, alex));

        };
    }
}
