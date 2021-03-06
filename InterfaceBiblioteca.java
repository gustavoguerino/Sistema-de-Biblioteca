/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author gustavoguerino
 */
public interface InterfaceBiblioteca {
    boolean logarUsuario(String usuario, String senha);
    void cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser);
    void cadastrarLivro(String newTitulo, String newAutor, String newIsbm, int newEdicao);
    void cadastrarApostila(String newTitulo, String newAutor);
    void cadastrarTexto(String newTitulo, String newAutor);
    void removerLivro(String tituloremov);
	void removerApostila(String tituloremov);
	void removerTexto(String tituloremov);
	void listarLivros();
	void listarTextos();
	void listarApostilas();
	boolean pesquisarAcervo(int item, String elemento);
	
} 
