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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Service.UserService;

@CrossOrigin (origins="http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
              @Autowired
              private UserService  authservice;
              
              @PostMapping("/login")
              public boolean isUserPresent(@RequestBody UserModel data){
                             return authservice.checkLogin(data);
              }
              @GetMapping("/{email}")
              public UserModel getEmail(@PathVariable String email) {
            	  return authservice.getUserByEmail(email);
              }
            
              @PostMapping("/signup")
              public UserModel saveadmin(@RequestBody UserModel admin) {
                             return authservice.saveadmin(admin);
              }
              
    @GetMapping("/")
    public List<UserModel> getuser () {
              return authservice. getUser();
    }
    @PutMapping("/us/editappointment/{id}")
    public UserModel editUser(@RequestBody UserModel usermodel,@PathVariable("id") String email ) {
            //  usermodel.setId(id);
              return authservice.editUser(usermodel);
    }
          
    @DeleteMapping("/us/cancelappointment/{id}")
    public boolean deleteUser(@PathVariable("id") String email) {
              return authservice.deleteEmail(email);
    }
    
    
}

