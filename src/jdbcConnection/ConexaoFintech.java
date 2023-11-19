package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFintech {

	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private static final String USER = "rm99073";
	private static final String PASS = "280585";

	public static Connection abrirConexao() {

		Connection conexao = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection(URL, USER, PASS);

			System.out.println("Conectado com sucesso!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Classe não encontrada");
			/* e.printStackTrace(); */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			/* e.printStackTrace(); */
			System.out.println("Erro de conexão");
		}

		return conexao;
	}

}
