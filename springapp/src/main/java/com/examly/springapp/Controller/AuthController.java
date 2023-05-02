package com.examly.springapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.LoginModel;
import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Service.AuthService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AuthController {

              
              @Autowired
              public AuthService authservice;
             
              @PostMapping("/loginpage")
              public boolean isUserPresent(@RequestBody LoginModel data){
                             return authservice.checkLogin(data);
              }
              @PostMapping("/user2/signup")
              public LoginModel sigupuser(@RequestBody LoginModel loginmodel) {
                             return authservice.adduser(loginmodel);
                             
              }
              }
