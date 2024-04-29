package com.example.restapi.jdbc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.jdbc.model.CloudVendor;
import com.example.restapi.jdbc.service.CloudVendorService;

@RestController
@RequestMapping("/Vendor")
public class CloudVendorController {

	CloudVendorService cloudService;

	
	public CloudVendorController(CloudVendorService cloudService) {
		//super();
		this.cloudService = cloudService;
	}
	
	@GetMapping("{vectorId}")
	public CloudVendor getCloundVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudService.getVendor(vendorId);
		
	}
	
	@GetMapping()
		public List<CloudVendor> getAllVendordetails(){
			return cloudService.getAll();
			
		}
	
	   @PostMapping
	public String createDetails(@RequestBody CloudVendor cloudvendor)
	{
		cloudService.createVendor(cloudvendor);
		return "Details Created Successfully";
	}
	
	    @PutMapping
		public String updateDetails(@RequestBody CloudVendor cloudvendor)
		{
			cloudService.updateVendor(cloudvendor);
			return "Details Updated Successfully";
		}
	
	    public String deleteDetails(@PathVariable("vendorId") String vectorId)
	    {
	    	cloudService.deleteVendor(vectorId);
			return "Deleted";
	    	
	    }
	
}
