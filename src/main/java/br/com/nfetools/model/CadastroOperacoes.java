package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_CadastroProdutos")
	private Long id_CadastroOperacoes;

	@Column(name = "TipoOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoNomeOpecao TipoOperacoes;

	@Column(name = "TipoDescricaoOperacao")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoDescricaoOperacao TipoDescricaoOperacao;

	@Column(name = "TipoDescricaoAdicionalOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoDescricaoAdicionalOperacoes TipoDescricaoAdicionalOperacoes;

	
	@Column(name = "TipoDefinicoesOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoDefinicoesOperacoes TipoDefinicoesOperacoes;
	
	

	
	
}
