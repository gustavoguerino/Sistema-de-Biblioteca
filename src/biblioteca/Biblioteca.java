/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// VERIFICAR SE O LIVRO NÃO ESTA INDISPONIVEL ANTES DE REMOVER ELE!
// FAZER UM METODO 
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
	public void cadastrarLivro(String newTitulo, String newAutor, String newIsbn, int newEdicao){

		Livro livro = new Livro();
		livro.setTitulo(newTitulo);
		livro.setAutor(newAutor);
		livro.setISBN(newIsbn);
		livros.add(livro);


	}

	//Metodo para o cadastro de Apostila
	public void cadastrarApostila(String newTitulo, String newAutor){

		Apostila apostila = new Apostila();
		apostila.setTitulo(newTitulo);
		apostila.setAutor(newAutor);
		apostilas.add(apostila);

	}


	//Metodo para cadastro de Textos
	public void cadastrarTexto(String newTitulo, String newAutor){

		Texto texto = new Texto();
		texto.setAutor(newAutor);
		texto.setTitulo(newTitulo);
		textos.add(texto);
	}


	//Aqui o m�todo procura o titulo ou o autor (se for texto) e remove o indice
	//em que o objeto estiver..

	//O loop exclui o primeiro elemento com o titulo ou o autor procurados, o break
	//serve para de executar o loop, para que n�o se remova outros livros com titulos iguais.
	//Removendo livros
        
        
	public void removerLivro(String tituloremov){
		for(int i = 0; i < livros.size(); i++){
			if(livros.get(i).getTitulo().equals(tituloremov)){
				livros.remove(i);
				break;
			}
		}
	}
	//Removendo Apostilas
	public void removerApostila(String tituloremov){
		for(int i = 0; i < apostilas.size(); i++){
			if(apostilas.get(i).getTitulo().equals(tituloremov)){
				apostilas.remove(i);
				break;
			}
		}
	}
	//Removendo Textos
	public void removerTexto(String tituloremov){
		for(int i = 0; i < textos.size(); i++){
			if(textos.get(i).getAutor().equals(tituloremov)){
				textos.remove(i);
				break;
			}
		}
	}




	public boolean logarUsuario(String usuario, String senha) {
		boolean confirm = false;
		for(int i = 0; i<users.size(); i++){
			if((usuario.equals(users.get(i).getUsuario())) && (senha.equals(users.get(i).getSenha()))){
				confirm = true;
				//adicionei um break aqui pra ele parar de procurar o usuario caso j� tenha achado.
				break;
			}

		}
		return confirm;
	}


	//Listar todos os Livros e o status.
	public void listarLivros(){
		for(int i = 0; i<livros.size();i++){
			System.out.println(livros.get(i).getTitulo());
			System.out.println(livros.get(i).isDisponivel());
			System.out.println("---------------------------------------------");
		}
	}
	//Listar todas as apostilas e o status
	public void listarApostilas(){
		for(int i = 0; i<apostilas.size(); i++){
			System.out.println(apostilas.get(i).getTitulo());
			System.out.println(apostilas.get(i).isDisponivel());
			System.out.println("---------------------------------------------");
		}
	}
	//Listar todos os textos e o status
	public void listarTextos(){
		for(int i = 0; i<textos.size(); i++){
			System.out.println(textos.get(i).getAutor());
			System.out.println(textos.get(i).isDisponivel());
			System.out.println("---------------------------------------------");
		}
	}
	//M�todos para pesquisar um item no acervo, o usu�rio bota a op��o e o nome que ele procura
	//o sistema ir� verificar se tem algum autor ou titulo do livro com o nome procurado..
	public int pesquisarAcervo(int item, String elemento){
		int achou = 0;
		if(item == 1){
			for(int i = 0; i<livros.size();i++){
				if((livros.get(i).getAutor().equals(elemento)) || (livros.get(i).getTitulo().equals(elemento))){
				System.out.println("Titulo: " + livros.get(i).getTitulo());
				System.out.println("Autor: " + livros.get(i).getAutor());
				System.out.println("Disponivel: " + livros.get(i).isDisponivel());
				achou += 1;
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getAutor().equals(elemento)) || (apostilas.get(i).getTitulo().equals(elemento))){
				System.out.println("Titulo: " + apostilas.get(i).getTitulo());
				System.out.println("Autor: " + apostilas.get(i).getAutor());
				System.out.println("Disponivel: " + apostilas.get(i).isDisponivel());
				achou += 1;
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getAutor().equals(elemento)) || (textos.get(i).getTitulo().equals(elemento))){
                                System.out.println("Titulo: " + textos.get(i).getTitulo());
                                System.out.println("Autor: " + textos.get(i).getAutor());
                                System.out.println("Disponivel: " + textos.get(i).isDisponivel());
				achou += 1;
				}
			}
		}
		return achou;
	}
	public int escolherItemParaAlugar(int item, String elemento){ //Vai receber o titulo exato do livro, texto ou apostila
                                                                        // só chega a ser chamado se tiver apenas 1 item na busca
		int achou = 0;
		if(item == 1){
			for(int i = 0; i<livros.size();i++){
				if((livros.get(i).getAutor().equals(elemento)) || (livros.get(i).getTitulo().equals(elemento))){
                                    //OBJETO ESCOLHIDO É ESSE
                                    break;
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getAutor().equals(elemento)) || (apostilas.get(i).getTitulo().equals(elemento))){
                                    //OBJETO ESCOLHIDO É ESSE
                                    break;
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getAutor().equals(elemento)) || (textos.get(i).getTitulo().equals(elemento))){
                                    //OBJETO ESCOLHIDO É ESSE
                                    break;
				}
			}
		}
		return achou;
	}	
	public boolean alugarLivro(){
		for(int i = 0; i<livros.size();i++){
			livros.get(i).setDisponivel(false);
		}
                return true;
	}
	
	public boolean alugarApostila(){
		for(int i = 0; i<apostilas.size();i++){
			apostilas.get(i).setDisponivel(false);
		}
                return true;
	}
	
	public boolean alugarTexto(){
		for(int i = 0; i<textos.size();i++){
			textos.get(i).setDisponivel(false);
		}
                return true;
	}

	
	public boolean devolver(){
            return true;
        }

}
