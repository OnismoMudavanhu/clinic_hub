package com.hospital.clinichub.services;

import com.hospital.clinichub.models.Patient;
import com.hospital.clinichub.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    private PatientService(
            PatientRepository patientRepository
    ){
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients(){
        List<Patient> patientList = patientRepository.findAll();

        if(patientList.size()>0){
            return patientList;
        }
        else{
            return new ArrayList<Patient>();
        }
    }

    public Patient getPatientById(
            Long id
    ){
        Optional<Patient> optionalPatient = patientRepository.findById(id);

        if(optionalPatient.isPresent()){
            return optionalPatient.get();
        }else {
            return null;
        }

    }

    public Patient addPatient(
            Patient patientFromUser
    ){
        Optional<Patient> patientFromdb = patientRepository.findById(patientFromUser.getId());

        if(patientFromdb.isPresent()){
            return patientFromdb.get();
        }else{
//            Patient patient=patientFromdb.get();
//            patient.setId(patientFromUser.getId());
//            patient.setFirstName(patientFromUser.getFirstName());
//            patient.setSecondName(patientFromUser.getSecondName());
//            patient.setMembership_no(patientFromUser.getMembership_no());
//            patient.setPhone(patientFromUser.getPhone());
//            patient.setSex(patientFromUser.getSex());
//            patient.setAddress(patientFromUser.getAddress());
//            patient.setDob(patientFromUser.getDob());
//
//            patient = patientRepository.save(patient);
//            return patient;
            patientFromUser = patientRepository.save(patientFromUser);
            return patientFromUser;
        }
    }

}
