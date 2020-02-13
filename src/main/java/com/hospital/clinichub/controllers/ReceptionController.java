package com.hospital.clinichub.controllers;

import com.hospital.clinichub.models.Reception;
import com.hospital.clinichub.services.ReceptionService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reception")
public class ReceptionController {
    
    private ReceptionService receptionService;
    
    private ReceptionController(
            ReceptionService receptionService
    ){
        this.receptionService = receptionService;
    }
    
    @GetMapping()
    public ResponseEntity<List<Reception>> getReception(){
        return ResponseEntity.ok().body(receptionService.getAllReception());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Reception> getReceptionById(
            @PathVariable("id")Long id
    ){
        return ResponseEntity.ok().body(receptionService.getReceptionById(id));
    }
    
    @PostMapping("/add_reception")
    public ResponseEntity<Reception> addReception(
            @RequestBody Reception reception
    ){
        return ResponseEntity.ok().body(receptionService.addReception(reception));
    }
    
}
