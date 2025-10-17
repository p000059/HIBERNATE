package com.hibernate.Interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.property.Dates;

public interface DatesRepository extends JpaRepository<Dates, Long> {

}
