package com.example.demo.Entity;

import lombok.Data;

import java.sql.Date;
@Data
public class Grade {
    char code;
    double value;
    Long taskId;
    Long teacherId;
    Long studentId;
    String comment;
    Date date;
}