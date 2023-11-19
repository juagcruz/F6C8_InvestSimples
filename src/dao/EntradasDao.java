package dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.investSimples.model.T_entradas;

public class EntradasDao {

	private Connection conexao;

	public EntradasDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void gravar(T_entradas entrada) {

		String sql = "INSERT INTO T_ENTRADAS (id_entrada, dt_entrada, nr_valor_entrada, nm_tipo_entrada, nm_desc_entrada, t_cliente_id_cliente)"
				+ "VALUES (SQ_ENTRADAS.nextval, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);

			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			ps.setDate(1, data);
			ps.setDouble(2, entrada.getValor());
			ps.setString(3, entrada.getTipo());
			ps.setString(4, entrada.getDescricao());
			ps.setInt(5, entrada.getCliente());

			ps.execute();

			ps.close();
			conexao.close();

			System.out.println("Lançamento de entrada concluído com sucesso.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro de SQL");
		}

	}

	public void excluir(T_entradas entrada) {

	}

	public void atualizar(T_entradas entrada) {

	}

	public List<T_entradas> listarTodos() {

		String sql = "SELECT * FROM T_ENTRADAS ORDER BY id_entrada";
		List<T_entradas> listAllEntradas = null;

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			listAllEntradas = new ArrayList();

			while (rs.next()) {
				T_entradas selectEntrada = new T_entradas();

				selectEntrada.setId(rs.getInt("id_entrada"));
				selectEntrada.setDataLancamento(rs.getDate("dt_entrada"));
				selectEntrada.setValor(rs.getDouble("nr_valor_entrada"));
				selectEntrada.setTipo(rs.getString("nm_tipo_entrada"));
				selectEntrada.setDescricao(rs.getString("nm_desc_entrada"));
				selectEntrada.setCliente(rs.getInt("T_cliente_id_cliente"));
				listAllEntradas.add(selectEntrada);

			}

			ps.close();
			conexao.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro de SQL");
		}

		return listAllEntradas;

	}

	public void buscarEntradaPorId(int id) {

		String sql = "SELECT * FROM T_ENTRADAS WHERE ID_ENTRADA = ?";

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			T_entradas selectEntrada = new T_entradas();
			if (rs.next()) {

				selectEntrada.setId(rs.getInt("id_entrada"));
				selectEntrada.setDataLancamento(rs.getInstance("dt_entrada"));
				selectEntrada.setValor(rs.getDouble("nr_valor_entrada"));
				selectEntrada.setTipo(rs.getString("nm_tipo_entrada"));
				selectEntrada.setDescricao(rs.getString("nm_desc_entrada"));
				selectEntrada.setCliente(rs.getInt("T_cliente_id_cliente"));

			}

			System.out.println(selectEntrada);

			ps.close();
			conexao.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro de SQL");
		}

	}
}
