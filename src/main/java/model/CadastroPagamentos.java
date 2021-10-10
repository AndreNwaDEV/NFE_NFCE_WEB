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
@Table(name="CadastroPagamentos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroPagamentos {

	
	
	@Column(name = "nomeFormaDePagamento")
	private String nomeFormaDePagamento;
	
	
	@Column(name = "descricao")
	private String descricao;
	
	
	@Column(name = "TiposDePagamanto")
	@Enumerated(value = EnumType.ORDINAL)
	private TiposDePagamanto TiposDePagamanto;
	
	
	
	
	@Column(name = "TipoRefPagamento")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoRefPagamento TipoRefPagamento;
	
	
	
}
