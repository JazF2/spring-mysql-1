package ec.edu.insteclrg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "Provincias")
@Getter
@Setter
public class Provincia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (updatable = false, nullable = false)
	private Long id_provincia;
	
	@Column(nullable = false )
	
	@OneToMany(mappedBy = "ciudad") 
	private String nombre;
		
	
	
	
	
}
