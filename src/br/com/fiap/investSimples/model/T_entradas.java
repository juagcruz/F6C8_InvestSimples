package br.com.fiap.investSimples.model;

import java.util.Date;

public class T_entradas {

	private int id; /* INTEGER NOT NULL, */
	private Date dataLancamento; /* DATE NOT NULL, */
	private double valor;/* NUMBER(10,2) NOT NULL, */
	private String tipo;/* VARCHAR2(40), */
	private String descricao;/* VARCHAR2(100), */
	private int cliente;/* INTEGER NOT NULL */

	public T_entradas() {
		super();
	}
	
	public T_entradas(int id, Date dataLancamento, double valor, String tipo, String descricao, int cliente) {
		super();
		this.id = id;
		this.dataLancamento = dataLancamento;
		this.valor = valor;
		this.tipo = tipo;
		this.descricao = descricao;
		this.cliente = cliente;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "T_entradas [id: " + id + ", dataLancamento: " + dataLancamento + ", valor: " + valor + ", tipo: "
				+ tipo + ", descricao: " + descricao + ", cliente: " + cliente + "]";
	}

}
