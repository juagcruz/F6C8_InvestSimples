package br.com.fiap.investSimples.model;

import java.time.LocalDate;

public class T_cliente {

	private int id;/* INTEGER NOT NULL, */
	private String nome;/* VARCHAR2(20) NOT NULL, */
	private String sobrenome;/* VARCHAR2(60) NOT NULL, */
	private String email;/* VARCHAR2(50) NOT NULL, */
	private String cpf;/* VARCHAR2(15) NOT NULL, */
	private LocalDate dataNascimento;/* DATE, */
	private String cep;/* VARCHAR2(10) NOT NULL, */
	private String endereco;/* VARCHAR2(10), */
	private String complemento_endereco;/* VARCHAR2(30) */

	public T_cliente(int id, String nome, String sobrenome, String email, String cpf, LocalDate dataNascimento,
			String cep, String endereco, String complemento_endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento_endereco = complemento_endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento_endereco() {
		return complemento_endereco;
	}

	public void setComplemento_endereco(String complemento_endereco) {
		this.complemento_endereco = complemento_endereco;
	}

}
