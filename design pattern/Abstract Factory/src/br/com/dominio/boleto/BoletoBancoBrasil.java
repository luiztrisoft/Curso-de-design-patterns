package br.com.dominio.boleto;

import br.com.dominio.modelo.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BANCO DO BRASIL");
		System.out.println("==========================================================================");
		System.out.println("Descri��o: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValorUnitario());
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("Valor total: R$ " + produto.getValorTotal(imposto));
	}

}
