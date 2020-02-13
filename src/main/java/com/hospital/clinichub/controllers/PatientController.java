package com.hospital.clinichub.controllers;

import com.hospital.clinichub.models.Patient;
import com.hospital.clinichub.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private PatientService patientService;

    public PatientController(
            PatientService patientService
    ){
        this.patientService = patientService;
    }

    @GetMapping()
    public ResponseEntity<List<Patient>> getAllPatients(){
        return ResponseEntity.ok().body(patientService.getAllPatients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(
            @PathVariable("id")Long id
    ){
        return ResponseEntity.ok().body(patientService.getPatientById(id));
    }

    @PostMapping("/add_patient")
    public ResponseEntity<Patient> addPatient(
            @RequestBody Patient patient
    ){
        return ResponseEntity.ok().body(patientService.addPatient(patient));
    }






}
