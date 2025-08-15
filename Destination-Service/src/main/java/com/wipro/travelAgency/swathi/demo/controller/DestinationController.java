package com.wipro.travelAgency.swathi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.travelAgency.swathi.demo.entity.Destination;
import com.wipro.travelAgency.swathi.demo.service.DestinationService;

@RestController
@RequestMapping("/api/v1/destination")
public class DestinationController {
	
	@Autowired
	private DestinationService destinationService;
	
	
	@PostMapping("/addDest")
	public Destination addDestination(@RequestBody Destination destination) {
		return destinationService.addDestination(destination);
		
	}
	@GetMapping("/allDestinations")
	public Page<Destination> getAll(Pageable pageable){
		return destinationService.getAll(pageable);
	}
	
	@DeleteMapping("/deleteDest/{id}")
	public String deleteDest(@PathVariable Long id) {
		destinationService.deleteDest(id);
		return "destination deleted successfully";
	}
	
	@GetMapping("/{id}")
	public Destination getById(@PathVariable Long id) {
		return destinationService.getById(id);
	}
	@PutMapping("/updateById/{id}")
	public Destination updateDest(@PathVariable Long id,@RequestBody Destination destination) {
		return destinationService.updateDest(id,destination);
	}

}
