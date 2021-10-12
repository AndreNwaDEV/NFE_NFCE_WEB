package model;

import lombok.Getter;

public enum TipoRefPagamento {

	CARTAO_DE_CREDITO("Cartão de Credito"),
	CARTAO_DE_DEBITO("Cartão de Debito"),
	BOLETO("Boleto bancario"),
	CREDITO_LOJA("Credito da Loja"),
	CHEQUE("Cheques"),
	PIX("Pagamento Istantaneo PIX"),
	VALE_ALIMENTACAO("Vale Alimentação"),
	VALE_REFEICAO("Vale Refeição"),
	VALE_PRESENTE("Vale Presente"),
	VALE_COMBUSTIVEL("Vale Combustivel"),
	DEPOSITO_BANCARIO("Deposito Bancario"),
	TRANFERENCIA_BANCARIA("Transferencia Bancaria"),
	PROGRAMA_DE_FIDELIDADE("Programa de Fidelidade"),
	OUTROS(""),
	;
	
	
	@Getter
	private String TipoRefPagamento;
	
	
	private TipoRefPagamento(String TipoRefPagamento) {
		this.TipoRefPagamento = TipoRefPagamento;
	}
	
	
	
}
