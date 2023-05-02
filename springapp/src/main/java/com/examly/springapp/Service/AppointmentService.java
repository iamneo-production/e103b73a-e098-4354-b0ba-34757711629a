package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.ProductModel;
import com.examly.springapp.Repository.AppointmentRepository;

@Service
public class AppointmentService {
       
       @Autowired
       private AppointmentRepository appointmentrepository;

       public ProductModel saveAppointment(ProductModel productmodel) {
              return appointmentrepository.save(productmodel);
       }

       public ProductModel EditAppointment(ProductModel productmodel) {
              return appointmentrepository.save(productmodel);
       }

       

       public List<ProductModel> getAppointment() {
              return appointmentrepository.findAll();
       }

       

       public void deleteAppointment(int productId) {
              appointmentrepository.deleteById(productId);
              
       }}
