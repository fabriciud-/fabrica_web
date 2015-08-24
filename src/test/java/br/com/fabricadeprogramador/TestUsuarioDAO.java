package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	private static Object usuDao;

	public static void main(String[] args) {
		// testCadastrar();
		//testAlterar();
		testExcluir();
	}

	public static void testCadastrar() {
		Usuario usu = new Usuario();

		usu.setNome("Jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");

		// Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		System.out.println("cadastrado");

	}

	public static void testAlterar() {

		Usuario usu = new Usuario();

		usu.setId(3);
		usu.setNome("Jãozão");
		usu.setLogin("jzsao");
		usu.setSenha("1234");

		// alterar usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		System.out.println("alterado");

	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();

		usu.setId(3);
		UsuarioDAO usuDAO	= new UsuarioDAO();
		usuDAO.excluir(usu);
		System.out.println("excluido");
		
	}

}
