package br.com.nfetools.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "RegrasTributacaoModel")
public class RegrasTributacaoModel implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_RegrasTributacaoModel;

	@Column(name = "nome_da_regra")
	private String nome_da_regra;
	
	
	@Column(name = "TipoOperacaoRegraTributacao")
	private String TipoOperacaoRegraTributacao;
	
	@Column(name = "descricaoOpicional")
	private String descricaoOpicional;
	
	
}
