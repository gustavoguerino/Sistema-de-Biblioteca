package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {
        static Biblioteca biblio; 
        static JFrameInicio inicio;
        static JFrameCadastro cadastro;
        static JFramePrincipal principal;
	public static void main(String[] args) {
            biblio = new Biblioteca(); 
           // inicio = new JFrameInicio(biblio);
           // inicio.setTitle("Tela Inicial");
          //  inicio.setVisible(true);
          //  biblio.cadastrarUsuario("Teste", "Rua sem nome", "34348227802", "teste", "gustavo");
          teste();
        }
        public static void chamarCadastro(){
            cadastro = new JFrameCadastro(biblio);   
            cadastro.setTitle("Cadastro de Usuários");
            cadastro.setVisible(true);
        }
        public static void teste(){
            principal = new JFramePrincipal(biblio);   
            principal.setTitle("SGB - 0.00000000001A beta");
            principal.setVisible(true);
        }
    }
