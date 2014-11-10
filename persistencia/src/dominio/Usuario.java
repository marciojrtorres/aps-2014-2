package dominio;

import java.util.List;

import persistencia.UsuarioDAO;

public class Usuario {

	private Integer id;
	private String nome;
	private String senha;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void save() {
		UsuarioDAO dao = new UsuarioDAO();
		if (this.id == null) {
			dao.save(this);
		} else {
			dao.update(this);
		}
	}

	public static Usuario find(int id) {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.find(id);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha
				+ ", email=" + email + "]";
	}

	public void delete() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.delete(id);
		this.id = null;
	}

	public static List<Usuario> all() {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.findAll();
	}

	
}
