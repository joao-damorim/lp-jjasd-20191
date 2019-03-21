package br.com.joao.carro.oo;

public class CarroOO {
	int qtd_rodas;
	String marca;
	String modelo;
	String cor;
	
	public int getQtd_rodas() {
		return qtd_rodas;
	}
	public void setQtd_rodas(int qtd_rodas) {
		this.qtd_rodas = qtd_rodas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void imprimirCarro(CarroOO carro) {
		System.out.println("Meu carro eh um " + carro.getMarca() + " " + carro.getModelo() + " na cor " +
				carro.getCor() + " e tem " + carro.getQtd_rodas() + " rodas.");
	}
}
