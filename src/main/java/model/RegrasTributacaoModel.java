package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Entity
@Getter
@Setter
@Table(name = "RegrasTributacaoModel")
public class RegrasTributacaoModel implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_RegrasTributacaoModel;

	@Column(name = "nome_da_regra")
	private String nome_da_regra;
	
	
	@Column(name = "TipoOperacaoRegraTributacao")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoOperacaoRegraTributacao TipoOperacaoRegraTributacao;
	
	private String descricaoOpicional;
	
	
}
