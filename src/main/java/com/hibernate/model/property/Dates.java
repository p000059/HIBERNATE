package com.hibernate.model.property;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "dates")
@Entity
public class Dates extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "initial_date", nullable = false)
	@NotNull(message = "It cannot be null.")
	private LocalDateTime initial_date;
	
	@Column(name = "final_date", nullable = true)	
	private LocalDateTime final_date;
}
