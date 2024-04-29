package com.example.restapi.jdbc.service;

import java.util.List;

import com.example.restapi.jdbc.model.CloudVendor;

public interface CloudVendorService {
      public String createVendor(CloudVendor cloudvendor);
      public String updateVendor(CloudVendor cloudvendor);
      public String deleteVendor(String cloudvendorId);
      public CloudVendor getVendor(String clodvendorId);
      public List<CloudVendor> getAll();
}
