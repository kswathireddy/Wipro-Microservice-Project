package com.wipro.travelAgency.swathi.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageWrapper {
    private Long id;
    private String packageName;
    private Long destinationId;
    private DestinationWrapper destination;
}

