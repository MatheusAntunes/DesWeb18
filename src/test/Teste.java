package test;

import entify.Cliente;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("João");
		cliente.setFormando(false);
		cliente.setAltura(1.80);
		cliente.setCompras(null);
		
		System.out.println(cliente);
	}

}
