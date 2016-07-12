package biblioteca.acervo;
import biblioteca.usuario.Usuario;
import java.time.*;


/**
 * @author Mauro
 *
 */
public class ItemAcervo implements InterfaceItemAcervo {

	private double custo;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private LocalDate reservaLivro;
	private Period diasDevolucao;
	private boolean pago = true;
	private boolean disponivel = true;
        private Usuario user;


	//Met�dos Getters and Setters, eles est�o ocultos, qualquer coisa clique no "+"
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public LocalDate getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(LocalDate dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}




	
	//Construtor
	public ItemAcervo(){}

	//M�todos do acervo
	public void alugar(Usuario user){
		//a data nesse m�todo � baseada na API Java.Time, qualquer coisa: "http://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/"
		//antes de tudo, temos que verificar se o item est� disponivel.
		if(disponivel == true){
			//O programa reclamou quando porqu� eu n�o inicializei o dia,mes e ano.. ent�o atribui
			//o valor 0.
			int dia = 0, mes = 0, ano = 0;
			dataAluguel = LocalDate.now();
			dataDevolucao = LocalDate.of(dia, mes, ano);
                        this.user = user;
		}

		else{
			//por enquanto, aqui n�o vai ter nada
			//vou ver se eu crio um exception ou algo do tipo.
		}

	}


	public void devolver(){
		//Para devolver, o Java.time usa um m�todo chamado Period.between()
		//que compara as datas de alguel e de devolucao.
		diasDevolucao = Period.between(dataAluguel,dataDevolucao);
		if(diasDevolucao.getDays()<=0 && diasDevolucao.getMonths()<=0 && diasDevolucao.getMonths()<=0){
			//Aqui vai ter algum tipo de multa pro meliante.. xD
			//vamos pensar depois.
		}
		else{
			//Aqui o meliante escapou.
			disponivel = true;
                        user = null;
		}
	}


	public boolean estaPago(){
		//aqui por enquanto eu n�o posso fazer nada,
		//mas pensei em algo como se o meliante atrasasse a multa
		//a gente acrescentasse um dinherin a mais na multa.
                
                //
		return pago;
	}

	public void reservar(int codigoUsuario){
		//aqui o usu�rio ira reservar o livro
                
                
                // =================== Gustavo ==========================================================================
                // Reservar tem que verificar se ele ja não foi reservado pra mais ninguem, e a reserva só pode ser feita
                // se o livro estiver alugado, se não não faria sentido ter que reservar!
                // ======================================================================================================
                
                if(disponivel == true){
                    
                }
                else {
                    int ano = 0,mes = 0,dia = 0;
                    reservaLivro = LocalDate.of(ano,mes,dia);
                    LocalDate now = LocalDate.now();
                    Period comparar = Period.between(now, reservaLivro);
                    if(comparar.getMonths()<=0 && comparar.getDays()<=0 && comparar.getYears()<=0 ){
                            disponivel = false;
                            dataAluguel = LocalDate.now();
                            //aqui teremos que fazer alguma mudan�a, mas o que vale por enquanto � a l�gica.
                            dataDevolucao = LocalDate.of(dia, mes, ano);
                    }
                }
	}

}
