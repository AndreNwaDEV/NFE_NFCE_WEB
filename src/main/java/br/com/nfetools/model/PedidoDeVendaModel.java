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
@Table(name="PedidoDeVendaModel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoDeVendaModel implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_PedidoDeVendaModel;

	@Column(name = "emissao")
	private String emissao;
	
	@Column(name = "hora")
	private String hora;
	
	@Column(name = "entrega")
	private String entrega;
	
	@Column(name = "horaEntrega")
	private String horaEntrega;
	
	//CLIENTE
	
	@Column(name = "clienteModel")
	private String clienteModel;
	
	
	
	
}
