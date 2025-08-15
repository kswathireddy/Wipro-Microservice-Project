package com.wipro.travelAgency.swathi.demo.entity;

import com.wipro.travelAgency.swathi.demo.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long bookingId;
   
    private String startDate;
    private Status status;
    private UserWrapper user;
    private PackageWrapper packageInfo;
    
}

