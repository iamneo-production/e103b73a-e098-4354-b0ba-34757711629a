package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.LoginModel;
import com.examly.springapp.Model.UserModel;

@Repository
public interface AuthRepo extends JpaRepository <LoginModel,Integer>{

	LoginModel findByEmailAndPassword(String email, String password);

}
