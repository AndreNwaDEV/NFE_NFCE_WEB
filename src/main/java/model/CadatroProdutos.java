package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="CadatroProdutos")
@NoArgsConstructor
@AllArgsConstructor
public class CadatroProdutos {

	
	@Column(name = "nome")
	
	private String nome;
	
	
	@Column(name = "TipoUnidadeDeMedida")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoUnidadeDeMedida TipoUnidadeDeMedida;
	
	
	@Column(name = "TipoIPPT")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoIPPT TipoIPPT;
	
	
	@Column(name = "observacoes")
	private String observacoes;
	
	
	
	@Column(name = "CadastroCatagorias")
	private CadastroCatagorias CadastroCatagorias;
	
	
	
	//DETALHES
	
	
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
