package com.example.sysbiblioteca.entity;

import java.util.Date;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
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
@Table(name="TBL_PRESTAMOS")
public class Prestamo {
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPrestamos")
    @SequenceGenerator(name = "seqPrestamos", allocationSize = 1, sequenceName = "SEQ_PRESTAMOS")
    @Builder.Default
    private Long id=0L;
	
	@Column(name = "FECHA_PRESTAMO")	
	@Temporal(TemporalType.TIMESTAMP)  
    private Date fechap;
	
	@Column(name = "FECHA_ENTREGA")
	@Temporal(TemporalType.DATE)
    private Date fechae;
	
	@Column(name = "ESTADO")
	@NotBlank    
    private char estado;
	
	@ManyToOne
    @JoinColumn(name="LECTOR_ID", nullable = false)
    private Lector lector;
	
	@ManyToOne
    @JoinColumn(name="USUARIO_ID", nullable = false)
    private Usuario usuario;	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prestamo")
	@JsonIgnore
	private Set<DetallePrestamo> detalles;
	
}