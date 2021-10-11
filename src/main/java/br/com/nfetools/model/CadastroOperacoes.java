package br.com.nfetools.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CadastroOperacoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroOperacoes implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_CadastroOperacoes;

	@Column(name = "TipoOperacoes")
	private String TipoOperacoes;

	@Column(name = "TipoDescricaoOperacao")
	private String TipoDescricaoOperacao;

	@Column(name = "TipoDescricaoAdicionalOperacoes")
	private String TipoDescricaoAdicionalOperacoes;

	
	@Column(name = "TipoDefinicoesOperacoes")
	private String TipoDefinicoesOperacoes;
	
	

	
	
}
