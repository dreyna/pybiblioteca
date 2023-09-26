package com.example.sysbiblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="TBL_AUTORES")
public class Autor {
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAutores")
    @SequenceGenerator(name = "seqAutores", allocationSize = 1, sequenceName = "SEQ_AUTORES")
    @Builder.Default
    private Long id=0L;
	@Column(name = "NOMBRES")
	@NotNull @NotBlank    
    private String nombres;
	@Column(name = "APELLIDOS")
	@NotNull @NotBlank    
    private String apellidos;
	@Column(name = "PAIS")
	@NotNull @NotBlank    
    private String pais;
	@Column(name = "ESTADO")
	@NotNull   
    private char estado;
}
