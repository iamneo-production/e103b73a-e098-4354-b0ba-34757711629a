package com.examly.springapp.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ProductModel {
	
	       @Id
	       @GeneratedValue(strategy=GenerationType.AUTO)
	       int productId;
	       String productName;
	       String productModelNo;
	       Date dateOfPurchase;
	       String contactNumber;
	       String problemDescription;
	       String availableSlots;

	       public ProductModel() {
	              super();
	              // TODO Auto-generated constructor stub
	       }

	       
	       public ProductModel(int productId, String productName, String productModelNo, Date dateOfPurchase,
	                     String contactNumber, String problemDescription, String availableSlots) {
	              super();
	              this.productId = productId;
	              this.productName = productName;
	              this.productModelNo = productModelNo;
	              this.dateOfPurchase = dateOfPurchase;
	              this.contactNumber = contactNumber;
	              this.problemDescription = problemDescription;
	              this.availableSlots = availableSlots;
	       }


	       public int getProductId() {
	              return productId;
	       }


	       public void setProductId(int productId) {
	              this.productId = productId;
	       }


	       public String getProductName() {
	              return productName;
	       }


	       public void setProductName(String productName) {
	              this.productName = productName;
	       }


	       public String getProductModelNo() {
	              return productModelNo;
	       }


	       public void setProductModelNo(String productModelNo) {
	              this.productModelNo = productModelNo;
	       }


	       public Date getDateOfPurchase() {
	              return dateOfPurchase;
	       }


	       public void setDateOfPurchase(Date dateOfPurchase) {
	              this.dateOfPurchase = dateOfPurchase;
	       }


	       public String getContactNumber() {
	              return contactNumber;
	       }


	       public void setContactNumber(String contactNumber) {
	              this.contactNumber = contactNumber;
	       }


	       public String getProblemDescription() {
	              return problemDescription;
	       }


	       public void setProblemDescription(String problemDescription) {
	              this.problemDescription = problemDescription;
	       }


	       public String getAvailableSlots() {
	              return availableSlots;
	       }


	       public void setAvailableSlots(String availableSlots) {
	              this.availableSlots = availableSlots;
	       }


	       @Override
	       public String toString() {
	              return "ProductModel [productId=" + productId + ", productName=" + productName + ", productModelNo="
	                           + productModelNo + ", dateOfPurchase=" + dateOfPurchase + ", contactNumber=" + contactNumber
	                           + ", problemDescription=" + problemDescription + ", availableSlots=" + availableSlots + "]";
	       }
	       

}
