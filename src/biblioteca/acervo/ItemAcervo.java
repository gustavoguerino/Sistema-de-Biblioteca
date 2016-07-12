package biblioteca.acervo;
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


	//Metódos Getters and Setters, eles estão ocultos, qualquer coisa clique no "+"
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

	//Métodos do acervo
	public void alugar(){
		//a data nesse método é baseada na API Java.Time, qualquer coisa: "http://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/"
		//antes de tudo, temos que verificar se o item está disponivel.

		if(disponivel == true){
			//O programa reclamou quando porquê eu não inicializei o dia,mes e ano.. então atribui
			//o valor 0.
			int dia = 0, mes = 0, ano = 0;
			dataAluguel = LocalDate.now();
			dataDevolucao = LocalDate.of(dia, mes, ano);
		}

		else{
			//por enquanto, aqui não vai ter nada
			//vou ver se eu crio um exception ou algo do tipo.
		}

	}


	public void devolver(){
		//Para devolver, o Java.time usa um método chamado Period.between()
		//que compara as datas de alguel e de devolucao.
		diasDevolucao = Period.between(dataAluguel,dataDevolucao);
		if(diasDevolucao.getDays()<=0 && diasDevolucao.getMonths()<=0 && diasDevolucao.getMonths()<=0){
			//Aqui vai ter algum tipo de multa pro meliante.. xD
			//vamos pensar depois.
		}
		else{
			//Aqui o meliante escapou.
			disponivel = true;
		}
	}


	public boolean estaPago(){
		//aqui por enquanto eu não posso fazer nada,
		//mas pensei em algo como se o meliante atrasasse a multa
		//a gente acrescentasse um dinherin a mais na multa.
		return pago;
	}

	public void reservar(int codigoUsuario){
		//aqui o usuário ira reservar o livro
		int ano = 0,mes = 0,dia = 0;
		reservaLivro = LocalDate.of(ano,mes,dia);
		LocalDate now = LocalDate.now();
		Period comparar = Period.between(now, reservaLivro);
		if(comparar.getMonths()<=0 && comparar.getDays()<=0 && comparar.getYears()<=0 ){
			disponivel = false;
			dataAluguel = LocalDate.now();
			//aqui teremos que fazer alguma mudança, mas o que vale por enquanto é a lógica.
			dataDevolucao = LocalDate.of(dia, mes, ano);
		}
	}

}
