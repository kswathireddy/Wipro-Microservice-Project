package com.wipro.travelAgency.swathi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelAgency.swathi.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
