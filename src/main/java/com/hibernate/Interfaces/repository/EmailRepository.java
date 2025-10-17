package com.hibernate.Interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.property.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
