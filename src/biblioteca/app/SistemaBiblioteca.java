package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {

	public static void main(String[] args) {
            Biblioteca biblio = new Biblioteca();   
            JFrameInicio inicio = new JFrameInicio(biblio);
            inicio.setTitle("Tela Inicial");
            inicio.setVisible(true);
            biblio.cadastrarUsuario("Teste", "Rua sem nome", "343.482.278.02", "teste", "gustavo");
        }
        public void chamarCadastro(){
            
        }
    }
