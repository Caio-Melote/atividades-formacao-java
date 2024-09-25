package br.com.colections.modelos;

public class Smartphone implements Comparable<Smartphone>{
	private Integer id;
	private String serialNumber;
	private String marca;
	private double preco;
	
	//Construtor
	public Smartphone(Integer id, String serialNumber, String marca, double preco) {
		this.id = id;
		this.serialNumber = serialNumber;
		this.marca = marca;
		this.preco = preco;
	}
	
	//Getter
	private Integer getId() {
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
	private void setId(Integer id) {
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
		return "\n\nSmartphone:"
				+ "\nId=" + id 
				+ "\nSerial Number= " + serialNumber 
				+ "\nMarca= " + marca 
				+ "\nPreco= " + preco;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		} else if(this == obj){
//			return true;
//		} else if(this.getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		Smartphone smartphone = (Smartphone) obj;
//
//		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
//	}

	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}

	@Override
	public int compareTo(Smartphone o) {
//		if (this.preco > o.preco) {
//            // Current object is older, return 1
//            return 1;
//        } else if (this.preco < o.preco) {
//            // Current object is younger, return -1
//            return -1;
//        } else {
//            // Ages are the same, return 0
//            return 0;
//        }
		
		int res = this.id.compareTo(o.getId());
		if(res != 0) {
			return this.marca.compareTo(o.marca);
		} else {
			return 0;
		}
		
	}
	
	
	
}	
