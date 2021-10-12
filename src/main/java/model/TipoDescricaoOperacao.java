package model;

import lombok.Getter;

public enum TipoDescricaoOperacao {

	
	OPERACAO_DE_ENTRADA("Operação de Entrada"),
	OPERACAO_DE_SAIDA("Operação de Saida"),

	
	;
	
	
	
	

@Getter
private String TipoDescricaoOperacao;

private TipoDescricaoOperacao(String TipoDescricaoOperacao) {
	this.TipoDescricaoOperacao=TipoDescricaoOperacao;
	
}



}