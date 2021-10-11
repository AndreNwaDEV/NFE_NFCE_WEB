package model;

import lombok.Getter;

public enum TipoQtdCasasDecimais {

	UM("1"),
	DOIS("2"),
	TRES("3"),
	QUATRO("4"),
	CINCO("5"),;
	
	@Getter
	private String TipoCasasDecimais;
	
	private TipoQtdCasasDecimais(String TipoCasasDecimais) {
		this.TipoCasasDecimais = TipoCasasDecimais;
	}
	
}
