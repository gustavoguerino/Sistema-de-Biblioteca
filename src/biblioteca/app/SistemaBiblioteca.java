package biblioteca.app;

import java.util.Scanner;
import biblioteca.*;

    public class SistemaBiblioteca {
        static Biblioteca biblio; 
        private static boolean pararloop;
        private static int menumsg;
        private static String strread, strread2;
        private static Scanner read = new Scanner(System.in); 
                
                
	public static void main(String[] args) {
            biblio = new Biblioteca(); 
            pararloop = false;
            menumsg = 1;
            biblio.cadastrarUsuario("Gustavo Guerino", "Rua Logo Ali", "34348227802", "teste", "123456");
            //Loop Principal:
           
            while (!pararloop) {
                pularlinhas(20);
                while(menumsg != 1 || menumsg != 2){
                    mensagensmenu();
                    strread = read.next();  
                    menumsg = 2;
                    pularlinhas(20);
                    mensagensmenu();
                    strread2 = read.next();
                    if(biblio.logarUsuario(strread, strread2))   
                        menumsg = 3;
                    else{
                        menumsg = 1;  
                        pularlinhas(20);
                        System.out.println("Senha incorreta!");
                    }
                             
                }
                               
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
