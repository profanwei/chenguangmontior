package com.nuaa.chenguangmontior.service;


import com.nuaa.chenguangmontior.dao.MonitorDao;
import com.nuaa.chenguangmontior.model.Program;
import com.nuaa.chenguangmontior.model.ProgramKnife;
import com.nuaa.chenguangmontior.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    private MonitorDao monitorDao;

    @Override
    public void test() {
        Student student = new Student();
        student.setId(1);
        student.setName("范伟");

    }

    @Override
    public Student findByid(int id) {
        return monitorDao.findById(id);
    }

    @Override
    public List<ProgramKnife> findByProgram(String program) {
        return monitorDao.findByProgram(program);
    }
}
