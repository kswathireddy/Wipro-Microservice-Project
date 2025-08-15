package com.wipro.travelAgency.swathi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.travelAgency.swathi.demo.entity.DestinationWrapper;
import com.wipro.travelAgency.swathi.demo.entity.PackageInterface;
import com.wipro.travelAgency.swathi.demo.entity.PackageTour;
import com.wipro.travelAgency.swathi.demo.feign.Packagefeign;
import com.wipro.travelAgency.swathi.demo.repo.PackageRepository;
import com.wipro.travelAgency.swathi.demo.service.PackageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/package")
public class PackageController {
	
	
	 private final PackageService packageService;

	    // Add new package
	    @PostMapping("/add")
	    public PackageTour addPackage(@RequestBody PackageTour travelPackage) {
	        return packageService.addPackage(travelPackage);
	    }

	    // Get all packages with pagination
	    @GetMapping("/all")
	    public Page<PackageTour> getAllPackages(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "5") int size) {
	        return packageService.getAllPackages(page, size);
	    }

	    // Get package by ID
	    @GetMapping("/{id}")
	    public PackageInterface getPackageById(@PathVariable Long id) {
	        return packageService.getPackageById(id);
	    }
	    
	   

}
