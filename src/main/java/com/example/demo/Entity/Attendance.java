package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="course_id")
    private Date date;

    @Column(name="student_id")
    private Long studentId;


    @Column(name="teacher_id")
    private Long teacherId;


    @Column(name="course_id")
    private Long courseId;
}
