/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.usuario;

import biblioteca.acervo.*;

/**
 *
 * @author gustavoguerino
 */
public interface InterfaceUsuario {
    void apostilaAlugada(Apostila apostila);
    void textoAlugado(Texto texto);
    void livroAlugado(Livro livro);
    boolean temAtraso(int opcao);
}
