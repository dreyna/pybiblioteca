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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name="TBL_USUARIOS")
public class Usuario {
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuarios")
    @SequenceGenerator(name = "seqUsuarios", allocationSize = 1, sequenceName = "SEQ_USUARIOS")
    @Builder.Default
    private Long id=0L;
	@Column(name = "USERNAME")
	@NotNull @NotBlank    
    private String username;
	@Column(name = "PASSWORD")
	@NotNull @NotBlank    
    private String password;
	@Column(name = "ESTADO")
	@NotBlank    
    private char estado;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "ID")
    private Empleado empleado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
	@JsonIgnore
	private Set<Prestamo> prestamos;
	
	@ManyToMany(
			cascade=CascadeType.ALL
	)
	@JoinTable(
	  name = "TBL_USUARIO_ROL", 
	  joinColumns = @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID"), 
	  inverseJoinColumns = @JoinColumn(name = "ROL_ID", referencedColumnName = "ID")
	 )
	private Set<Rol> roles;
	
}
