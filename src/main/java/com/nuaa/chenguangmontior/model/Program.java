package com.nuaa.chenguangmontior.model;

import lombok.Data;

import java.util.List;

@Data
public class Program {
    private String program;
    private List<ProgramKnife> list ;
}
