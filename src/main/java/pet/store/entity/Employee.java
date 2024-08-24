package pet.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	private String employeeJobTitle;
	private String employeeFirstName;
	private String employeeLastName;
	private Long employeePhone;
	
	@EqualsAndHashCode.Exclude 
	@ToString.Exclude 
	@JoinColumn(name = "pet_store_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private PetStore petStore;
}
