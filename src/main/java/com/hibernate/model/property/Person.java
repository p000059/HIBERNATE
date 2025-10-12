package com.hibernate.model.property;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
@Entity
public class Person extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	@Size(min = 10, max = 30)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String firstName;

	@Column(name = "last_name")
	@Size(min = 20, max = 100)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String lastName;
	
	@NotNull(message = "It cannot be null.")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "person_phone",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "phone_id"))
    private List<Phone> phone;

    @NotNull(message = "It cannot be null.")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "person_email",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "email_id"))
    private List<Email> email;
}
