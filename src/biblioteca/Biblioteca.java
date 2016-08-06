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


	Usuario logado, alugando;


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
				logado = users.get(i);
				break;
			}

		}
		return confirm;
	}
        public boolean usuarioExiste(String usuario) {
		boolean confirm = false;
		for(int i = 0; i<users.size(); i++){
			if(usuario.equals(users.get(i).getUsuario())){
				confirm = true;
				break;
			}

		}
		return confirm;
	}
        public boolean autenticarAlugar(String usuario, String senha) {
		boolean confirm = false;
		for(int i = 0; i<users.size(); i++){
			if((usuario.equals(users.get(i).getUsuario())) && (senha.equals(users.get(i).getSenha()))){
				confirm = true;
				alugando = users.get(i);
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
        public int pesquisarAluguel(int item, String elemento){
		int achou = 0;
		if(item == 1){
			for(int i = 0; i<livros.size();i++){
				if((livros.get(i).getTitulo().equals(elemento))){
					System.out.println("Titulo: " + livros.get(i).getTitulo());
					System.out.println("Autor: " + livros.get(i).getAutor());
					System.out.println("Disponivel: " + livros.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getTitulo().equals(elemento))){
					System.out.println("Titulo: " + apostilas.get(i).getTitulo());
					System.out.println("Autor: " + apostilas.get(i).getAutor());
					System.out.println("Disponivel: " + apostilas.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getTitulo().equals(elemento))){
					System.out.println("Titulo: " + textos.get(i).getTitulo());
					System.out.println("Autor: " + textos.get(i).getAutor());
					System.out.println("Disponivel: " + textos.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		return achou;
	}
	public int disponivelAlugar(int item, String elemento){
		int achou = 0;
		if(item == 1){
			for(int i = 0; i<livros.size();i++){
				if((livros.get(i).getTitulo().equals(elemento))){
					if(livros.get(i).isDisponivel() == true){
                                           achou += 1; 
                                        }
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getTitulo().equals(elemento))){
					if(apostilas.get(i).isDisponivel() == true){
                                            achou += 1;
                                        }
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getTitulo().equals(elemento))){
                                    if(textos.get(i).isDisponivel() == true){
                                        achou += 1;
                                    }
				}
			}
		}
		return achou;
	}
	
	//Logica pai-mei da bahia de alugar um livro.. xD
	public boolean alugarLivro(String itemproc){
		boolean verificador = false;
                System.out.println("ponto 5");
		for(int i = 0; i<livros.size();i++){
                     System.out.println("ponto 6");
                        if(alugando == null){
                            System.out.println("Alugando = null");
                            return verificador;   
                        }
                        else if(((livros.get(i).getTitulo().equals(itemproc))) && (livros.get(i).isDisponivel() == true)){
                            System.out.println("ponto 2"); 
                            if((alugando.isPossuiLivroAlugado()!=true)){
						//o livro fica indisponivel
						livros.get(i).setDisponivel(false);
						//o usuario nao vai poder pegar outro item desse tipo
						alugando.setPossuiLivroAlugado(true);
						//o livro que ele pegou vai ser jogado para o metodo que ira manipular as funcoes de livro, como a data de aluguel e devolucao
						alugando.livroAlugado(livros.get(i));
						//confirma que o usuario conseguiu alugar o livro
						verificador = true;
						//depois voce confirma se ele sai do loop apartir daqui, o break acho q nao da muito certo.
                                                alugando = null; //Limpa o alugando para evitar fraudes
                                                 System.out.println("ponto 3");
						return verificador;
                            }
			}
		}
		return verificador;
	}

	public boolean alugarApostila(String itemproc){
		boolean verificador = false;
		for(int i = 0; i<apostilas.size();i++){
			if(alugando == null){
                            return verificador;
                        }
                        else if(((apostilas.get(i).getTitulo().equals(itemproc))) && (apostilas.get(i).isDisponivel() == true)){
					if((alugando.isPossuiApostilaAlugada()!=true)){
						//a apostila fica indisponivel
						apostilas.get(i).setDisponivel(false);
						//o usuario nao pode pegar mais nenhum item desse tipo
						alugando.setPossuiApostilaAlugada(true);
						//verificador de que conseguiu alugar o livro
						verificador = true;
						//adiciona a apostila ao metodo que ira manipular as funcoes da apostila, como data de aluguel e devolucao
						alugando.apostilaAlugada(apostilas.get(i));
						//depois voce confirma se ele sai do loop apartir daqui, o break acho q nao da muito certo.
                                                alugando = null; //Limpa o alugando para evitar fraudes
						return verificador;
                                                
					}
			}
		}
		return verificador;
	}

	public boolean alugarTexto(String itemproc){
		boolean verificador = false;
		for(int i = 0; i<textos.size();i++){
			if(alugando == null){
                            return verificador;
                        }
                        else if(((textos.get(i).getTitulo().equals(itemproc))) && (textos.get(i).isDisponivel() == true)){
					if((alugando.isPossuiTextoAlugado()!=true)){
						//o texto fica indisponivel para aluguel
						textos.get(i).setDisponivel(false);
						//o usuario nao vai poder alugar nenhum item desse tipo
						alugando.setPossuiTextoAlugado(true);
						//verificador de que conseguiu alugar a apostila
						verificador = true;
						//adiciona o livro para o metodo que ira manipular as funcoes de texto, como data de aluguel e de devolucao
						alugando.textoAlugado(textos.get(i));
						//depois voce confirma se ele sai do loop apartir daqui, o break acho q nao da muito certo.
                                                alugando = null; //Limpa o alugando para evitar fraudes
						return verificador;
					}
			}
		}
		return verificador;
	}

	//Devolucao de um livro
	public boolean devolver(){
		return true;
	}
}
