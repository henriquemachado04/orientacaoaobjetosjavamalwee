package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		PessoaController pessoacontroller = new PessoaController();

		boolean sair = false;

		do {
			pessoacontroller.menu();

			int opcao = pessoacontroller.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoacontroller.cadastrarPessoa());
				break;

			case 2:
				pessoacontroller.listarPessoas(pessoas);
				break;
				
			case 9:
				sair = true;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (!sair);

		System.out.println("Sistema finalizado");

	}
}
