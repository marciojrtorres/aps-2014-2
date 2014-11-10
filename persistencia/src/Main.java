import java.util.List;

import dominio.Usuario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("persistencia");
		
		Usuario u = new Usuario(); // transitório
		Integer id = u.getId();    // NULL
		System.out.println(id);
		
		u.setNome("usuario");
		u.setSenha("1234");
		u.setEmail("usuario@u.com");
			
		u.save(); // o objeto do domínio
		          // tem o método de persistência
		          // caracteriza o padrão ActiveRecord
		System.out.println(u.getId()); // vem um ID
		
		// load, pressupoe que o id existe 
		// find, pressupoe que existe ou nao
		Usuario u2 = Usuario.find(2);
		System.out.println(u2);
		
		u2.setNome("Nome alterado");
		
		u2.save();
		
		// u2.delete();
		
		List<Usuario> todos = Usuario.all();
		
		for (Usuario cadaUm : todos) {
			System.out.println(cadaUm);
		}
		
	}

}
