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
        public boolean setAdmin(String usuario, boolean status){
            boolean confirm = false;
		for(int i = 0; i<users.size(); i++){
			if(usuario.equals(users.get(i).getUsuario())){
				users.get(i).setAdmin(status);
                                confirm = true;
			}
		}
		return confirm;
        }
        public boolean isAdminLogado(){
            return logado.isAdmin();
        }
        public int listarAtrasados() {
		int itens = 0;
		for(int i = 0; i<users.size(); i++){
			//if((usuario.equals(users.get(i).getUsuario())) && (senha.equals(users.get(i).getSenha()))){
                        if((users.get(i).temAtraso(1))){
                            System.out.println("\n\nUsuario: " + users.get(i).getNome()
                                    + "\nEndereço: " + users.get(i).getEndereco()
                                    + "\nLivro em atraso: " + users.get(i).getLivroarm().getTitulo()
                                    + "\nAutor: "  + users.get(i).getLivroarm().getAutor());
                            itens += 1;
                        }
                        else if((users.get(i).temAtraso(2))){
                            System.out.println("\n\nUsuario: " + users.get(i).getNome()
                                    + "\nEndereço: " + users.get(i).getEndereco()
                                    + "\nTexto em atraso: " + users.get(i).getLivroarm().getTitulo()
                                    + "\nAutor: "  + users.get(i).getLivroarm().getAutor());
                            itens += 1;
                        }
                        else if((users.get(i).temAtraso(3))){
                            System.out.println("\n\nUsuario: " + users.get(i).getNome()
                                    + "\nEndereço: " + users.get(i).getEndereco()
                                    + "\nApostila em atraso: " + users.get(i).getLivroarm().getTitulo()
                                    + "\nAutor: "  + users.get(i).getLivroarm().getAutor());
                            itens += 1;
                        }
		}
                return itens;
	}
	//Listar todos os Livros e o status.
	public void listarLivros(){
		for(int i = 0; i<livros.size();i++){
			System.out.println("\nTitulo: " + livros.get(i).getTitulo());
                        System.out.println("Autor: " + livros.get(i).getAutor());
			System.out.println("Disponivel: " + livros.get(i).isDisponivel());
		}
	}
	//Listar todas as apostilas e o status
	public void listarApostilas(){
		for(int i = 0; i<apostilas.size(); i++){
			System.out.println("\nTitulo: " + apostilas.get(i).getTitulo());
                        System.out.println("Autor: " + apostilas.get(i).getAutor());
			System.out.println("Disponivel: " + apostilas.get(i).isDisponivel());
		}
	}
	//Listar todos os textos e o status
	public void listarTextos(){
		for(int i = 0; i<textos.size(); i++){
			System.out.println("\nTitulo: " + textos.get(i).getAutor());
                        System.out.println("Autor: " + textos.get(i).getAutor());
			System.out.println("Disponivel: " + textos.get(i).isDisponivel());;
		}
	}
        public void listarUsuarios(){
            for(int i = 0; i<users.size(); i++){
                System.out.println("\nNome: " + users.get(i).getNome()
                        + "\nUsuario: " + users.get(i).getUsuario()
                        + "\nEndereço: " + users.get(i).getEndereco());
            }
        }
	//M�todos para pesquisar um item no acervo, o usu�rio bota a op��o e o nome que ele procura
	//o sistema ir� verificar se tem algum autor ou titulo do livro com o nome procurado..
	public int pesquisarAcervo(int item, String elemento){
		int achou = 0;
		if(item == 1){
			for(int i = 0; i<livros.size();i++){
				if((livros.get(i).getAutor().equalsIgnoreCase(elemento)) || (livros.get(i).getTitulo().equalsIgnoreCase(elemento))){
					System.out.println("Titulo: " + livros.get(i).getTitulo());
					System.out.println("Autor: " + livros.get(i).getAutor());
					System.out.println("Disponivel: " + livros.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getAutor().equalsIgnoreCase(elemento)) || (apostilas.get(i).getTitulo().equalsIgnoreCase(elemento))){
					System.out.println("Titulo: " + apostilas.get(i).getTitulo());
					System.out.println("Autor: " + apostilas.get(i).getAutor());
					System.out.println("Disponivel: " + apostilas.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getAutor().equalsIgnoreCase(elemento)) || (textos.get(i).getTitulo().equalsIgnoreCase(elemento))){
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
				if((livros.get(i).getTitulo().equalsIgnoreCase(elemento))){
					System.out.println("Titulo: " + livros.get(i).getTitulo());
					System.out.println("Autor: " + livros.get(i).getAutor());
					System.out.println("Disponivel: " + livros.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 2){
			for(int i = 0; i<apostilas.size();i++){
				if((apostilas.get(i).getTitulo().equalsIgnoreCase(elemento))){
					System.out.println("Titulo: " + apostilas.get(i).getTitulo());
					System.out.println("Autor: " + apostilas.get(i).getAutor());
					System.out.println("Disponivel: " + apostilas.get(i).isDisponivel());
					achou += 1;
				}
			}
		}
		if(item == 3){
			for(int i = 0; i<textos.size();i++){
				if((textos.get(i).getTitulo().equalsIgnoreCase(elemento))){
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
					//seta o dia q o usuario alugou o livro
					livros.get(i).diaAlugado();
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
					//Seta o dia que o usuario alugou o livro
					apostilas.get(i).diaAlugado();
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
					//seta o dia que o usuario alugou o texto
					textos.get(i).diaAlugado();
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

	//Metodo de devolução, chama devolver(0); para listar os livros se existir, retorna a quantidade de item
        //depois basta passar devolver(opção), deve se autenticar o usuario que esta devolvendo antes de usar.
        //Sem autenticação retorna -1
        
        //Metodo de verificação de atrasos
        //Opcao 1 = Livro, 2 = Texto, 3 = Apostila
        //boolean temAtraso(int opcao)
	public int devolver(int opcao){
            int retorno = 0, contador = 1;
		if(alugando == null)
                    return -1;
                else{
                    if(opcao == 0){
                        if(alugando.isPossuiTextoAlugado()){
                            System.out.println(contador++ + " " + alugando.getTextoarm().getTitulo() + " - " 
                                    + alugando.getTextoarm().getAutor());
                            if(alugando.temAtraso(2)){
                                System.out.println("Passou do prazo de 15 dias para devolução. (COBRAR)\n");
                            }
                            else{
                                System.out.println("\n");
                            }
                            retorno += 1;
                        }
                        if(alugando.isPossuiLivroAlugado()){
                            System.out.println(contador++ + " " + alugando.getLivroarm().getTitulo() + " - " 
                                    + alugando.getLivroarm().getAutor());
                            if(alugando.temAtraso(1)){
                                System.out.println("Passou do prazo de 15 dias para devolução. (COBRAR)\n");
                            }
                            else{
                                System.out.println("\n");
                            }
                            retorno += 1;
                        }
                        if(alugando.isPossuiApostilaAlugada()){
                            System.out.println(contador++ + " " + alugando.getApostilaarm().getTitulo() + " - " 
                                    + alugando.getApostilaarm().getAutor());
                            if(alugando.temAtraso(3)){
                                System.out.println("Passou do prazo de 15 dias para devolução. (COBRAR)\n");
                            }
                            else{
                                System.out.println("\n");
                            }
                            retorno += 1;
                        }
                    }
                    else if(opcao == 1){
                        if(alugando.isPossuiTextoAlugado()){
                            alugando.getTextoarm().setDisponivel(true);
                            alugando.setPossuiTextoAlugado(false);
                            return 1;
                        }
                        else if(alugando.isPossuiLivroAlugado()){
                            alugando.getLivroarm().setDisponivel(true);
                            alugando.setPossuiLivroAlugado(false);
                            return 1;
                        }
                        else if(alugando.isPossuiApostilaAlugada()){
                            alugando.getApostilaarm().setDisponivel(true);
                            alugando.setPossuiApostilaAlugada(false);
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                    else if(opcao == 2){
                        int itemadevolver = 0;
                        if(alugando.isPossuiTextoAlugado()){
                            itemadevolver += 1;
                            return 1;
                        }
                        if((itemadevolver == 0) && (alugando.isPossuiLivroAlugado())){
                            alugando.getLivroarm().setDisponivel(true);
                            alugando.setPossuiLivroAlugado(false);
                            return 1;
                        }
                        else if(alugando.isPossuiApostilaAlugada()){
                            alugando.getApostilaarm().setDisponivel(true);
                            alugando.setPossuiApostilaAlugada(false);
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                    else if(opcao == 3){
                        if(alugando.isPossuiApostilaAlugada()){
                            alugando.getApostilaarm().setDisponivel(true);
                            alugando.setPossuiApostilaAlugada(false);
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                }
		return retorno;
	}
    public boolean podeAlugar(String usuario) {
        for(int i = 0; i<users.size(); i++){
            if(usuario.equals(users.get(i).getUsuario())){
                if(users.get(i).temAtraso(1)){
                    return false;
                }
                else if(users.get(i).temAtraso(2)){
                    return false;
                }
                else if(users.get(i).temAtraso(3)){
                    return false;
                }
		break;
            }
        }
        return true;
    }
}
