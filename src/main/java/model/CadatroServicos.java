package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CadatroServicos")
@NoArgsConstructor
@AllArgsConstructor
public class CadatroServicos {

	
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
