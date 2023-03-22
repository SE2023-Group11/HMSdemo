package com.hmsdemo.controller;

import com.hmsdemo.pojo.Patient;
import com.hmsdemo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/addPatient")
    public boolean addPatient(Patient patient) {
        System.out.println("add ...");
        System.out.println(patient);
        return patientService.addPatient(patient);
    }
    @GetMapping("/showPatient")
    public String showPatient(Integer pid) {
        System.out.println("show ...");
        Patient patient = patientService.getbyId(pid);
        System.out.println(patient.getPname());
        return patient.getPname();
    }
}
