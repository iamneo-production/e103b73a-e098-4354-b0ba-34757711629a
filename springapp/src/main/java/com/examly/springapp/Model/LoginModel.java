package com.examly.springapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


public class LoginModel {
              @Id  
              @Column(length=20)
              String email;
              String password;
              public LoginModel() {
                             super();
              }
              public LoginModel(String email, String password) {
                             super();
                             this.email = email;
                             this.password = password;
              }
              public String getEmail() {
                             return email;
              }
              public void setEmail(String email) {
                             this.email = email;
              }
              public String getPassword() {
                             return password;
              }
              public void setPassword(String password) {
                             this.password = password;
              }
              @Override
              public String toString() {
                             return "LoginModel [email=" + email + ", password=" + password + "]";
              }}

