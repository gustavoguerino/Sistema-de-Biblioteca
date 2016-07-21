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
    boolean cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser);
    void cadastrarLivro(String newTitulo, String newAutor, String newIsbm, int newEdicao, int newQuantidade);
    void cadastrarApostila(String newTitulo, String newAutor, int newQuantidade);
    void cadastrarTexto(String newAutor);
    public void removerLivro(int indice);
	public void removerApostila(int indice);
	public void removerTexto(int indice);
} 
