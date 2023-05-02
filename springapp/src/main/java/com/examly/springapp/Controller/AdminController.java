package com.examly.springapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.AdminModel;
import com.examly.springapp.Service.AdminService;

@RestController 
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {

	
	              
	              @Autowired
	              private AdminService adminservice;
	              
	              @PostMapping("/login")
	              public boolean AdminLogin(@RequestBody AdminModel adminmodel)
	              {
	                             adminservice.login(adminmodel);           
	                            return true;
	              }
	              
	              @PostMapping("/signup")
	              public AdminModel toSign(@RequestBody AdminModel adminmodel)
	              {
	                             
	                             return adminservice.signup(adminmodel);
	                             
	              }


}
