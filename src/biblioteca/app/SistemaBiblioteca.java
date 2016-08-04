package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {
        static Biblioteca biblio; 
        private static boolean pararloop;
        private static int menumsg;
	public static void main(String[] args) {
            biblio = new Biblioteca(); 
            pararloop = false;
            //Loop Principal:
            pularlinhas(10);
            while (!pararloop) {
                menumsg = 1;
                mensagensmenu();
            }
        }
        private static void titulo(){
            switch (menumsg) {
                case 1:
                case 2:
                    System.out.println("SGB  -  Entrada\n");
                    break;

            }
        }
        private static void mensagensmenu(){
            titulo();
            switch (menumsg) {
                case 1:
                    System.out.println("Login: ");
                    break;
                case 2:
                    System.out.println("Senha: ");
                    break;

            }
                    
        }
        private static void pularlinhas(int linhas){
            for (int x = 0; x < linhas; x++) {
                System.out.println(" ");
            }
        }
    }
