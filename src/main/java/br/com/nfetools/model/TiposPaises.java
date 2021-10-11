package br.com.nfetools.model;

import lombok.Getter;

public enum TiposPaises {

	
	BRASIL("Brasil"),
	;
	
	
	@Getter
	private String TiposPaises;
	
	private TiposPaises(String TiposPaises) {
		this.TiposPaises = TiposPaises;
	}
	
}
