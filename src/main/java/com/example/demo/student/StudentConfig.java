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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student hermes = new Student(
                    "Hermes",
                    "hermescaretta@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 2)
            );
            Student jorge = new Student(
                    "jorge",
                    "jorge@gmail.com",
                    LocalDate.of(2004, Month.NOVEMBER, 27)
            );
            studentRepository.saveAll(List.of(hermes, jorge));
        };
    }
}
