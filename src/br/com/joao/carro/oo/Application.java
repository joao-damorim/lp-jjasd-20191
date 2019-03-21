package br.com.joao.carro.oo;

public class Application {

	public static void main(String[] args) {
		CarroOO carro = new CarroOO();
		carro.setMarca("Ford");
		carro.setModelo("KA");
		carro.setCor("preta");
		carro.setQtd_rodas(4);
		carro.imprimirCarro(carro);
	}
}
