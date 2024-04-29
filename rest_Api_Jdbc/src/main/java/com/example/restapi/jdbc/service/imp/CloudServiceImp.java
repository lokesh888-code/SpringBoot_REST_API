package com.example.restapi.jdbc.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restapi.jdbc.model.CloudVendor;
import com.example.restapi.jdbc.repository.CloudVendorRepository;
import com.example.restapi.jdbc.service.CloudVendorService;


@Service
public class CloudServiceImp implements CloudVendorService{

	CloudVendorRepository cloudVendorRepository;
	
	
	
	public CloudServiceImp(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}



	@Override
	public String createVendor(CloudVendor cloudvendor) {
		cloudVendorRepository.save(cloudvendor);
		return "Created Successfully";
	}



	@Override
	public String updateVendor(CloudVendor cloudvendor) {
		cloudVendorRepository.save(cloudvendor);
		return "Updated Successfully";
	}



	@Override
	public String deleteVendor(String cloudvendorId) {
		// TODO Auto-generated method stub
		 cloudVendorRepository.deleteById(cloudvendorId);
		 return "Deleted Successfully";
	}



	@Override
	public CloudVendor getVendor(String clodvendorId) {
		
		return cloudVendorRepository.findById(clodvendorId).get();
	}



	@Override
	public List<CloudVendor> getAll() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

	

}
