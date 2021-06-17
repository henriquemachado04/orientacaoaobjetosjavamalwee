package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("|3 -> Cadastrar Produtos            |");
		System.out.println("|4 -> Lista de Produtos Cadastrados |");
		System.out.println("|5 -> Editar Produto                |");
		System.out.println("|9 -> Sair do Sistema               |");
		System.out.println("-------------------------------------");
		System.out.println("\n");
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("---- Cadastrar Produtos ----");
		System.out.println("\n");

		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeProduto(tec.nextInt());
					
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto()*produto.getQuantidadeProduto());
		
		System.out.println("\n");

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("\n");
		System.out.println("----------------- PRODUTOS CADASTRADOS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %2s | %20s | %20s | %20s | %20s | \n" ,
				"Id","Nome do Produto" , "Valor Unitário" , "Quantidade" , "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2s | %20s | %20s | %20s | %20s | \n" , 
					i,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		System.out.println("\n");
		
		return produtos;
	}
	public List<Produto> editarProduto(List<Produto> produtos) {
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		System.out.println("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt();
		
		System.out.println("1)Informe o nome do produto: ");
		System.out.println("2)Informe o valor unitário do produto: ");
		System.out.println("3)Informe a quantidade do produto: ");
		System.out.print("Informe o campo para ser editado: ");

		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Editar o nome do Produto");
			System.out.println("INforme o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());
			produto.setQuantidadeProduto(produtos.get(idProduto).getQuantidadeProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);
			
			break;
			
		case 2:
			System.out.println("Editar a quantidade do produto");
			break;
		
		case 3:
			System.out.println("Editar valor unitário do produto");
			break;
			
		default:
			System.out.println("Opção Inválida!!");
			break;
			
		}
		return produtos;
	}
}