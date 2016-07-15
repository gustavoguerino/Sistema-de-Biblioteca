/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author gustavoguerino
 */
public interface InterfaceBiblioteca {
    boolean logarUsuario(String usuario, String senha);
    void cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser);
} 
