package com.sms.springboot.hospitalservicesh2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.springboot.hospitalservicesh2.repository.HospitalRepository;
import com.sms.springboot.hospitalservicesh2.model.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class HospitalServiceImpl implements HospitalService {
   
   @Autowired
    private HospitalRepository hospitalRepository;
	
	/*private List<Hospital> hospitalList=new ArrayList<>(Arrays.asList(
			new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),
			new Hospital(1002,"Global Hospital","Chennai", 3.5),
			new Hospital(1003,"VCare Hospital","Bangalore", 3))); */

    public List<Hospital> getAllHospitals(){
	   List<Hospital> hospitalList = new ArrayList<>();
       hospitalRepository.findAll().forEach(h -> hospitalList.add(h));
	   return hospitalList;
    }

    public Hospital getHospital(int id){
        Optional<Hospital> optHos = hospitalRepository.findById(id);
	   return optHos.get();
    }
    
    public void setHospital(Hospital hospital){
        hospitalRepository.save(hospital);
    }
     
    public void deleteHospital(int id) {
        hospitalRepository.deleteById(id);
    }
     
    public void updateHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

}
