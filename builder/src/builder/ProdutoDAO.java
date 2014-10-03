package builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {

	public void insert(Produto prod) throws SQLException {
		// JDBC: Java Data Base Conectivity
		// java.sql ou javax.sql
		
		// conecta
		Connection conexao = DriverManager
	.getConnection("jdbc:mysql://localhost/builder", "root", "root");
		// URL: jdbc:sgbd://maquina/nomedobanco
	
		// comando:
		Statement comando = conexao.createStatement();
		
		String sql = "INSERT INTO produtos (descricao, peso) VALUES ('" + prod.getDescricao() + "', " + prod.getPeso() + ")";
		
		System.out.println(sql); // debug
		
		comando.execute(sql);
		
		// desconecta
		conexao.close();
	}

}
