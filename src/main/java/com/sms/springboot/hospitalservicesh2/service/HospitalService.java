package com.sms.springboot.hospitalservicesh2.service;


import com.sms.springboot.hospitalservicesh2.model.Hospital;

import java.util.List;



public interface  HospitalService {
    
    public List<Hospital> getAllHospitals();
 
    public Hospital getHospital(int id);
     
    public void setHospital(Hospital hospital);
     
    public void deleteHospital(int id);
     
    public void updateHospital(Hospital hospital);

}
