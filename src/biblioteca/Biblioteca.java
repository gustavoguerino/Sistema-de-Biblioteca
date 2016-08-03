/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.usuario.Usuario;
import biblioteca.acervo.*;
import java.util.Scanner;
/**
 *
 * @author gustavoguerino
 */
public class Biblioteca implements InterfaceBiblioteca {
	private String nomeBiblioteca = "Biblioteca IFRN";
	//Variavel Global para verificar o indice do array;
	private static int contuser = 0;

	Usuario users[] = new Usuario[100];
	Apostila apostilas[] = new Apostila[100];
	Texto textos[] = new Texto[100];
	Livro livros[] = new Livro[100];

	Scanner input = new Scanner(System.in);


	public Biblioteca() {

	}
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
        public Usuario[] getUsuarios(){
            return users.clone();
        }
       
	//Método para cadastrar de usuário
	public boolean cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser){
                for(int i = 0; i < users.length; i++){
                    if(users[i] != null){
                        if(users[i].getUsuario().equals(loginUser)){
                            return false;
                        }
                    }
                }
                for(int i = 0; i < users.length; i++){
			if(users[i] == null){
				users[i] = new Usuario();
				users[i].setCodUsuario(i);
				users[i].setNome(nomeUser);
				users[i].setEndereco(endUser);
				users[i].setCpf(cpfUser);
				users[i].setUsuario(loginUser);
				users[i].setSenha(senhaUser);
                                return true;
			}
		}
                return false;
	}

	//M�todo para o cadastro de Livro
	public void cadastrarLivro(String newTitulo, String newAutor, String newIsbn, int newEdicao, int newQuantidade){
		for(int i = 0; i < livros.length; i++){
			if(livros[i] == null){
				livros[i] = new Livro();
				livros[i].setTitulo(newTitulo);
				livros[i].setAutor(newAutor);
				livros[i].setISBN(newIsbn);
				livros[i].setQuantidade(newQuantidade);
			}
		}
	}

	//M�todo para o cadastro de Apostila
	public void cadastrarApostila(String newTitulo, String newAutor, int newQuantidade){
		for(int i = 0; i < apostilas.length; i++){
			if(apostilas[i] == null){
				apostilas[i] = new Apostila();
				apostilas[i].setTitulo(newTitulo);
				apostilas[i].setAutor(newAutor);
				apostilas[i].setQuantidade(newQuantidade);
			}
		}
	}


	//M�todo para cadastro de Textos
	public void cadastrarTexto(String newAutor){
		for(int i = 0; i < textos.length; i++){
			if(textos[i] == null){
				textos[i] = new Texto();
				textos[i].setAutor(newAutor);
			}
		}
	}


	//Removendo livros
	//Poderemos fazer algum outro verificador aqui, mas a melhor saida
	//que eu consegui pensar por enquanto foi essa.
	public void removerLivro(int indice){
		livros[indice] = null;
	}
	//Removendo Apostilas
	public void removerApostila(int indice){
		apostilas[indice] = null;
	}
	//Removendo Textos
	public void removerTexto(int indice){
		textos[indice] = null;
	}




	public boolean logarUsuario(String usuario, String senha) {
		//verificador se o login do usuário está válido
		boolean confirm = false;
		//Verificar usuario e senha, retornar true se valido e false se invalido
		for(int i = 0; i < users.length; i++){
			if(users[i] != null){
				if((usuario.equals(users[i].getUsuario())) && (senha.equals(users[i].getSenha()))){
					confirm = true;
				}	
			}
		} 
		return confirm;
	}
	
}
