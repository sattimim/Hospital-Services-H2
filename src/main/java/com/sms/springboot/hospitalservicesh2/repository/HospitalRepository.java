package com.sms.springboot.hospitalservicesh2.repository;

import org.springframework.data.repository.CrudRepository;
import com.sms.springboot.hospitalservicesh2.model.Hospital;

public interface HospitalRepository extends CrudRepository<Hospital,Integer> {
}
