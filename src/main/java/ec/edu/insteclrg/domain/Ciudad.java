package ec.edu.insteclrg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (updatable = false, nullable = false)
	private Long idciudad;
	@ManyToOne
	@JoinColumn(name ="id_provincia")
	private Provincia provincia;
	
	@Column(nullable = false )
	private String nombre;
	
}

