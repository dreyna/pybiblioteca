package com.example.sysbiblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
@Table(name="TBL_DETALLE_PRESTAMOS")
public class DetallePrestamo {
	
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibroPrestamos")
    @SequenceGenerator(name = "seqLibroPrestamos", allocationSize = 1, sequenceName = "SEQ_DETALLE_PRESTAMOS")
    @Builder.Default
    private Long id=0L;
	@Column(name = "OBSERVACIONES")
	@NotNull @NotBlank    
    private String observaciones;
	@Column(name = "FECHA_ENTREGA")	
	@Temporal(TemporalType.TIMESTAMP)  
    private Date fechae;
	@Column(name = "ESTADO")
	@NotBlank    
    private char estado;
	
	@ManyToOne
    @JoinColumn(name="LIBRO_ID", nullable = false)
    private Libro libro;
	
	@ManyToOne
    @JoinColumn(name="PRESTAMO_ID", nullable = false)
    private Prestamo prestamo;

}
