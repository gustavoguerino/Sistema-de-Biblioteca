package biblioteca.usuario;

import biblioteca.acervo.*;

public class Usuario implements InterfaceUsuario{
    //==============Gustavo=================================================================================
    //Para fazer referencia ao item escolhido mudei a interface da fun escolherItemAcervo, nao fazia sentido 
    //Se quiser mudar fique avontade..
    //======================================================================================================
    private int codUsuario;
    private String nome, endereco, cpf, usuario, senha;
    private boolean possuiItemAlugado, possuiApostilaAlugada, possuiLivroAlugado, possuiTextoAlugado;
    private ItemAcervo alugou;
    
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
	public ItemAcervo getAlugou() {
		return alugou;
	}
	public void setAlugou(ItemAcervo alugou) {
		this.alugou = alugou;
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
    public void pagar() {
	//==========Gustavo=============================
        // Verifica se o usuario alugou algo, e se alugou setPago para true no objeto.
        // 
        //=============================================
	if((!alugou.estaPago()) && (alugou != null)){
            alugou.setPago(true);
        }
    }
    public boolean devendo(){
        if((alugou != null)){
            return alugou.estaPago();
        }
        else{
            return false;
        }
    }
    public void escolherItemAcervo(ItemAcervo itemEscolhido){
           alugou = itemEscolhido;
    }
    
    //metodos para armazenar o item q o usuario alugou.
	public void apostilaAlugada(Apostila apostila){}
	public void textoAlugado(Texto texto){}
	public void livroAlugado(Livro livro){}

    @Override
    public boolean temAtraso() {
        return false;
    }

}
