package com.nuaa.chenguangmontior.service;

import com.nuaa.chenguangmontior.model.Program;
import com.nuaa.chenguangmontior.model.ProgramKnife;
import com.nuaa.chenguangmontior.model.Student;

import java.util.List;

public interface MonitorService {
    void test();
    Student findByid(int id);
    List<ProgramKnife> findByProgram(String program);


}
