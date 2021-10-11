package br.com.nfetools.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CadastroCatagorias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroCatagorias implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_CadastroCatagorias;
	
	
	@Column(name = "CadastroProdutos")
	private String CadastroProdutos;

	@Column(name = "nome")
	private String nome;
	
	
	
}
