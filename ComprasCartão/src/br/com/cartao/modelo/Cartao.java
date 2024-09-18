package br.com.cartao.modelo;

public class Cartao {
	
	private double limite;
	
	//construtor
	public Cartao (double limite) {
		setLimite(limite);
	}
	
	//getter
	public double getLimite() {
		return limite;
	}
	
	//setter
	private void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	//Método 
	public boolean registraCompra(Compras compra) {
		if (compra.getValor() <= limite) {
			this.limite -= compra.getValor();
			return true;
		} else {
			return false;
		}
	}
	
}
