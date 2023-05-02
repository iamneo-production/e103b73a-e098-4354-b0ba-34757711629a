package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.UserRepo;

@Service
public class UserService {
              @Autowired
              public UserRepo servicerepo;
              
              public boolean checkLogin(UserModel data) {
                             UserModel foundLogin=servicerepo.findByEmailAndPassword(data.getEmail(),data.getPassword());
                             if(foundLogin!=null) {
                                           
                                           return true;
                             }
                             else {
                                           return false;
                             }
              }
           public UserModel getUserByEmail(String email) {
        	   return servicerepo.findByEmail( email);
           }
              
              public UserModel saveadmin(UserModel admin) {
                             return servicerepo.save(admin);
              }
              
              public List<UserModel> getUser(){
                             return servicerepo.findAll();
              }

              public UserModel editUser(UserModel usermodel) {
                             return servicerepo.save(usermodel);
              }

              public boolean deleteEmail(String email) {
                             // TODO Auto-generated method stub
                             servicerepo.deleteById(email);
                             return true;
              }   
}
