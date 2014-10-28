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
				
	}

}
