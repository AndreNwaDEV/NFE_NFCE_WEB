package model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class PedidoDeVendaModel {

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
	private CadastroPessoas clienteModel;
	
	
	
	
}
