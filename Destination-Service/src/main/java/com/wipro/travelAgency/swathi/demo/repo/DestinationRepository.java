package com.wipro.travelAgency.swathi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelAgency.swathi.demo.entity.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

}
