package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student st1 = new Student("All right broo1");
            Student st2 = new Student("All right broo2");

            repository.saveAll(
                    List.of(st1,st2)
            );
        };
    }

}
