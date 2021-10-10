package model;

import java.io.Serializable;
import java.util.List;

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
public class CadastroCatagorias implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_CadastroCatagorias;
	
	

	private List<CadastroProdutos> CadastroProdutos;

	@Getter
	@Setter
	private String nome;
	
	
	
}
