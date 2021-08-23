package com.example.demo.Entity;

import lombok.Data;

import java.sql.Date;
@Data
public class Task {
    String title;
    String description;
    Date deadline;
    Long teacherId;
}
