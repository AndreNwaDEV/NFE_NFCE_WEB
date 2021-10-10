package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Entity
@Table(name = "RegrasTributacaoModel")
public class RegrasTributacaoModel {

	@Column(name = "nome_da_regra")
	private String nome_da_regra;
	
	
	@Column(name = "TipoOperacaoRegraTributacao")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoOperacaoRegraTributacao TipoOperacaoRegraTributacao;
	
	private String descricaoOpicional;
	
	
}
