package br.com.nfetools.model;

import lombok.Getter;

public enum TipoCodigoDaAtividade {

	LISTA_DE_CODIGOS("ESCRITA TELA"),
	
	;
	
	
	@Getter
	private String TipoCodigoDaAtividade;
	
	private TipoCodigoDaAtividade(String TipoCodigoDaAtividade) {
		this.TipoCodigoDaAtividade = TipoCodigoDaAtividade;
	}
	
}
