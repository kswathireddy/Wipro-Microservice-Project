package com.wipro.travelAgency.swathi.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWrapper {
    private Long id;
    private String name;
    private String email;
    private String role;
}

