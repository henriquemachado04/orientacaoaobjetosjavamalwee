package br.com.senai.produto;

public class Produto {

	private String nomeDoProduto;
	private double valorDoProduto;
	private double valorUnitarioDoProduto;
	private int quantidadeProduto;
	private double valorTotalDoProduto;

	public Produto() {
		super();
	}

	public Produto(String nomeDoProduto, double valorDoProduto, double valorUnitarioDoProduto, int qunatidadeProduto,
			double valorTotalDoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.valorDoProduto = valorDoProduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getValorDoProduto() {
		return valorDoProduto;
	}

	public void setValorDoProduto(double valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}

	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}

	public void setValorUnitarioDoProduto(int valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
	}

	public int getQuantidadeProduto() {
		return getQuantidadeProduto();
	}

	public void setQunatidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}

	public void setValorTotalDoProduto(int valorTotalDoProduto) {
		this.valorTotalDoProduto = valorTotalDoProduto;
	}
}

