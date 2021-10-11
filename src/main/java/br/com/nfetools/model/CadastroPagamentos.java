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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_CadastroPagamentos;

	
	
	@Column(name = "nomeFormaDePagamento")
	private String nomeFormaDePagamento;
	
	
	@Column(name = "descricao")
	private String descricao;
	
	
	@Column(name = "TiposDePagamanto")
	private String TiposDePagamanto;
	
	
	
	
	@Column(name = "TipoRefPagamento")
	private String TipoRefPagamento;
	
	
	
}
