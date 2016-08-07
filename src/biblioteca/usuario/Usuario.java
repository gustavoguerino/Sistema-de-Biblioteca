package biblioteca.usuario;

import biblioteca.acervo.*;
import java.time.LocalDate;

public class Usuario implements InterfaceUsuario{
    //==============Gustavo=================================================================================
    //Para fazer referencia ao item escolhido mudei a interface da fun escolherItemAcervo, nao fazia sentido 
    //Se quiser mudar fique avontade..
    //======================================================================================================
    private int codUsuario;
    private String nome, endereco, cpf, usuario, senha;
    private boolean possuiApostilaAlugada, possuiLivroAlugado, possuiTextoAlugado;
    private Apostila apostilaarm;
    private Livro livroarm;
    private Texto textoarm;
    
    public int getCodUsuario() {
        return codUsuario;
    }
    public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }      
        public boolean isPossuiLivroAlugado() {
		return possuiLivroAlugado;
	}
	public void setPossuiLivroAlugado(boolean possuiLivroAlugado) {
		this.possuiLivroAlugado = possuiLivroAlugado;
	}
         public boolean isPossuiApostilaAlugada() {
		return possuiApostilaAlugada;
	}
	public void setPossuiApostilaAlugada(boolean possuiApostilaAlugada) {
		this.possuiApostilaAlugada = possuiApostilaAlugada;
	}
         public boolean isPossuiTextoAlugado() {
		return possuiTextoAlugado;
	}
	public void setPossuiTextoAlugado(boolean possuiTextoAlugado) {
		this.possuiTextoAlugado = possuiTextoAlugado;
	}//possuiApostilaAlugada, possuiLivroAlugado, possuiTextoAlugado;
	
	public Usuario(){
		
    }
    //metodos para armazenar o item q o usuario alugou.
	public void apostilaAlugada(Apostila apostila){
            apostilaarm = apostila;
        }

    public Apostila getApostilaarm() {
        return apostilaarm;
    }

    public Livro getLivroarm() {
        return livroarm;
    }

    public Texto getTextoarm() {
        return textoarm;
    }
	public void textoAlugado(Texto texto){
            textoarm = texto;
        }
	public void livroAlugado(Livro livro){
            livroarm = livro;
        }
    //Opcao 1 = Livro, 2 = Texto, 3 = Apostila
    //boolean temAtraso(int opcao)
    public boolean temAtraso(int opcao) {
        if(opcao == 1){
            if(isPossuiLivroAlugado()){
                if(!livroarm.dataEntrega(livroarm.diaDevolucao(), livroarm.diaAlugado())){
                    return true;
                }
            }
        }
        if(opcao == 2){
            if(isPossuiTextoAlugado()){
                if(!textoarm.dataEntrega(textoarm.diaDevolucao(), textoarm.diaAlugado())){
                    return true;
                }
            }
        }
        if(opcao == 3){
            if(isPossuiApostilaAlugada()){
                if(!apostilaarm.dataEntrega(apostilaarm.diaDevolucao(), apostilaarm.diaAlugado())){
                    return true;
                }
            }
        }
        return false;
    }

}
