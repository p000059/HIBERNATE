package com.hibernate.Interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.property.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
																		