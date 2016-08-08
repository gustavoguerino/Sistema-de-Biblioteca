package biblioteca.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavoguerino
 */
public class LoginRepetidoException  extends RuntimeException {
    public LoginRepetidoException(String valor) {
        super("O Login Digitado: " + valor + " é invalido.");
    }
}
