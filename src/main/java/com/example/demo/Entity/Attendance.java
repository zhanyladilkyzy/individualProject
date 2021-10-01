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
    @Column(name = "attendance_id")
    private Long id;

    @Column(name="date")
    private Date date;

    @Column(name="student_id")
    private Long studentId;


    @Column(name="teacher_id")
    private Long teacherId;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}
