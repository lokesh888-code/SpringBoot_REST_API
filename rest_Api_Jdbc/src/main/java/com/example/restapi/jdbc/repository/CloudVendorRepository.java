package com.example.restapi.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.jdbc.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
