package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.ServiceCenterModel;
import com.examly.springapp.Service.CenterService;

@RestController
@RequestMapping("/admin")
// @CrossOrigin(origins="http://localhost:4200")
public class ServiceCenterController {
@Autowired
private CenterService service;

@PostMapping("/addServiceCenter") 
public ServiceCenterModel addServiceCenter(@RequestBody ServiceCenterModel center) {
return service.addServiceCenter(center);
}
@GetMapping("/getServiceCenter")
public List<ServiceCenterModel> viewServiceCenter() {
return service.viewServiceCenter();
}
@PutMapping("/editServiceCenter/{id}")
public ServiceCenterModel editServiceCenter(@RequestBody ServiceCenterModel center,@PathVariable("id") String id) {
return service.editServiceCenter(id,center);
}
@DeleteMapping("/deleteServiceCenter/{id}")
public void deleteServiceCenter(@PathVariable("id") String id) {
service.deleteServiceCenter(id);
}
}

