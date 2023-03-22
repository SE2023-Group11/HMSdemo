package com.hmsdemo.dao;

import com.hmsdemo.pojo.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PatientDaoTest {
    @Autowired
    private PatientDao patientDao;
    @Test
    public void patientDaoTest(){
        Patient patient = patientDao.getById(1);
        System.out.println(patient);
    }
}
