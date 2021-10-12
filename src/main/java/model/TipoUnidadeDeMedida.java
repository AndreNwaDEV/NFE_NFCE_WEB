package model;

import lombok.Getter;

public enum TipoUnidadeDeMedida {

	AMPOLA("Ampola"),
	BALDE("Balde"),
	BANDEJA("Bandeja"),
	BARRA("Barra"),
	BISNAGA("Bisnaga"),
	BLOCO("Bloco"),
	BOBINA("Bobina"),
	CAPSULA("Capsula"),
	CARTELA("Cartela"),
	CENTO("Cento"),
	CONJUNTO("Conjunto"),
	CENTIMETRO("Centimetro"),
	CENTIMETRO_QUADRADO("Centimetro Quadrado"),
	CAIXA("Caixa"),
	CAIXA_COM_2_UNIDADES("Caixa com 2 Unidades"),
	CAIXA_COM_3_UNIDADES("Caixa com 3 Unidades"),
	CAIXA_COM_5_UNIDADES("Caixa com 5 Unidades"),
	CAIXA_COM_10_UNIDADES("Caixa com 10 Unidades"),
	CAIXA_COM_20_UNIDADES("Caixa com 20 Unidades"),
	CAIXA_COM_25_UNIDADES("Caixa com 25 Unidades"),
	CAIXA_COM_50_UNIDADES("Caixa com 50 Unidades"),
	CAIXA_COM_100_UNIDADES("Caixa com 100 Unidades"),
	DISPLAY("Display"),
	DUZIA("Duzia"),
	EMBALAGEM("Embalagem"),
	FARDO("Fardo"),
	FOLHA("Folha"),
	FRASCO("Frasco"),
	GALAO("Galão"),
	GARRAFA("Garrafa"),
	GRAMAS("Gramas"),
	JOGO("Jogo"),
	QUILOGRAMA("Quilograma"),
	KIT("Kit"),
	LATA("Lata"),
	LITRO("Litro"),
	METRO("Metro"),
	METRO_QUADRADO("Metro Quadrado"),
	METRO_CUBICO("Metro Cubico"),
	MILHEIRO("Milheiro"),
	MILILITRO("Mililitro"),
	MEGAWATT_HORA("Megawatt Hora"),
	PACOTE("Pacote"),
	PALETE("Palete"),
	PARES("Pares"),
	QUILATES("Quilates"),
	RESMA("Resma"),
	ROLO("Rolo"),
	SACOLA("Sacola"),
	TAMBOR("Tambor"),
	TANQUE("Tanque"),
	TONELADA("Tonelada"),
	TUBO("Tubo"),
	UNIDADE("Unidade"),
	VASILHAME("Vazilhame"),
	VIDRO("Vidro"),
	
	;
	
	@Getter
	private String TipoUnidadeDeMedida;
	
	
	private TipoUnidadeDeMedida(String TipoUnidadeDeMedida) {
		this.TipoUnidadeDeMedida = TipoUnidadeDeMedida;
	}
	
	
}
