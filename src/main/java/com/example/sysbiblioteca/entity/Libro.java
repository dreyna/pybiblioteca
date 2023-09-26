package com.example.sysbiblioteca.entity;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@Entity
@Data
@Table(name="TBL_LIBROS")
public class Libro {
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibros")
    @SequenceGenerator(name = "seqLibros", allocationSize = 1, sequenceName = "SEQ_LIBROS")
    private Long id=0L;
	@Column(name = "TITULO")
	@NotNull @NotBlank    
    private String titulo;
	@Column(name = "PAGINAS")
	@NotNull @NotBlank    
    private Integer paginas;
	@Column(name = "EDICION")
	@NotNull @NotBlank    
    private Integer edicion;
	@Column(name = "ESTADO")
	@NotBlank    
    private char estado;
	
	@ManyToOne
    @JoinColumn(name="SECCION_ID", nullable = false)
    private Seccion seccion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "libro")
	@JsonIgnore
	private Set<DetallePrestamo> detalles;
	
	@ManyToMany(
			cascade=CascadeType.ALL
	)
	@JoinTable(
	  name = "TBL_LIBRO_AUTOR", 
	  joinColumns = @JoinColumn(name = "LIBRO_ID", referencedColumnName = "ID"), 
	  inverseJoinColumns = @JoinColumn(name = "AUTOR_ID", referencedColumnName = "ID")
	 )
	private Set<Autor> autores;
}
