package com.hibernate.Interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.property.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
