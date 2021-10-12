package model;

import lombok.Getter;

public enum TipoCRT {

	
	SIMPLES_NACIONAL("Simples Nacional"),
	SIMPLES_NACIONAL_EXCESSO_SUBLIMITE("Simples Nacional - EXCESSO SUBLIMITE"),
	REGIME_NORMAL("Regime Normal"),;
	
	
	@Getter
	private String TipoCRT;
	
	
	// REGIME TRIBUTARIO
	private TipoCRT(String TipoCRT) {
		this.TipoCRT = TipoCRT;
	}
	
	
	
	
	
	
}
