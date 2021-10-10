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
@Table(name="CadastroOperacoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroOperacoes {

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
