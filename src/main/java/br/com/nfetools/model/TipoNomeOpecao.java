package br.com.nfetools.model;

import lombok.Getter;

public enum TipoNomeOpecao {

	VENDA_DE_MARCADORIA("Venda de mercadorias"),
	COMPRA_DE_MERCADORIAS("Compra de mercadorias"),
	DEVOLUCAO_DE_COMPRA_DE_MERCADORIA("Devolução de compra de mercadorias"),
	DEVOLUCAO_DE_VENDA_DE_MERCADORIA("Devolução de venda de mercadorias"),
	REMESSA_DE_MERCADORIA_EM_CONSIGNACAO("Remessa de mercadoria em consignação"),
	REMESSA_DE_MERCADORIA_PARA_CONCERTO("Remessa de mercadoria para conserto"),
	REMESSA_DE_MERCADORIA_PARA_DEMOSTRACAO("Remessa de mercadoria para demonstração"),
	TRANFERENCIA_DE_MERCADORIA("Transferência de mercadorias"),;

	
	
	@Getter
	private String nome;
	
	private TipoNomeOpecao(String nome) {
		this.nome=nome;
		
	}
	
	
	

	
	
	
	
	
	  
	
	 
	 
	 
	 
	
}
