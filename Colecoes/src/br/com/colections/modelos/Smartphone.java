package br.com.colections.modelos;

public class Smartphone {
	private int id;
	private String serialNumber;
	private String marca;
	private double preco;
	
	//Construtor
	public Smartphone(int id, String serialNumber, String marca, double preco) {
		this.id = id;
		this.serialNumber = serialNumber;
		this.marca = marca;
		this.preco = preco;
	}
	
	//Getter
	private int getId() {
		return id;
	}
	
	private String getSerialNumber() {
		return serialNumber;
	}
	
	private String getMarca() {
		return marca;
	}
	
	private double getPreco() {
		return preco;
	}
	
	//Setter
	private void setId(int id) {
		this.id = id;
	}
	
	private void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	private void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Sobrescrita de métodos
	
	@Override
	public String toString() {
		return "\nSmartphone:"
				+ "\nId=" + id 
				+ "\nSerial Number= " + serialNumber 
				+ "\nMarca= " + marca 
				+ "\nPreco= " + preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(this == obj){
			return true;
		} else if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Smartphone smartphone = (Smartphone) obj;

		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}

	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}
	
	
	
}	
