package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ConfigGeralModel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConfigGeralModel {

	
	//PRECISAO NUMERICA
	
	//QUANTIDADE CASAS DECIMAIS PRODUTOS E VALORES
	@Column(name = "TipoQtdCasasDecimais")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoQtdCasasDecimais TipoQtdCasasDecimais;
	
	
	
	
	
	
}
