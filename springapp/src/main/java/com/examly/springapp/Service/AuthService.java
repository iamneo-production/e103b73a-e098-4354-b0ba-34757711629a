package com.examly.springapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.LoginModel;
import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.AuthRepo;

@Service
public class AuthService {
              
              
              @Autowired
              public AuthRepo authrepo;
              

              
              public boolean checkLogin(LoginModel data) {
                             LoginModel foundLogin=authrepo.findByEmailAndPassword(data.getEmail(),data.getPassword());
                             if(foundLogin!=null) {
                                           
                                           return true;
                             }
                             else {
                                           return false;
                             }
              }



			public LoginModel adduser(LoginModel loginmodel) {
				
				return  authrepo.save(loginmodel);
			}

}
              
