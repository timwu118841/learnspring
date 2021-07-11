package com.tiwu.day4.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiwu.day4.model.StaffModel;
import com.tiwu.day4.repo.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	StaffRepository staffRepository;
	public void addStaff(StaffModel staffModel){
		staffRepository.addStaff(staffModel);
	}

}