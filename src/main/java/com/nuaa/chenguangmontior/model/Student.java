package com.nuaa.chenguangmontior.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "test")
public class Student {
    @Id
    private int id;
    private String name;
}
