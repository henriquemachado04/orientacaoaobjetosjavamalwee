package br.com.senai.pessoa;

//CLASSE
public class Endereco extends Cidade {

	//ATRIBUTOS
	private String rua;
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	private String endereco;
	private String casa;
	private String bairro;
	private int numeroDaCasa;
	private String complemento;

	

}
