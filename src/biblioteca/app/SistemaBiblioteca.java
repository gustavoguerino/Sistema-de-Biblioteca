package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;
public class SistemaBiblioteca {

	public static void main(String[] args) {
            Biblioteca biblio = new Biblioteca();   
            System.out.println("Sistema de adminsitração de bibliotecas\nDesenvolvido por Mauro Carvalho e Gustavo Guerino");
            Scanner ler = new Scanner(System.in);
            
	}
        private static void menu(){
            System.out.println("1 -Ver Livros disponiveis"
                    + "2 - Alugar Item"
                    + "3 - Devolver Item"
                    + "4 - Pagar"
                    + "5 - Reservar");
        }   

}
