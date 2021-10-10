package model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CadastroCatagorias")
@NoArgsConstructor
@AllArgsConstructor
public class CadastroCatagorias {

	@Getter
	@Setter
	private String nome;
	
	
	
}
