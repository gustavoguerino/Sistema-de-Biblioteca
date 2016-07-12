/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.usuario;

import biblioteca.acervo.ItemAcervo;

/**
 *
 * @author gustavoguerino
 */
public interface InterfaceUsuario {
    void pagar();
    void escolherItemAcervo(ItemAcervo itemEscolhido);
}
