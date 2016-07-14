/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.usuario.Usuario;
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
    Scanner input = new Scanner(System.in);
    
    
    public Biblioteca() {
        
    }
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    //Método para cadastrar o usuário
    public void cadastrarUsuario(){
    	
    	int codUser = input.nextInt();
    	users[contuser].setCodUsuario(codUser);
    	
    	String nomeUser = input.next();
    	users[contuser].setNome(nomeUser);
    	
    	String EndUser = input.next();
    	users[contuser].setEndereco(EndUser);
    	
    	String cpfUser = input.next();
    	users[contuser].setCpf(cpfUser);
    	
    	String loginUser = input.next();
    	users[contuser].setUsuario(loginUser);
    	
    	String senhaUser = input.next();
    	users[contuser].setSenha(senhaUser);
    	
    	contuser+=1;
    }

    public boolean logarUsuario(String usuario, String senha) {
    	 //verificador se o login do usuário está válido
    	boolean confirm = false;
    	//Verificar usuario e senha, retornar true se valido e false se invalido
    	for(int i = 0; i < contuser; i++){
    		if((usuario==users[i].getUsuario()) && (senha==users[i].getSenha())){
    			confirm = true;
    		}	
    	} 
    	return confirm;
    }
}
