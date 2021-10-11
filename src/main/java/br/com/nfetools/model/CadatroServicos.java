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
@Table(name="CadatroServicos")
@NoArgsConstructor
@AllArgsConstructor
public class CadatroServicos implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_CadatroServicos;

	
	@Column(name = "nomeDoServico")
	@Getter
	@Setter
	private String nomeDoServico;
	
	
	@Column(name = "TipoCodigoDaAtividade")
	@Enumerated(value = EnumType.ORDINAL)
	@Getter
	@Setter
	private TipoCodigoDaAtividade TipoCodigoDaAtividade;
	
	
	
	
	
	
}
