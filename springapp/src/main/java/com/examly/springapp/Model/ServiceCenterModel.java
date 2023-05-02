package com.examly.springapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity

@Table
public class ServiceCenterModel {
@Id

String serviceCenterID;
String serviceCenterName;
String serviceCenterPhone;
String serviceCenterAddress;
String serviceCentermailId;
String serviceCenterDescription;
public ServiceCenterModel() {
	super();
	// TODO Auto-generated constructor stub
}
public ServiceCenterModel(String serviceCenterID, String serviceCenterName, String serviceCenterPhone,
		String serviceCenterAddress, String serviceCentermailId, String serviceCenterDescription) {
	super();
	this.serviceCenterID = serviceCenterID;
	this.serviceCenterName = serviceCenterName;
	this.serviceCenterPhone = serviceCenterPhone;
	this.serviceCenterAddress = serviceCenterAddress;
	this.serviceCentermailId = serviceCentermailId;
	this.serviceCenterDescription = serviceCenterDescription;
}
public String getServiceCenterID() {
	return serviceCenterID;
}
public void setServiceCenterID(String serviceCenterID) {
	this.serviceCenterID = serviceCenterID;
}
public String getServiceCenterName() {
	return serviceCenterName;
}
public void setServiceCenterName(String serviceCenterName) {
	this.serviceCenterName = serviceCenterName;
}
public String getServiceCenterPhone() {
	return serviceCenterPhone;
}
public void setServiceCenterPhone(String serviceCenterPhone) {
	this.serviceCenterPhone = serviceCenterPhone;
}
public String getServiceCenterAddress() {
	return serviceCenterAddress;
}
public void setServiceCenterAddress(String serviceCenterAddress) {
	this.serviceCenterAddress = serviceCenterAddress;
}
public String getServiceCentermailId() {
	return serviceCentermailId;
}
public void setServiceCentermailId(String serviceCentermailId) {
	this.serviceCentermailId = serviceCentermailId;
}
public String getServiceCenterDescription() {
	return serviceCenterDescription;
}
public void setServiceCenterDescription(String serviceCenterDescription) {
	this.serviceCenterDescription = serviceCenterDescription;
}



}

