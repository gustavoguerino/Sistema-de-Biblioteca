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
public class Biblioteca implements InterfaceBiblioteca {
    private String nomeBiblioteca = "Biblioteca IFRN";
    public Biblioteca() {
        
    }
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public boolean logarUsuario(String usuario, String senha) { //Verificar usuario e senha, retornar true se valido e false se invalido
        return false; //Se retornar True logar usuario!
    }
}
