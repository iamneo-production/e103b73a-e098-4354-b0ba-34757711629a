package com.examly.springapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class AdminModel {
	
	              
	              @Id
//	              @GeneratedValue(strategy=GenerationType.AUTO)
//	              public int id;
	              @Column(length=20)
	              public String email;
	              public String password;
				public AdminModel() {
					super();
					// TODO Auto-generated constructor stub
				}
				public AdminModel(String email, String password) {
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
					return "AdminModel [email=" + email + ", password=" + password + "]";
				}
}  //  public String mobileNumber;
	             // public String userRole;
	              
				
	            