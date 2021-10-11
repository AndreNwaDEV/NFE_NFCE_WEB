package model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="CadatroProdutos")

@AllArgsConstructor
public class CadastroProdutos implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_CadastroProdutos;
	
	

	@Column(name = "nome")
	private String nome;
	
	
	@Column(name = "TipoUnidadeDeMedida")
	private String TipoUnidadeDeMedida;
	
	
	@Column(name = "TipoIPPT")
	private String TipoIPPT;
	
	
	@Column(name = "observacoes")
	private String observacoes;
	
	
	
	@Column(name = "CadastroCatagorias")
	private CadastroCatagorias CadastroCatagorias;
	
	
	
	//DETALHES
	
	@Column(name = "descicraoAdicional")
	private String descicraoAdicional;
	
	
	@Column(name = "gtin")
	private Long gtin;
	
	@Column(name = "pesoLiquido")
	private BigDecimal pesoLiquido;

	@Column(name = "pesoBruto")
	private BigDecimal pesoBruto;
	
	@Column(name = "quantidadeEstoque")
	private Long quantidadeEstoque;
	
	@Column(name = "quantidadeMinima")
	private Long quantidadeMinima;
	
	@Column(name = "custoDeCompra")
	private BigDecimal custoDeCompra;
	
	@Column(name = "custoMedio")
	private BigDecimal custoMedio;
	
	@Column(name = "margemLucroBruto")
	private BigDecimal margemLucroBruto;
	
	@Column(name = "precoVenda")
	private BigDecimal precoVenda;
	
	
}
