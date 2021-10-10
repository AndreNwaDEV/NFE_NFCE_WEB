package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CadastroOperacoes")
@NoArgsConstructor
@AllArgsConstructor
public class CadastroOperacoes {

	@Column(name = "TipoOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoNomeOpecao TipoOperacoes;

	@Column(name = "TipoDescricaoOperacao")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoDescricaoOperacao TipoDescricaoOperacao;

	@Column(name = "TipoDescricaoAdicionalOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoDescricaoAdicionalOperacoes TipoDescricaoAdicionalOperacoes;

	
	@Column(name = "TipoDefinicoesOperacoes")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoDefinicoesOperacoes TipoDefinicoesOperacoes;
	
	

	
	
}
