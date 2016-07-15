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
    public void cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser){
        for(int i = 0; i < users.length; i++){
            if(users[i] == null){
                users[i] = new Usuario();
                users[i].setCodUsuario(i);
                users[i].setNome(nomeUser);
                users[i].setEndereco(endUser);
                users[i].setCpf(cpfUser);
                users[i].setUsuario(loginUser);
                users[i].setSenha(senhaUser);
                break;
            }
        }
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
