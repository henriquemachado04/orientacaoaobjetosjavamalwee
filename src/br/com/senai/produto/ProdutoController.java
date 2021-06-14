package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu(){
		System.out.println("\n---- M E N U ----");
		System.out.println("1) Qual bebida você gostaria de beber?? ");
		System.out.println("2) Listar bebidas cadastradas");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}

	public Produto cadastrarProduto(){
 		Produto produto = new Produto();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		produto.setNomeDoProduto(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		produto.setQunatidadeProduto(tec.nextInt());

		System.out.print("Informe a altura: ");
		produto.setValorDoProduto(tec.nextDouble());
		
		System.out.print("Informe a sigla do Pais: ");
		produto.setValorTotalDoProduto(tec.nextLine());
		tec.nextLine();

		System.out.print("Informe o nome do seu Estado: ");
		produto.setValorUnitarioDoProduto(tec.nextLine());
		
		
		
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("-----------PESSOAS---CADASTRADAS-----------");
		System.out.println("\n");

		
		System.out.printf ("| %15s | %4s | %5s | %6s | %11s| %4s | %4s | %23s | %30s | %30s | %4s | %30s |\n", "Nome", "Ano", "Idade", "Altura", "Pais", "Sigla do Pais", "Nome do Estado", "Sigla do Estado",
				"Nome da Cidade", "Nome da Rua", "Bairro", "Número da Casa");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %15s | %4d | %5d | %6.2f | %10s | %4s | %15s | %4s | %23s | %30s | %30s | %4s | %30s |\n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSigla(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getSigla(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getNumeroDaCasa(),
					pessoas.get(i).getComplemento());
		}
		return pessoas;
	}
 	
	
	}