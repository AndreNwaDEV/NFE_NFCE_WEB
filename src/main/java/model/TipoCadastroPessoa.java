package model;



import lombok.Getter;


public enum TipoCadastroPessoa {

	
	CLIENTE("Cliente"),
	FORNECEDOR("Fornecedor"),
	TRANSPORTADOR("Transportadora"),
	INTERMEDIADOR("Intermediador"),
	  
	;
	

	@Getter
	private String TipoCadastroPessoa;
	
	private TipoCadastroPessoa(String TipoCadastroPessoa) {
		this.TipoCadastroPessoa = TipoCadastroPessoa;
	}
	
	
	
	
	
}
