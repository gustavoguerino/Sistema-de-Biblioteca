package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {
        static Biblioteca biblio; 
        private static boolean pararloop;
        private static int estadomenu;
        private static String strread, strread2, strread3, strread4, strread5, confirmacao;
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
                    } else {
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
                            + "\n11 - Buscar Item"
                            + "\n\nFunções:"
                            + "\nE - Encerrar programa"
                            + "\nT - Trocar de Usuario");
                    strread = read.nextLine();
                    pularlinhas(100);
                    switch (strread) {
                        case "T":
                        case "t":
                            estadomenu = 1;
                            break;
                        case "E":
                        case "e":
                            pararloop = true;
                            break;
                        case "1":
                            System.out.println("SGB - Listando Itens");
                            biblio.listarLivros();
                            break;
                        case "2":
                            System.out.println("SGB - Listando Itens");
                            biblio.listarApostilas();
                            break;
                        case "3":
                            System.out.println("SGB - Listando Itens");
                            biblio.listarTextos();
                            break;
                        case "4":
                            System.out.println("SGB - Listando Usuarios");
                            //Listar os usuarios
                            break;
                        case "5":
                            cadastrar(1);
                            pularlinhas(100);
                            System.out.println("\n\nProcesso de cadastro concluido.");
                            break;
                        case "6":
                            cadastrar(2);
                            pularlinhas(100);
                            System.out.println("\n\nProcesso de cadastro concluido.");
                            break;
                        case "7":
                            cadastrar(3);
                            pularlinhas(100);
                            System.out.println("\n\nProcesso de cadastro concluido.");
                            break;
                        case "8":
                            cadastrar(4);
                            pularlinhas(100);
                            System.out.println("\n\nProcesso de cadastro concluido.");
                            break;
                    }
                    System.out.println("\n\nDigite algo para voltar ao menu.");
                    read.nextLine();
                    
                }
                               
            }
        }
        private static boolean isInt(String str) {
            boolean isInteger = true;
            try {
              int i = Integer.parseInt(str);
            } catch(NumberFormatException nfe) {
               isInteger = false;
            }
            return isInteger;
         }
        private static void cadastrar(int opcao){
            pularlinhas(100);
            boolean concluido = false;
            System.out.println("Digite as informações solicitadas para cadastrar o item:");
            switch (opcao) {
                case 1:
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
                       if(strread.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nTitulo deve possuir mais do que 4 caracteres\n");
                        }else if(strread2.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nAutor deve possuir mais do que 4 caracteres\n");
                        }else if(strread3.length() != 13){        
                            pularlinhas(100);
                            System.out.println("\nISBN deve possuir exatamente 13 caracteres\n");
                        }else if(strread4.length() < 1 || !isInt(strread4)){        
                            pularlinhas(100);
                            System.out.println("\nEdição deve possuir mais do que 1 caracteres\n");
                        } else {
                            System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                            confirmacao = read.nextLine();
                            try {
                                if(!confirmacao.equals("0")){
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
                    }   
                    break;
                case 2:
                    while (concluido == false){
                        //biblio.cadastrarApostila(titulo, autor);
                        System.out.println("\nQual o titulo:");
                        strread = read.nextLine();
                        System.out.println("\nQuem escreveu:");
                        strread2 = read.nextLine();
                        if(strread.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nTitulo deve possuir mais do que 4 caracteres\n");
                        }else if(strread2.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nAutor deve possuir mais do que 4 caracteres\n");
                        } else {
                            System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                            confirmacao = read.nextLine();
                            if(!confirmacao.equals("0")){
                                biblio.cadastrarTexto(strread, strread2);
                                concluido = true;
                            }
                            else{
                                pularlinhas(100);
                            }
                        }
                    }   
                    break;
                case 3:
                    while (concluido == false){
                        //biblio.cadastrarTexto(strread, strread);
                        System.out.println("\nQual o titulo:");
                        strread = read.nextLine();
                        System.out.println("\nQuem escreveu:");
                        strread2 = read.nextLine();
                        if(strread.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nTitulo deve possuir mais do que 4 caracteres\n");
                        }else if(strread2.length() < 5){        
                            pularlinhas(100);
                            System.out.println("\nAutor deve possuir mais do que 4 caracteres\n");
                        } else {
                            System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                            confirmacao = read.nextLine();
                            if(!confirmacao.equals("0")){
                                biblio.cadastrarTexto(strread, strread2);
                                concluido = true;
                            }
                            else{
                                pularlinhas(100);
                            }
                        }
                    }   
                    break;
                case 4:
                    while (concluido == false){
                        //biblio.cadastrarUsuario(nome, endereço, cpf, login, senha);
                        System.out.println("\nNome completo do usuario:");
                        strread = read.nextLine();
                        System.out.println("\nEndereço completo:");
                        strread2 = read.nextLine();
                        System.out.println("\nCPF:");
                        strread3 = read.nextLine();
                        System.out.println("\nLogin:");
                        strread4 = read.nextLine();
                        System.out.println("\nSenha:");
                        strread5 = read.nextLine();

                        if(strread.length() < 10){        
                            pularlinhas(100);
                            System.out.println("\nNome deve possuir mais que 10 caracteres\n");
                        }else if(strread2.length() < 10){        
                            pularlinhas(100);
                            System.out.println("\nEndereço deve possuir mais que 10 caracteres\n");
                        }else if(strread3.length() != 11){        
                            pularlinhas(100);
                            System.out.println("\nCPF deve possuir exatamente 11 caracteres\n");
                        }else if(strread4.length() < 6){
                            pularlinhas(100); 
                            System.out.println("\nLogin deve possuir mais que 6 caracteres\n");
                        }else if(strread5.length() < 6){        
                            pularlinhas(100);
                            System.out.println("\nSenha deve possuir mais que 6 caracteres\n");
                        }
                        else{
                            System.out.println("\n\nConfira os dados acima!\nCaso esteja incorreto, digite 0 para tentar novamente!");
                            confirmacao = read.nextLine();
                            if(!confirmacao.equals("0")){
                                biblio.cadastrarUsuario(strread, strread2, strread3, strread4, strread5);
                                concluido = true;
                            }
                            else{
                                pularlinhas(100);
                            }
                        }
                    }   
                    break; 
            }
        }
        private static void pularlinhas(int linhas){
            for (int x = 0; x < linhas; x++) {
                System.out.println(" ");
            }
        }
    }
