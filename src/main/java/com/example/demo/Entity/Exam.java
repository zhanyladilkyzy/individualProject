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
public class Exam {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="course_id")
    private Long courseId;


    @Column(name="exam_date")
    private Date date;

    @Column(name="access")
    private Boolean isAccessible;

}
