package br.com.nfetools.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EnableJpaRepositories
@Table(name = "EmitenteModel")
@NoArgsConstructor
@Getter
@Setter
public class EmitenteModel implements Serializable {

	private static final long serialVersionUID =1L;
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_emitente;
	
	
	@Column(name = "TipoCadastroPessoa")
	private String TipoCadastroPessoa;

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
	private String TiposPaises;

	@Column(name = "TiposEstadosBrasileiros")
	private String TiposEstadosBrasileiros;

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

	
	
	public EmitenteModel(Long id_emitente, String tipoCadastroPessoa, String nome, String nomeFantasia, String cnpj,
			Long ie, Long im, String tipoCRT, Long cnae, String nomeResponsavel, String cpfResponsavel, Long cep,
			String logradouro, String numeroCasa, String complemento, String tiposPaises,
			String tiposEstadosBrasileiros, String cidade, String bairro, Long codigoMunicipioIbge,
			String nomeMunicipio, Long telefone, Long celular, Long fax, String email, String webSite,
			String observacoes) {
		super();
		this.id_emitente = id_emitente;
		TipoCadastroPessoa = tipoCadastroPessoa;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.ie = ie;
		this.im = im;
		TipoCRT = tipoCRT;
		this.cnae = cnae;
		this.nomeResponsavel = nomeResponsavel;
		this.cpfResponsavel = cpfResponsavel;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numeroCasa = numeroCasa;
		this.complemento = complemento;
		TiposPaises = tiposPaises;
		TiposEstadosBrasileiros = tiposEstadosBrasileiros;
		this.cidade = cidade;
		this.bairro = bairro;
		this.codigoMunicipioIbge = codigoMunicipioIbge;
		this.nomeMunicipio = nomeMunicipio;
		this.telefone = telefone;
		this.celular = celular;
		this.fax = fax;
		this.email = email;
		this.webSite = webSite;
		this.observacoes = observacoes;
	}



	@Override
	public int hashCode() {
		return Objects.hash(TipoCRT, TipoCadastroPessoa, TiposEstadosBrasileiros, TiposPaises, bairro, celular, cep,
				cidade, cnae, cnpj, codigoMunicipioIbge, complemento, cpfResponsavel, email, fax, id_emitente, ie, im,
				logradouro, nome, nomeFantasia, nomeMunicipio, nomeResponsavel, numeroCasa, observacoes, telefone,
				webSite);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmitenteModel other = (EmitenteModel) obj;
		return Objects.equals(TipoCRT, other.TipoCRT) && Objects.equals(TipoCadastroPessoa, other.TipoCadastroPessoa)
				&& Objects.equals(TiposEstadosBrasileiros, other.TiposEstadosBrasileiros)
				&& Objects.equals(TiposPaises, other.TiposPaises) && Objects.equals(bairro, other.bairro)
				&& Objects.equals(celular, other.celular) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cnae, other.cnae)
				&& Objects.equals(cnpj, other.cnpj) && Objects.equals(codigoMunicipioIbge, other.codigoMunicipioIbge)
				&& Objects.equals(complemento, other.complemento)
				&& Objects.equals(cpfResponsavel, other.cpfResponsavel) && Objects.equals(email, other.email)
				&& Objects.equals(fax, other.fax) && Objects.equals(id_emitente, other.id_emitente)
				&& Objects.equals(ie, other.ie) && Objects.equals(im, other.im)
				&& Objects.equals(logradouro, other.logradouro) && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeFantasia, other.nomeFantasia)
				&& Objects.equals(nomeMunicipio, other.nomeMunicipio)
				&& Objects.equals(nomeResponsavel, other.nomeResponsavel)
				&& Objects.equals(numeroCasa, other.numeroCasa) && Objects.equals(observacoes, other.observacoes)
				&& Objects.equals(telefone, other.telefone) && Objects.equals(webSite, other.webSite);
	}

	
	
	
	
}
