package com.hibernate.model.property;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Table(name = "email")
@Entity
public class Email extends Common {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	@Column(name = "email", length = 180, nullable = false)
	private String email;
}
