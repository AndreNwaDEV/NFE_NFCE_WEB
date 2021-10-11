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
@Table(name="CadastroPessoas")
@NoArgsConstructor
@AllArgsConstructor
public class CadastroPessoas implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_CadastroPessoas;


	@Column(name = "TipoCadastroPessoa")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private  TipoCadastroPessoa TipoCadastroPessoa;
	
	
	@Column(name = "nome")
	@Getter
	@Setter
	private String nome;
	
	@Column(name = "apelido")
	@Getter
	@Setter
	private String apelido;
	
	@Column(name = "cpf")
	@Getter
	@Setter
	private Long cpf;
	
	@Column(name = "rg")
	@Getter
	@Setter
	private Long rg;
	
	@Column(name = "cep")
	@Getter
	@Setter
	private Long cep;
	
	@Column(name = "logradouro")
	@Getter
	@Setter
	private String logradouro;
	
	@Column(name = "numeroCasa")
	@Getter
	@Setter
	private Long numeroCasa;
	
	@Column(name = "complementoCasa")
	@Getter
	@Setter
	private String complementoCasa;
	
	@Column(name = "bairro")
	@Getter
	@Setter
	private String bairro;
	
	
	
	
	
	@Column(name = "TiposPaises")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TiposPaises TiposPaises;
	
	
	
	
	
	@Column(name = "TiposEstadosBrasileiros")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TiposEstadosBrasileiros TiposEstadosBrasileiros;
	
	@Column(name = "telefone")
	@Getter
	@Setter
	private String telefone;
	
	@Column(name = "celular")
	@Getter
	@Setter
	private String celular;
	
	@Column(name = "fax")
	@Getter
	@Setter
	private String fax;
	
	@Column(name = "email")
	@Getter
	@Setter
	private String email;
	
	@Column(name = "webSite")
	@Getter
	@Setter
	private String webSite;
	
	@Column(name = "observacoes")
	@Getter
	@Setter
	private String observacoes;
	
	
	
	
	
	
}
