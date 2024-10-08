package br.com.buscacep.modelo;

public class Endereco {

	// Atributos
	private String cep;
	private String rua;
	private String distritos;
	private String cidade;
	private String unidadeFederativa;

	// Construtor
//	public Endereco(String cep, String rua, String distritos, String cidade, String unidadeFederativa) {
//		setCep(cep);
//		setRua(rua);
//		setDistritos(distritos);
//		setCidade(cidade);
//		setUnidadeFederativa(unidadeFederativa);
//	}

	public Endereco(ViaCepRecord enderecoRecord) {
		setCep(enderecoRecord.cep());
		setRua(enderecoRecord.logradouro());
		setDistritos(enderecoRecord.bairro());
		setCidade(enderecoRecord.localidade());
		setUnidadeFederativa(enderecoRecord.estado());
	}
	// Getters
	private String getCep() {
		return cep;
	}


	private String getRua() {
		return rua;
	}

	private String getDistritos() {
		return distritos;
	}

	private String getCidade() {
		return cidade;
	}

	private String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	// Setters
	private void setCep(String cep) {
		this.cep = cep;
	}

	private void setRua(String rua) {
		this.rua = rua;
	}

	private void setDistritos(String distritos) {
		this.distritos = distritos;
	}

	private void setCidade(String cidade) {
		this.cidade = cidade;
	}

	private void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public String toString() {
		return "\nEndereco" + 
				"\nCep : " + cep + 
				"\nRua : " + rua + 
				"\nDistritos : " + distritos + 
				"\nCidade : " + cidade + 
				"\nUnidade Federativa : " + unidadeFederativa + "\n";
	}

}
