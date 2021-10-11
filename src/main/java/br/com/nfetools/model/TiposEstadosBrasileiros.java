package br.com.nfetools.model;

import lombok.Getter;

public enum TiposEstadosBrasileiros {

	
	ACRE("AC"),
	ALAGOAS("AL"),
	AMAPA("AP"),
	AMAZONAS("AM"),
	BAHIA("BA"),
	CEARA("CE"),
	DISTRITO_FEDERAL("DF"),
	ESPIRITO_SANTO("ES"),
	GOIAS("GO"),
	MARANHAO("MA"),
	MATO_GROSSO("MT"),
	MATO_GROOSO_DO_SUL("MS"),
	MINAS_GERAIS("MG"),
	PARA("PA"),
	PARAIBA("PB"),
	PARANA("PR"),
	PERNAMBUCO("PE"),
	PIAUI("PI"),
	RIO_DE_JANEIRO("RJ"),
	RIO_GRANDE_DO_NORTE("RN"),
	RIO_GRANDE_DO_SUL("RS"),
	RONDONIA("RO"),
	RORAIMA("RR"),
	SANTA_CATARINA("SC"),
	SAO_PAULO("SP"),
	SERGIPE("SE"),
	TOCATINS("TO"),
	
	
	;
	
	
	@Getter
	private String TiposEstadosBrasileiros;
	
	
	private TiposEstadosBrasileiros(String TiposEstadosBrasileiros) {
		this.TiposEstadosBrasileiros = TiposEstadosBrasileiros;
	}
	
	
	
	
}
