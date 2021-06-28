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
		System.out.println("|5 -> Cadastrar Produtos            |");
		System.out.println("|6 -> Lista de Produtos Cadastrados |");
		System.out.println("|7 -> Editar Produto                |");
		System.out.println("|8 -> Excluir produto               |");
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
		produto.setQuantidadeDoProduto(tec.nextInt());

		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

		System.out.println("\n");

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos) {

		if (produtos.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		System.out.println("\n");
		System.out.println("----------------- PRODUTOS CADASTRADOS ---------------");
		System.out.println("\n");

		System.out.printf("| %2s | %20s | %20s | %20s | %20s | \n", "Id", "Nome do Produto", "Valor Unitário",
				"Quantidade", "Valor Total");

		for (int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2s | %20s | %20s | %20s | %20s | \n", i + 1, produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(), produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		System.out.println("\n");

		return produtos;
	}

	public List<Produto> editarProduto(List<Produto> produtos) {
		Produto produto = new Produto();

		listarProdutos(produtos);

		if (produtos.isEmpty()) {
			return null;
		}

		System.out.println("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt() - 1;

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
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

			produtos.set(idProduto, produto);

			break;

		case 2:
			System.out.println("---- Editar a quantidade de produtos cadastrados ----");
			System.out.println("\n");
			System.out.print("Informe novamente a quantidade do produto -> ");
			produto.setQuantidadeDoProduto(tec.nextInt());

			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

			produtos.set(idProduto, produto);

			break;

		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.print("Informe o novo valor unitário do produto: R$");
			produto.setValorUnitarioDoProduto(tec.nextDouble());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

			produtos.set(idProduto, produto);

			break;

		default:
			System.out.println("Opção inválida");

			break;

		}
		return produtos;
	}

	public void excluirProduto(List<Produto> produtos) {

		listarProdutos(produtos);

		if (produtos.isEmpty()) {
			return;
		}

		System.out.println("--- EXCLUIR PRODUTO ---");

		System.out.println("Informe o Id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;

		if (produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		produtos.remove(idProduto);
	}

}
