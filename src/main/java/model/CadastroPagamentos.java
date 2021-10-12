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
public class CadastroPagamentos implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_CadastroPagamentos;

	
	
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
