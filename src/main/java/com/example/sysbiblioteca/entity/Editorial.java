package com.example.sysbiblioteca.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TBL_EDITORIALES")
public class Editorial {
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEditoriales")
    @SequenceGenerator(name = "seqEditoriales", allocationSize = 1, sequenceName = "SEQ_EDITORIALES")
    @Builder.Default
    private Long id=0L;
	@Column(name = "NOMBRE")
	@NotNull @NotBlank    
    private String nombres;
	@Column(name = "ESTADO")
	@NotBlank    
    private char estado;
	
	@ManyToMany(
			cascade=CascadeType.ALL
	)
	@JoinTable(
	  name = "TBL_EDITORIAL_LIBRO", 
	  joinColumns = @JoinColumn(name = "EDITORIAL_ID", referencedColumnName = "ID"), 
	  inverseJoinColumns = @JoinColumn(name = "LIBRO_ID", referencedColumnName = "ID")
	 )
	private Set<Libro> libros;
}
