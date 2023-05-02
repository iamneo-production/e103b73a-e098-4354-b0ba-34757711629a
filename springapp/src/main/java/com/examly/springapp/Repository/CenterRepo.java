package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.ServiceCenterModel;

@Repository
public interface CenterRepo extends JpaRepository<ServiceCenterModel, String>{
}
