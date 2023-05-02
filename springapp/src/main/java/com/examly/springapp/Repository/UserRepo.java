package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,String>{

UserModel findByEmailAndPassword(String email, String password);

  public void deleteByEmail(String email);

UserModel findByEmail(String email);       

}
                                                                                                           

