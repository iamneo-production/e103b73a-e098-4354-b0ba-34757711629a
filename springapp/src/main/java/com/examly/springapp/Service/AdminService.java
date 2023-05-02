package com.examly.springapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.AdminModel;
import com.examly.springapp.Repository.AdminRepo;

@Service
public class AdminService {
	
	              
	              @Autowired
	              private AdminRepo adminrepo;

	              public boolean login(AdminModel adminmodel)
	              {
	                             adminrepo.save(adminmodel);
	                             return true;
	              }
	              
	              public AdminModel signup(AdminModel adminmodel)
	              {
	                             System.out.println("Admin added");
	                             return adminrepo.save(adminmodel);
	              }

}
