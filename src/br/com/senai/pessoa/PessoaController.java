package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("9) Sair do sistema");
		System.out.println("--------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();

		System.out.println("--- Cadastrar pessoa ---");
		System.out.println("Informe seu nome: ");
		tec.nextLine();
		pessoa.setNome(tec.next());

		System.out.println("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.println("Informe sua altura: ");
		pessoa.setAltura(tec.nextDouble());

		return pessoa;
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %20s | %6s | %5s | %8s |\n", "Nome", "Ano", "Idade", "Altura");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %6d | %5d | %6.2f", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getAltura());
			
			
		}
		
		return pessoas;
	}
	
	
}