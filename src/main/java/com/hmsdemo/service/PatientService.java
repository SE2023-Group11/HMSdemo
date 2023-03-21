package com.hmsdemo.service;

import com.hmsdemo.dao.PatientDao;
import com.hmsdemo.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientDao patientDao;

    public boolean addPatient(Patient patient) {
        patientDao.addPatient(patient);
        return true;
    }
    public boolean deletePatient(Integer id) {
        patientDao.delete(id);
        return true;
    }
    public boolean updatePatient(Patient patient) {
        patientDao.update(patient);
        return true;
    }
    public Patient getbyId(Integer id) {
        return patientDao.getById(id);
    }
    public List<Patient> getAll() {
        return patientDao.getAll();
    }
}
