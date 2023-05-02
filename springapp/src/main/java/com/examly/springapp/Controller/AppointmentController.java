package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.ProductModel;
import com.examly.springapp.Service.AppointmentService;


@RestController
@RequestMapping("/user")

// @CrossOrigin(origins="http://localhost:4200")
public class AppointmentController {
	
	                
	                @Autowired
	                private AppointmentService appointmentservice;
	                
	                @PostMapping("/saveappointment")
	                public ProductModel saveAppointment(@RequestBody ProductModel productmodel ) {
	                                return appointmentservice.saveAppointment(productmodel);
	                }
	                
	                @PutMapping("/editappointment/{id}")
	                public ProductModel EditAppointment(@RequestBody ProductModel productmodel,@PathVariable("id") int productId) {
	                                return appointmentservice.EditAppointment(productmodel);
	                }
	                
	                @DeleteMapping("/cancelappointment/{id}")
	                public void deleteAppointment(@PathVariable("id") int productId) {
	                                appointmentservice.deleteAppointment(productId);
	                }
	                
	                @GetMapping("/getappointment")
	                public List<ProductModel> getAppointment(){
	                                return appointmentservice.getAppointment();
	                }

}
