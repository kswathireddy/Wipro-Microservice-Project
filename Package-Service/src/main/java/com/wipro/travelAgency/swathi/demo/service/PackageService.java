package com.wipro.travelAgency.swathi.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.travelAgency.swathi.demo.entity.DestinationWrapper;
import com.wipro.travelAgency.swathi.demo.entity.PackageInterface;
import com.wipro.travelAgency.swathi.demo.entity.PackageTour;

public interface PackageService {

	PackageTour addPackage(PackageTour travelPackage);

	Page<PackageTour> getAllPackages(int page, int size);

	PackageInterface getPackageById(Long id);

	

	

	
}
