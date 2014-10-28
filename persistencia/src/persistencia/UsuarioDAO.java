package persistencia;

import dominio.Usuario;

import java.sql.*;

public class UsuarioDAO {

	private static final 
		String URL = "jdbc:mysql://127.0.0.1/tadswitter";
	private static final 
		String USERNAME = "root";
	private static final 
		String PASSWORD = "root";
	
	public void save(Usuario usuario) {		
		try {
			
			Connection conexao = 
				DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "INSERT INTO usuarios (nome, senha, email) "
					   + "VALUES (?, md5(?), ?)";
			
			PreparedStatement comando = conexao.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);
			
			comando.setString(1, usuario.getNome());
			comando.setString(2, usuario.getSenha());
			comando.setString(3, usuario.getEmail());
			
			if (comando.executeUpdate() != 1) {
				throw new PersistenciaException(
						"usuario nao salvo");
			}
			
			ResultSet chave = comando.getGeneratedKeys();
			chave.next();
			usuario.setId(chave.getInt(1));
			
			conexao.close(); // conexões são finitas
			
		} catch (SQLException e) {
			throw new PersistenciaException(
					"nao foi possivel salvar", e);
		}
	}
}
