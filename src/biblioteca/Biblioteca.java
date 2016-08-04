/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.usuario.Usuario;
import biblioteca.acervo.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author maurodecarvalho
 */
public class Biblioteca implements InterfaceBiblioteca {
	private String nomeBiblioteca = "Biblioteca IFRN";
	//Arrays Lists:
	ArrayList<Usuario> users = new ArrayList<Usuario>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	ArrayList<Texto> textos = new ArrayList<Texto>();
	ArrayList<Apostila> apostilas = new ArrayList<Apostila>();


	Scanner input = new Scanner(System.in);


	public Biblioteca() {
	}

	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
	//Pra que serve isso????????
	public Usuario[] getUsuarios(){
		return users.clone();
	}

	//Metodo para cadastrar de usuario
	public void cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser){
		Usuario user = new Usuario();
		user.setNome(nomeUser);
		user.setEndereco(endUser);
		user.setCpf(cpfUser);
		user.setUsuario(loginUser);
		user.setSenha(senhaUser);
		users.add(user);

	}

	//Metodo para o cadastro de Livro
	public void cadastrarLivro(String newTitulo, String newAutor, String newIsbn, int newEdicao, int newQuantidade){

		Livro livro = new Livro();
		livro.setTitulo(newTitulo);
		livro.setAutor(newAutor);
		livro.setISBN(newIsbn);
		livros.add(livro);
		

	}

	//Metodo para o cadastro de Apostila
	public void cadastrarApostila(String newTitulo, String newAutor, int newQuantidade){

		Apostila apostila = new Apostila();
		apostila.setTitulo(newTitulo);
		apostila.setAutor(newAutor);
		apostila.setQuantidade(newQuantidade);
		apostilas.add(apostila);

	}


	//Metodo para cadastro de Textos
	public void cadastrarTexto(String newAutor){
		
		Texto texto = new Texto();
		texto.setAutor(newAutor);
		textos.add(texto);
	}


	//Removendo livros
	//Poderemos fazer algum outro verificador aqui, mas a melhor saida
	//que eu consegui pensar por enquanto foi essa.
	public void removerLivro(int indice){
		
	}
	//Removendo Apostilas
	public void removerApostila(int indice){
		
	}
	//Removendo Textos
	public void removerTexto(int indice){
		
	}




	public boolean logarUsuario(String usuario, String senha) {
		boolean confirm = false;
		for(int i = 0; i<users.size(); i++){
			if((usuario.equals(users.get(i).getUsuario())) && (senha.equals(users.get(i).getSenha()))){
				confirm = true;
			}
			
		}
		return confirm;
	}

}
