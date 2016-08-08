/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.exceptions;

/**
 *
 * @author gustavoguerino
*/
public class ISBNInvalidoException extends RuntimeException {

  public ISBNInvalidoException(String valor) {
    super("O ISBN Digitado: " + valor + " é invalido.");
  }
}