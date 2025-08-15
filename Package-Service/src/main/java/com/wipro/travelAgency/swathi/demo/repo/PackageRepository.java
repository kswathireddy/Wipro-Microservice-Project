package com.wipro.travelAgency.swathi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelAgency.swathi.demo.entity.PackageTour;


@Repository
public interface PackageRepository extends JpaRepository<PackageTour, Long> {

	PackageTour save(Package travelPackage);

	 

}
