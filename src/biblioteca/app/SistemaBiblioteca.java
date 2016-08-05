package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {
        static Biblioteca biblio; 
        private static boolean pararloop;
        private static int estadomenu;
        private static String strread, strread2, strread3, strread4, confirmacao;
        private static Scanner read = new Scanner(System.in); 
                
                
	public static void main(String[] args) {
            biblio = new Biblioteca(); 
            pararloop = false;
            estadomenu = 1;
            biblio.cadastrarUsuario("Gustavo Guerino", "Rua Logo Ali", "34348227802", "teste", "123456");
            biblio.cadastrarLivro("Um dia que foi noite", "Carinha da Esquina", "123456-12", 1);
            biblio.cadastrarLivro("Um dia que foi noite 2", "Carinha da Esquina", "123456-13", 2);
            biblio.cadastrarLivro("Um dia que foi noite 3", "Carinha da Esquina", "123456-14", 3);
            //Loop Principal:
           
            while (!pararloop) {
                pularlinhas(100);
                System.out.println("SGB  -  Entrada\n");
                while(estadomenu == 1){
                    System.out.println("Login: \n");
                    strread = read.nextLine();  
                    
                    pularlinhas(100);
                    System.out.println("SGB  -  Entrada\n");
                    System.out.println("Senha: \n");
                    strread2 = read.nextLine();
                    
                    if(biblio.logarUsuario(strread, strread2)){
                        estadomenu = 2;
                    } 
                    else
                    {
                        pularlinhas(100);
                        System.out.println("SGB  -  Entrada\n"); 
                        System.out.println("Senha e/ou Usuario incorreto! Tente novamente.\n");
                    }                            
                }
                while(estadomenu == 2){
                    pularlinhas(100);
                    System.out.println("SGB  -  Menu Principal"
                            + "\n\nListagens:"
                            + "\n1 - Livros"//
                            + "\n2 - Apostilas"//
                            + "\n3 - Textos"//
                            + "\n4 - Usuarios"//
                            + "\n\nCadastros:"
                            + "\n5 - Livros"//
                            + "\n6 - Apostilas"//
                            + "\n7 - Textos"//
                            + "\n8 - Usuarios"//
                            + "\n\nFunções Basicas:"
                            + "\n9 - Alugar Item"
                            + "\n10 - Pagar Emprestimo"
                            + "\n\nFunções:"
                            + "\nE - Encerrar programa"
                            + "\nT - Trocar de Usuario");
                    strread = read.nextLine();
                    pularlinhas(100);
                    switch (strread) {
                        default:
                            System.out.println("SGB - Listando Itens");
                            
                        case "1":
                            biblio.listarLivros();
                            break;
                        case "2":
                            biblio.listarApostilas();
                            break;
                        case "3":
                            biblio.listarTextos();
                            break;
                        case "4":
                            //Listar os usuarios
                            break;
                        case "5":
                            cadastrar(1);
                            pularlinhas(100);
                            System.out.println("\n\nProcesso de cadastro concluido.");
                            break;
                    }
                    System.out.println("\n\nDigite algo para voltar ao menu.");
                    read.nextLine();
                    
                }
                               
            }
        }
        private static boolean cadastrar(int opcao){
            pularlinhas(100);
            boolean concluido = false;
            System.out.println("Digite as informações solicitadas para cadastrar o item:");
            if(opcao == 1){
                while (concluido == false){
                    //biblio.cadastrarLivro(autor, autor, isbn, edicao);
                    System.out.println("\nQual o titulo:");
                    strread = read.nextLine();
                    System.out.println("\nQuem escreveu:");
                    strread2 = read.nextLine();
                    System.out.println("\nQual o ISBN:");
                    strread3 = read.nextLine();
                    System.out.println("\nQual a edição:");
                    strread4 = read.nextLine();
                    System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                    confirmacao = read.nextLine();
                    try {
                        if(confirmacao != "0"){
                            biblio.cadastrarLivro(strread, strread2, strread3,  Integer.parseInt(strread4));
                            concluido = true;
                        }
                        else{
                            pularlinhas(100);
                        }
                    } catch (NumberFormatException nfe) {
                        pularlinhas(100);
                        System.out.println("\nSomente numeros são aceitos no campo edição, tente novamente!\n");
                    }
                }
            }else if(opcao == 2){
                while (concluido == false){
                    //biblio.cadastrarApostila(titulo, autor);
                    System.out.println("\nQual o titulo:");
                    strread = read.nextLine();
                    System.out.println("\nQuem escreveu:");
                    strread2 = read.nextLine();
                    System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                    confirmacao = read.nextLine();
                    if(confirmacao != "0"){
                        biblio.cadastrarApostila(strread, strread2);
                        concluido = true;
                    }
                    else{
                        pularlinhas(100);
                    }
                }
            }else if(opcao == 3){
                while (concluido == false){
                    //biblio.cadastrarTexto(strread, strread);
                    System.out.println("\nQual o titulo:");
                    strread = read.nextLine();
                    System.out.println("\nQuem escreveu:");
                    strread2 = read.nextLine();
                    System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                    confirmacao = read.nextLine();
                    if(confirmacao != "0"){
                        biblio.cadastrarTexto(strread, strread2);
                        concluido = true;
                    }
                    else{
                        pularlinhas(100);
                    }
                }                
            }
            return true;
        }
        private static void pularlinhas(int linhas){
            for (int x = 0; x < linhas; x++) {
                System.out.println(" ");
            }
        }
    }
