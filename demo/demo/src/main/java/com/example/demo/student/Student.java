package com.example.demo.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table
//@AllArgsConstructor
public class Student {

    public Student(){}

    public Student(String text){
        this.text = text;
    }

    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Long id;
    private String text;
}
