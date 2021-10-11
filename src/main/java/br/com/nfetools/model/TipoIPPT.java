package model;

import lombok.Getter;

public enum TipoIPPT {

	PRODUCAO_PROPRIA("Produção do estabelecimento"),
	PRODUCAO_DE_TERCEIROS("Produção de terceiros para revenda"),
	
	;
	
	@Getter
	private String TipoIPPT;
	
	private TipoIPPT(String TipoIPPT) {
		this.TipoIPPT = TipoIPPT;
	}
	
}
