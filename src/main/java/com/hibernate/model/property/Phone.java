package com.hibernate.model.property;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phone")
@Entity
public class Phone extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "type", length = 15, nullable = false)
	@NotNull(message = "type is requered")
	private String type;
	
	@Column(name = "number", length = 11, nullable = false)
	@NotNull(message = "number is requered")	
	private String number;
}
