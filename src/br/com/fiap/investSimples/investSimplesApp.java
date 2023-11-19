package br.com.fiap.investSimples;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.investSimples.model.T_cliente;
import br.com.fiap.investSimples.model.T_entradas;
import dao.EntradasDao;
import jdbcConnection.ConexaoFintech;

public class investSimplesApp {

	public static void main(String[] args) {

		T_entradas entrada = new T_entradas();

		entrada.setTipo("Salario");
		entrada.setDescricao("Salario Ref. Setembro");
//		Date date = new Date();
//		java.sql.Date sqldate = new java.sql.Date(date.getTime());
//		entrada.setDataLancamento();
		entrada.setValor(2500.0);
		entrada.setCliente(1);

		EntradasDao entDao = new EntradasDao(ConexaoFintech.abrirConexao());

		// entDao.gravar(entrada);

		// entDao.buscarEntradaPorId(1);

		List<T_entradas> ent = entDao.listarTodos();

		for (T_entradas selectEntrada : ent) {
			System.out.println(selectEntrada);
		}
		;

	}

}
