package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.AdminModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel,String>
{

	

}

