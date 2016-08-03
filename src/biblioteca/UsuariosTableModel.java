package biblioteca;

import biblioteca.usuario.Usuario;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavoguerino
 */
public class UsuariosTableModel extends AbstractTableModel {
   private final Usuario[] users;
   public UsuariosTableModel(Usuario[] users) {
        this.users = users;
   }

 

   @Override

   public int getColumnCount() {

     return 2;

   }

 

   @Override

   public int getRowCount() {

     return users.length;

   }

 

   @Override

   public Object getValueAt(int rowIndex, int columnIndex) {

     Usuario n = users[rowIndex];

     

     switch (columnIndex) {

     case 0:

       return n.getCodUsuario();

     case 1:

       return n.getNome();
     }

     return null;

   }
}