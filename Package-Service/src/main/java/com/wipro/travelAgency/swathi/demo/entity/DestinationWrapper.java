package com.wipro.travelAgency.swathi.demo.entity;



import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationWrapper {

	
	private Long destinationId;
    private String name;
    private String country;
    private Double pricePerDay;
    private String description;
	
	
}
