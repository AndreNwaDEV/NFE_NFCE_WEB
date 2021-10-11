package br.com.nfetools.model;

import lombok.Getter;

public enum TipoExportacaoDeDados {

	PESSOAS("Pessoas"),
	PRODUTOS("Produtos"),
	SERVICOS("Serviços"),
	MOVIMENTOS("Movimentos"),;
	
	
	@Getter
	private String TipoExportacaoDeDados;
	
	private TipoExportacaoDeDados(String TipoExportacaoDeDados) {
		this.TipoExportacaoDeDados = TipoExportacaoDeDados;
	}
}
