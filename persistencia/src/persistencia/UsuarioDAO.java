package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dominio.Usuario;

// CRUD 
// Create = Criar/Insert
// Read = Consultar/Select
// Update = Atualizar/Update
// Delete = Excluir/Delete

public class UsuarioDAO {

	private static final String URL = "jdbc:mysql://127.0.0.1/tadswitter";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public void save(Usuario usuario) {
		Connection conexao = null;
		try {

			conexao = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);

			String sql = "INSERT INTO usuarios (nome, senha, email) "
					+ "VALUES (?, md5(?), ?)";

			PreparedStatement comando = conexao.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);

			comando.setString(1, usuario.getNome());
			comando.setString(2, usuario.getSenha());
			comando.setString(3, usuario.getEmail());

			if (comando.executeUpdate() != 1) {
				throw new PersistenciaException("usuario nao salvo");
			}

			ResultSet chave = comando.getGeneratedKeys();
			chave.next();
			usuario.setId(chave.getInt(1));			

		} catch (SQLException e) {
			throw new PersistenciaException("nao foi possivel salvar", e);
		} finally {
			try {
				if (conexao != null) {
					if (!conexao.isClosed()) {
						conexao.close();
					}
				}
			} catch (SQLException e) {
				throw new PersistenciaException("nao foi possivel fechar", e);
			}
		} 
	}

	public Usuario find(int id) {
		Connection conexao = null;
		
		try {
			conexao = 
				DriverManager.getConnection(URL, USERNAME,
					PASSWORD);
			// concatenar sql 
			// torna vulneravel a ataques de SQL Injection
			String sql = 
				"select * from usuarios where id_usuario = ?";
			// parâmetro parametrizado
			PreparedStatement comando = conexao.prepareStatement(sql);

			comando.setInt(1, id);
			
			ResultSet rs = comando.executeQuery(); // consulta/select
			
			if (rs.next()) {
				Usuario u = new Usuario();
				u.setId(id);
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setSenha(rs.getString("senha"));				
				return u;
			}
			
		} catch (SQLException e) {
			throw new PersistenciaException("nao foi possivel salvar", e);
			
		} finally {
			try {
				if (conexao != null) {
					if (!conexao.isClosed()) {
						conexao.close();
					}
				}
			} catch (SQLException e) {
				throw new PersistenciaException("nao foi possivel fechar", e);
			}
		}
		
		return null;
	}

	public void update(Usuario usuario) {
		Connection conexao = null;
		try {

			conexao = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);

			String sql = "UPDATE usuarios SET nome = ?, senha = ?, email = ? WHERE id_usuario = ?";

			PreparedStatement comando = 
					conexao.prepareStatement(sql);

			comando.setString(1, usuario.getNome());
			comando.setString(2, usuario.getSenha());
			comando.setString(3, usuario.getEmail());
			comando.setInt(4, usuario.getId());

			if (comando.executeUpdate() != 1) {
				throw new PersistenciaException("usuario nao atualizado");
			}

		} catch (SQLException e) {
			throw new PersistenciaException("nao foi possivel atualizar", e);
		} finally {
			try {
				if (conexao != null) {
					if (!conexao.isClosed()) {
						conexao.close();
					}
				}
			} catch (SQLException e) {
				throw new PersistenciaException("nao foi possivel fechar", e);
			}
		}
	}

	public void delete(int id) {
		Connection conexao = null;
		try {

			conexao = 
				DriverManager.getConnection(URL, USERNAME,
					PASSWORD);

			String sql = "DELETE FROM usuarios WHERE id_usuario = ?";

			PreparedStatement comando = 
					conexao.prepareStatement(sql);

			comando.setInt(1, id);
			
			if (comando.executeUpdate() != 1) {
				throw new PersistenciaException("usuario nao excluido");
			}

		} catch (SQLException e) {
			throw new PersistenciaException("nao foi possivel excluir", e);
		} finally {
			try {
				if (conexao != null) {
					if (!conexao.isClosed()) {
						conexao.close();
					}
				}
			} catch (SQLException e) {
				throw new PersistenciaException("nao foi possivel fechar", e);
			}
		}
	}

	public List<Usuario> findAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Connection conexao = null;
		try {

			conexao = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);

			String sql = "SELECT * FROM usuarios";

			PreparedStatement comando = 
					conexao.prepareStatement(sql);
			
			ResultSet rs = comando.executeQuery();
			
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id_usuario"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setSenha(rs.getString("senha"));
				usuarios.add(u);
			}

			
			
		} catch (SQLException e) {
			throw new PersistenciaException("nao foi possivel consultar", e);
		} finally {
			try {
				if (conexao != null) {
					if (!conexao.isClosed()) {
						conexao.close();
					}
				}
			} catch (SQLException e) {
				throw new PersistenciaException("nao foi possivel fechar", e);
			}
		}
		
		return usuarios;
	}
	
	
}
