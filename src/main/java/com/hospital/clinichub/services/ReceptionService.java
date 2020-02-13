/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.clinichub.services;

import com.hospital.clinichub.models.Reception;
import com.hospital.clinichub.repositories.ReceptionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author mudavanhuo Anesu
 */
@Service
public class ReceptionService {
    private ReceptionRepository receptionRepository;
    
    private ReceptionService(
            ReceptionRepository receptionRepository
    ){
        this.receptionRepository = receptionRepository;
    }
    
    public List<Reception> getAllReception(){
        List<Reception> receptionList = receptionRepository.findAll();
        
        if(receptionList.size()>0){
            return receptionList;
        }
        else{
            return new ArrayList<Reception>();
        }
    }
    
    public Reception getReceptionById(Long id){
        Optional<Reception> receptionOptional = receptionRepository.findById(id);
        
        if(receptionOptional.isPresent()){
            return receptionOptional.get();
        }
        else{
            return null;
        }                
    }
    
    public Reception addReception(Reception receptionFromUser){
        Optional<Reception> receptionFromDb = receptionRepository.findById(receptionFromUser.getId());
        
        if(receptionFromDb.isPresent()){
            return receptionFromDb.get();
        }
        else{
            receptionFromUser = receptionRepository.save(receptionFromUser);
            return receptionFromUser;
        }
    }
}
