package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.ServiceCenterModel;
import com.examly.springapp.Repository.CenterRepo;

@Service
public class CenterService {
@Autowired
private CenterRepo repo;

public ServiceCenterModel addServiceCenter(ServiceCenterModel center) {
return repo.save(center);
}
public List<ServiceCenterModel> viewServiceCenter() {
return repo.findAll();
}
public void deleteServiceCenter(String id) {
repo.deleteById(id);
}
public ServiceCenterModel editServiceCenter(String id,ServiceCenterModel center) {
	ServiceCenterModel s=repo.getById(id);
	s.setServiceCenterAddress(center.getServiceCenterAddress());
	s.setServiceCenterDescription(center.getServiceCenterDescription());
	s.setServiceCentermailId(center.getServiceCentermailId());
	s.setServiceCenterName(center.getServiceCenterName());
s.setServiceCenterPhone(center.getServiceCenterPhone());
	return repo.save(s);
}
}

