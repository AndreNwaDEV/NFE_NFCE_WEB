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
@Table(name="CadastroPagamentos")
@NoArgsConstructor
@AllArgsConstructor
public class CadastroPagamentos {

	
	
	@Column(name = "nomeFormaDePagamento")
	@Getter
	@Setter
	private String nomeFormaDePagamento;
	
	
	@Column(name = "descricao")
	@Getter
	@Setter
	private String descricao;
	
	
	@Column(name = "TiposDePagamanto")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TiposDePagamanto TiposDePagamanto;
	
	
	
	
	@Column(name = "TipoRefPagamento")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoRefPagamento TipoRefPagamento;
	
	
	
}
