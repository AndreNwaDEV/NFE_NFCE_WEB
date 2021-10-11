package model;

import lombok.Getter;

public enum TiposDePagamanto {

	AVISTA("A vista"),
	APRAZO("A prazo"),
	OUTROS("Outros"),
	
	;
	
	
	
	@Getter
	private String TiposDePagamanto;
	
	private TiposDePagamanto(String TiposDePagamanto) {
		this.TiposDePagamanto=TiposDePagamanto;
	}
	
	
	
	
	
}
