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
            biblio.setAdmin("teste", true);
            biblio.cadastrarLivro("Um dia que foi noite", "Carinha da Esquina", "9788578270698", 1);
            biblio.cadastrarLivro("Um dia que foi noite 2", "Carinha da Esquina", "9788578270698", 2);
            biblio.cadastrarLivro("Um dia que foi noite 3", "Carinha da Esquina", "9788578270698", 3);
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
                    if(biblio.isAdminLogado()){
                        System.out.println("SGB  -  Menu Administrativo"
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
                                + "\n10 - Devolução de Item"
                                + "\n11 - Buscar Item"
                                + "\n12 - Remoção de Item"
                                + "\n13 - Ver devoluções atrasadss"
                                + "\n\nFunções:"
                                + "\nE - Encerrar programa"
                                + "\nT - Trocar de Usuario"
                                + "\nD - Conceder acesso administrativo"
                                + "\nR - Remover acesso administrativo");
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
                            case "D":
                            case "d":
                                System.out.println("\nDigite o usuario que ira receber acesso de administrador:\n");
                                strread = read.nextLine();
                                if(biblio.setAdmin(strread, true)){
                                    System.out.println("Adicionado com sucesso.\n");
                                }
                                else{
                                    System.out.println("Usuario não encontrado.\n");
                                }
                                break;
                            case "R":
                            case "r":
                                System.out.println("\nDigite o usuario que ira remover acesso de administrador:\n");
                                strread = read.nextLine();
                                if(biblio.setAdmin(strread, false)){
                                    System.out.println("Removido com sucesso.\n");
                                }
                                else{
                                    System.out.println("Usuario não encontrado.\n");
                                }
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
                                biblio.listarUsuarios();
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
                            case "9":
                                alugar();
                                pularlinhas(100);
                                System.out.println("\n\nProcesso concluido.");
                                break;
                            case "10":
                                devolver();
                                break;
                            case "11":
                                buscar();
                                pularlinhas(100);
                                System.out.println("\n\nBusca concluida.");
                                break;
                            case "12":
                                deletar();
                                break;
                            case "13":
                                System.out.println("SGB - Listando itens Atrasados");
                                if(biblio.listarAtrasados() == 0)
                                {
                                     System.out.println("\n\nNenhum item atrasado!");
                                }
                                break;
                        }
                    }
                    else{
                       System.out.println("SGB  -  Menu Basico"
                                + "\n\nListagens:"
                                + "\n1 - Livros"
                                + "\n2 - Apostilas"
                                + "\n3 - Textos"
                                + "\n\n4 - Realizar uma busca"
                               + "\n\nT - Trocar de usuario"); 
                        strread = read.nextLine();
                        pularlinhas(100);
                        switch (strread) {
                            case "1":
                                System.out.println("SGB - Listando Livros");
                                biblio.listarLivros();
                                break;
                            case "2":
                                System.out.println("SGB - Listando Apostilas");
                                biblio.listarApostilas();
                                break;
                            case "3":
                                System.out.println("SGB - Listando Textos");
                                biblio.listarTextos();
                                break;
                            case "4":
                                buscar();
                                pularlinhas(100);
                                System.out.println("\n\nBusca concluida.");
                                break;
                            case "T":
                            case "t":
                                estadomenu = 1;
                                break;
                        }
                    }
                    System.out.println("\n\nPrecione enter para voltar ao menu.");
                    read.nextLine();
                    
                }
                               
            }
        }
        private static void devolver(){
            //Metodo de devolução, chama devolver(0); para listar os livros se existir, retorna a quantidade de item
            //depois basta passar devolver(opção), deve se autenticar o usuario que esta devolvendo antes de usar.
            //Sem autenticação retorna -1
            //public int devolver(int opcao)
            pularlinhas(100);
            int etapa = 0;
            boolean continuardevolucao = true;
            while(continuardevolucao == true){
                    if(etapa == 0){
                        System.out.println("Prossiga com a autenticação do usuario que vai devolver o item:"
                                + "\n\n Digite o Login que deseja alugar este livro:\n");
                        strread3 = read.nextLine();
                        if(biblio.usuarioExiste(strread3)){ 
                            etapa = 1;
                        }
                        else
                        {
                            while(!biblio.usuarioExiste(strread3) || (continuardevolucao == true)){
                                pularlinhas(100);
                                System.out.println("Usuario não existe, tente novamente: (0 para desistir)");
                                strread3 = read.nextLine();
                                etapa = 1;
                                if(strread3.equals("0")){
                                    continuardevolucao = false;
                                    etapa = 0;
                                }
                            }
                        }
                    }
                    else if(etapa == 1){
                        pularlinhas(100);
                        System.out.println("Digite a senha:");
                        strread4 = read.nextLine();
                        if(biblio.autenticarAlugar(strread3,strread4)){
                            etapa = 2;
                        }
                        else
                        {
                            while(!biblio.autenticarAlugar(strread3,strread4) || (continuardevolucao == true)){
                                pularlinhas(100);
                                System.out.println("Senha não confere, tente novamente: (0 para desistir)");
                                strread4 = read.nextLine();
                                etapa = 2;
                                if(strread4.equals("0")){
                                    continuardevolucao = false;
                                    etapa = 1;
                                }
                            }
                        }
                    }else if(etapa == 2){
                        pularlinhas(100);
                        int status;
                        int itens = biblio.devolver(0);
                        if(itens == 0){
                            pularlinhas(100);
                            System.out.println("Usuario não possui itens alugados.\nAperte enter para sair.");
                        }
                        else if(itens > 0){
                            pularlinhas(100);
                            System.out.println("\n\nSelecione um dos itens de acordo com seu numero\n ou digite outro valor para sair.");
                            strread = read.nextLine();
                            if(strread.equals("1")){
                                if(biblio.devolver(1) == 1){
                                    pularlinhas(100);
                                    System.out.println("Devolvido com sucesso.\nAperte enter para sair.");
                                }
                            }
                            else if(strread.equals("2")){
                                if(biblio.devolver(2) == 1){
                                    pularlinhas(100);
                                    System.out.println("Devolvido com sucesso.\nAperte enter para sair.");
                                }
                            }
                            else if(strread.equals("3")){
                                if(biblio.devolver(3) == 1){
                                    pularlinhas(100);
                                    System.out.println("Devolvido com sucesso.\nAperte enter para sair.");
                                }
                            }
                            
                        }
                        else{
                            pularlinhas(100);
                            System.out.println("Encontramos um erro, tente novamente.\nAperte enter para sair.");
                        }
                        continuardevolucao = false;
                        read.nextLine();
                    }
            }
            
        }
        private static void buscar(){
                pularlinhas(100);
                System.out.println("\nDigite o termo de sua busca: (Titulo ou Autor)");
                strread = read.nextLine();
                pularlinhas(100);
                System.out.println("Livros:\n");
                int itensLivro = biblio.pesquisarAcervo(1, strread);
                if(itensLivro == 0){       
                    System.out.println("\nNenhum livro encontrado\n");
                }
                System.out.println("\nApostilas:\n");
                int itensApostila = biblio.pesquisarAcervo(2, strread);
                if(itensApostila == 0){       
                    System.out.println("\nNenhuma apostila encontrada\n");
                }
                System.out.println("\nTextos:\n");
                int itensTexto = biblio.pesquisarAcervo(3, strread);
                if(itensTexto == 0){       
                    System.out.println("\nNenhum texto encontrado\n");
                }
 
                System.out.println("\n\nPrecione enter para voltar ao menu.");
                read.nextLine();        
        }
        private static void deletar(){
            boolean parar = false;
            int tipoescolhido = 0;
            String textodoalugar;
            while (parar == false){
                pularlinhas(100);
                System.out.println("\nDigite o titulo do item:");
                textodoalugar = read.nextLine();
                pularlinhas(100);
                System.out.println("Livros:\n");
                int itensLivro = biblio.pesquisarAluguel(1, textodoalugar);
                if(itensLivro == 0){       
                    System.out.println("\nNenhum livro encontrado\n");
                }else{
                    if(biblio.disponivelAlugar(1,textodoalugar) > 0){
                        System.out.println("\n\nPara deletar o livro, digite: 1");
                    }
                    else{
                       System.out.println("\n\nLivros alugados não podem ser deletados");
                    }
                }
                System.out.println("\nApostilas:\n");
                int itensApostila = biblio.pesquisarAluguel(2, textodoalugar);
                if(itensApostila == 0){       
                    System.out.println("\nNenhuma apostila encontrada\n");
                }else{
                    if(biblio.disponivelAlugar(2,textodoalugar) > 0){
                        System.out.println("\n\nPara deletar a apostila, digite: 2");
                    }
                    else{
                       System.out.println("\n\nApostilas alugadas não podem ser deletadas");
                    }
                }
                System.out.println("\nTextos:\n");
                int itensTexto = biblio.pesquisarAluguel(3, textodoalugar);
                if(itensTexto == 0){       
                    System.out.println("\nNenhum texto encontrado\n");
                }else{
                    if(biblio.disponivelAlugar(3,textodoalugar) > 0){
                        System.out.println("\n\nPara deletar o texto, digite: 3");
                    }
                    else{
                       System.out.println("\n\nTextos alugados não podem ser deletados");
                    }
                }
                //Metodo de verificação de atrasos
                //Opcao 1 = Livro, 2 = Texto, 3 = Apostila
                //boolean temAtraso(int opcao)
                System.out.println("\nDigite 0 para buscar novamente, ou S para sair");
                strread2 = read.nextLine();         
                if((biblio.disponivelAlugar(3, textodoalugar) > 0) && (strread2.equals("3"))){  //Se estiver disponivel, e o cara escolheu a opção 3
                    biblio.removerTexto(textodoalugar);  
                    System.out.println("\nRemovido com sucesso!");                  //Cai no loop de alugar e ativa o parar pra quando sair da parte do aluguel, retornar ao menu
                    parar = true;
                }      
                else if((biblio.disponivelAlugar(2, textodoalugar) > 0) && (strread2.equals("2"))){
                    biblio.removerApostila(textodoalugar);  
                    System.out.println("\nRemovido com sucesso!");
                    parar = true;
                }      
                else if((biblio.disponivelAlugar(1, textodoalugar) > 0) && (strread2.equals("1"))){
                    biblio.removerLivro(textodoalugar);  
                    System.out.println("\nRemovido com sucesso!");
                    parar = true;
                }      
                else if(strread2.equals("s") || strread2.equals("S")){
                    parar = true;
                }   
            }
            read.nextLine();
        }
    
        private static void alugar(){
            boolean parar = false, continuaralugar = false;
            int tipoescolhido = 0;
            String textodoalugar;
            while (parar == false){
                pularlinhas(100);
                System.out.println("\nDigite o titulo do item:");
                textodoalugar = read.nextLine();
                pularlinhas(100);
                System.out.println("Livros:\n");
                int itensLivro = biblio.pesquisarAluguel(1, textodoalugar);
                if(itensLivro == 0){       
                    System.out.println("\nNenhum livro encontrado\n");
                }else{
                    if(biblio.disponivelAlugar(1,textodoalugar) > 0){
                        System.out.println("\n\nPara alugar o livro, digite: 1");
                    }
                }
                System.out.println("\nApostilas:\n");
                int itensApostila = biblio.pesquisarAluguel(2, textodoalugar);
                if(itensApostila == 0){       
                    System.out.println("\nNenhuma apostila encontrada\n");
                }else{
                    if(biblio.disponivelAlugar(2,textodoalugar) > 0){
                        System.out.println("\n\nPara alugar a apostila, digite: 2");
                    }
                }
                System.out.println("\nTextos:\n");
                int itensTexto = biblio.pesquisarAluguel(3, textodoalugar);
                if(itensTexto == 0){       
                    System.out.println("\nNenhum texto encontrado\n");
                }else{
                    if(biblio.disponivelAlugar(3,textodoalugar) > 0){
                        System.out.println("\n\nPara alugar o texto, digite: 3");
                    }
                }
                System.out.println("\nDigite 0 para buscar novamente, ou S para sair");
                strread2 = read.nextLine();         
                if((biblio.disponivelAlugar(3, textodoalugar) > 0) && (strread2.equals("3"))){  //Se estiver disponivel, e o cara escolheu a opção 3
                    tipoescolhido = 3;                                                          //Cai no loop de alugar e ativa o parar pra quando sair da parte do aluguel, retornar ao menu
                    continuaralugar = true;
                    parar = true;
                }      
                else if((biblio.disponivelAlugar(2, textodoalugar) > 0) && (strread2.equals("2"))){
                    tipoescolhido = 2;
                    continuaralugar = true;
                    parar = true;
                }      
                else if((biblio.disponivelAlugar(1, textodoalugar) > 0) && (strread2.equals("1"))){
                    tipoescolhido = 1;
                    continuaralugar = true;
                    parar = true;
                }      
                else if(strread2.equals("s") || strread2.equals("S")){
                    parar = true;
                }   
                int etapa = 0;
                pularlinhas(100);
                while(continuaralugar == true){
                    if(etapa == 0){
                        System.out.println("Livro selecionado, Prosiga com a autenticação do usuario que vai alugar:"
                                + "\n\n Digite o Login que deseja alugar este livro:\n");
                        strread3 = read.nextLine();
                        if(biblio.usuarioExiste(strread3)){ 
                            etapa = 1;
                        }
                        else
                        {
                            while(!biblio.usuarioExiste(strread3) || (continuaralugar == true)){
                                pularlinhas(100);
                                System.out.println("Usuario não existe, tente novamente: (0 para desistir)");
                                strread3 = read.nextLine();
                                etapa = 1;
                                if(strread3.equals("0")){
                                    continuaralugar = false;
                                    etapa = 0;
                                }
                            }
                        }
                    }
                    else if(etapa == 1){
                        pularlinhas(100);
                        System.out.println("Digite a senha:");
                        strread4 = read.nextLine();
                        if(biblio.autenticarAlugar(strread3,strread4)){
                            etapa = 2;
                        }
                        else
                        {
                            while(!biblio.autenticarAlugar(strread3,strread4) || (continuaralugar == true)){
                                pularlinhas(100);
                                System.out.println("Senha não confere, tente novamente: (0 para desistir)");
                                strread4 = read.nextLine();
                                etapa = 2;
                                if(strread4.equals("0")){
                                    continuaralugar = false;
                                    etapa = 1;
                                }
                            }
                        }
                    }else if(etapa == 2){
                        pularlinhas(100);
                        boolean sucesso = false;
                        if(strread2.equals("1")){
                            System.out.println("AlugaLivro chamado" + textodoalugar);
                            sucesso = biblio.alugarLivro(textodoalugar);
                            
                        }else if(strread2.equals("2")){
                            sucesso = biblio.alugarApostila(textodoalugar);
                        }else if(strread2.equals("3")){
                            sucesso = biblio.alugarTexto(textodoalugar);
                        }
                        pularlinhas(100);
                        if(sucesso == false){      
                            System.out.println("Aconteceu um erro, tente novamente!\nAperte enter para sair!");
                            continuaralugar = false;
                            read.nextLine();
                        }
                        else{
                            System.out.println("Livro alugado com sucesso!\n Aperte enter para sair!");
                            continuaralugar = false;
                            read.nextLine();
                        }
                       
                    }
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
                        System.out.println("\nQual o titulo: (4+ caracteres)");
                        strread = read.nextLine();
                        System.out.println("\nQuem escreveu: (4+ caracteres)");
                        strread2 = read.nextLine();
                        System.out.println("\nQual o ISBN: (13 caracteres)");
                        strread3 = read.nextLine();
                        System.out.println("\nQual a edição: (1+ caracteres)");
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
                            if(!confirmacao.equals("0")){
                                try {
                                    biblio.cadastrarLivro(strread, strread2, strread3,  Integer.parseInt(strread4));
                                    concluido = true;
                                } catch (biblioteca.exceptions.ISBNInvalidoException isbnerror) {
                                    pularlinhas(100);
                                    System.out.println("\n" + isbnerror.getMessage() + "\n Verifique e tente novamente!\n");
                                }
                                    
                            }else{
                                pularlinhas(100);
                            }
                        }
                    }   
                    break;
                case 2:
                    while (concluido == false){
                        //biblio.cadastrarApostila(titulo, autor);
                        System.out.println("\nQual o titulo: (4+ caracteres)");
                        strread = read.nextLine();
                        System.out.println("\nQuem escreveu: (4+ caracteres)");
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
                        System.out.println("\nQual o titulo: (4+ caracteres)");
                        strread = read.nextLine();
                        System.out.println("\nQuem escreveu: (4+ caracteres)");
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
                        System.out.println("\nNome completo do usuario: (10+ caracteres)");
                        strread = read.nextLine();
                        System.out.println("\nEndereço completo: (10+ caracteres)");
                        strread2 = read.nextLine();
                        System.out.println("\nCPF: (11 caracteres - Válido)");
                        strread3 = read.nextLine();
                        System.out.println("\nLogin: (6+ caracteres)");
                        strread4 = read.nextLine();
                        System.out.println("\nSenha: (6+ caracteres)");
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
                                try{
                                biblio.cadastrarUsuario(strread, strread2, strread3, strread4, strread5);
                                concluido = true;
                                }catch(biblioteca.exceptions.CPFInvalidoException cpfinvalido){
                                    pularlinhas(100);
                                    System.out.println("\n" + cpfinvalido.getMessage() + "\n Verifique e tente novamente!\n");
                                }catch(biblioteca.exceptions.LoginRepetidoException loginrepetido){
                                    pularlinhas(100);
                                    System.out.println("\n" + loginrepetido.getMessage() + "\n Verifique e tente novamente!\n");
                                }
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
