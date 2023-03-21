package com.hmsdemo.controller;

import com.hmsdemo.pojo.Patient;
import com.hmsdemo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/addPatient")
    public boolean addPatient(@PathVariable Patient patient) {
        System.out.println("add ...");
        return patientService.addPatient(patient);
    }
    @GetMapping("/showPatient")
    public String showPatient(@PathVariable Integer pid) {
        System.out.println("show ...");
        Patient patient = patientService.getbyId(pid);
        return patient.getPname();
    }
}
