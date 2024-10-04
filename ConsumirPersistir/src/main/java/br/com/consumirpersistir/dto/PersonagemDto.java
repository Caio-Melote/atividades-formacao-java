package br.com.consumirpersistir.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.consumirpersistir.model.Personagem;


public class PersonagemDto {
	
	private Object info;
	private List<Personagem> results = new ArrayList<>();
	
	public PersonagemDto(Object info, Personagem results) {
		super();
		this.info = info;
		this.results.add(results);
	}
	
	public Object getInfo() {
		return info;
	}
	public List<Personagem> getResult() {
		return results;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public void setResult(Personagem results) {
		this.results.add(results);
	}

	@Override
	public String toString() {
		return "DTO: "
				+ "\n Info = " + info 
				+ "\n Result = " + this.results.toString();
	}
	
}
