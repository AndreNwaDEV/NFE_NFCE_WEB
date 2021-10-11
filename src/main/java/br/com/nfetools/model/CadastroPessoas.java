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
@Table(name="CadastroPessoas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroPessoas implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_CadastroPessoas;


	@Column(name = "TipoCadastroPessoa")
	private  String TipoCadastroPessoa;
	
	
	@Column(name = "nome")
	@Getter
	@Setter
	private String nome;
	
	@Column(name = "apelido")
	private String apelido;
	
	@Column(name = "cpf")
	private Long cpf;
	
	@Column(name = "rg")
	private Long rg;
	
	@Column(name = "cep")
	private Long cep;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numeroCasa")
	private Long numeroCasa;
	
	@Column(name = "complementoCasa")
	private String complementoCasa;
	
	@Column(name = "bairro")
	private String bairro;
	
	
	
	
	
	@Column(name = "TiposPaises")
	private String TiposPaises;
	
	
	
	
	
	@Column(name = "TiposEstadosBrasileiros")
	private String TiposEstadosBrasileiros;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "observacoes")
	private String observacoes;
	
	
	
	
	
	
}
