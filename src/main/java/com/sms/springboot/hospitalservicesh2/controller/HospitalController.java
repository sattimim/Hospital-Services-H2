package com.sms.springboot.hospitalservicesh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sms.springboot.hospitalservicesh2.service.HospitalService;
import com.sms.springboot.hospitalservicesh2.model.Hospital;

@RestController
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;
    
    @GetMapping("/hospitals/{id}")
    public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {
        Hospital hospital = this.hospitalService.getHospital(id);
        return hospital;
    }

    @GetMapping("/hospitals")
    public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return this.hospitalService.getAllHospitals();
		
    }
    
    @PostMapping("/hospitals")
    public void setHospital(Hospital hospital){
         hospitalService.setHospital(hospital);
        System.out.println("Hospital Saved Successfully");
    }
 
    @DeleteMapping("/hospitals/{id}")
    public void deleteHospital(@PathVariable("id")int id){
        hospitalService.deleteHospital(id);
        System.out.println("Hospital Deleted Successfully");
    }
 
    @PutMapping("/hospitals/{id}")
    public void updateEmployee(@RequestBody Hospital hospital,
                            @PathVariable("id")int id){
        Hospital hos  = hospitalService.getHospital(id);
        if(hos != null){
            hospitalService.updateHospital(hospital);
        }
  
    }

}
