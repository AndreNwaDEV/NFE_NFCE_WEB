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
@Table(name = "EmitenteModel")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmitenteModel implements Serializable {

	private static final long serialVersionUID =1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emitente")
	private Long id_emitente;
	
	
	@Column(name = "TipoCadastroPessoa")
	@Enumerated(value = EnumType.ORDINAL)
	private TipoCadastroPessoa TipoCadastroPessoa;

	@Column(name = "nome")
	private String nome;

	@Column(name = "nomeFantasia")
	private String nomeFantasia;

	@Column(name = "cnpj")
	private  String cnpj;

	@Column(name = "ie")
	private Long ie;

	@Column(name = "im")
	private Long im;
	
	@Column(name = "TipoCRT")
	/* @Enumerated(value = EnumType.ORDINAL) */
	private String TipoCRT;

	@Column(name = "cnae")
	private Long cnae;

	@Column(name = "nomeResponsavel")
	private String nomeResponsavel;

	@Column(name = "cpfResponsavel")
	private String cpfResponsavel;
	
	
	//ENDEREÇO
	
	@Column(name = "cep")
	private Long cep;

	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numeroCasa")
	private String numeroCasa;
	
	@Column(name = "complemento")
	private String complemento;
	
	
	@Column(name = "TiposPaises")
	@Enumerated(value = EnumType.ORDINAL)
	private TiposPaises TiposPaises;

	@Column(name = "TiposPaises")
	/* @Enumerated(value = EnumType.ORDINAL) */
	private TiposEstadosBrasileiros TiposEstadosBrasileiros;

	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "bairro")
	private String bairro;

	@Column(name = "codigoMunicipioIbge")
	private Long codigoMunicipioIbge;
	
	private String nomeMunicipio;
	
	//TELEFONES
	
	@Column(name = "telefone")
	private Long telefone;
	
	@Column(name = "celular")
	private Long celular;
	
	@Column(name = "fax")
	private Long fax;
	
	//ENDEREÇOS ELETRONICOS
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "webSite")
	private String webSite;

	@Column(name = "observacoes")
	private String observacoes;

	
	
	
	
}
