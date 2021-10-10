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
@Table(name="FerramentasModel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FerramentasModel {

	
	//IMPORTAÇÃO DE DADOS
	@Column(name = "args")
	private String args;
	
	// EXPORTAÇÃO DE DADOS
	
	@Column(name = "TipoExportacaoDeDados")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoExportacaoDeDados TipoExportacaoDeDados;
	
}
