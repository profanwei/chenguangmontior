package com.nuaa.chenguangmontior.dao;
import com.nuaa.chenguangmontior.model.Program;
import com.nuaa.chenguangmontior.model.ProgramKnife;
import com.nuaa.chenguangmontior.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Properties;

@Mapper
public interface MonitorDao {
    Student findById(int id);
    List<ProgramKnife> findByProgram(String program);
}
